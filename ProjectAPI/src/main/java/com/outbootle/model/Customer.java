/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbootle.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author Olaa
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")})
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private Integer id;
    private String email;
    private String login;
    private String name;
    private String password;
    private String surname;
    @JoinColumn(name = "ID_TYPE_OF_LEVEL_OF_CUSTOMER", referencedColumnName = "ID")
    @ManyToOne
    private TypeOfLevelOfCustomer idTypeOfLevelOfCustomer;
    @JoinColumn(name = "ID_TYPE_OF_CUSTOMER", referencedColumnName = "ID")
    @ManyToOne
    private TypeOfCustomer idTypeOfCustomer;
    @JoinColumn(name = "ID_TYPE_OF_ADMINISTRATOR", referencedColumnName = "ID")
    @ManyToOne
    private TypeOfAdministrator idTypeOfAdministrator;
    @OneToMany(mappedBy = "idCustomer")
    private List<Purchase> purchaseList;

    public Customer() {
    }

    public Customer(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public TypeOfLevelOfCustomer getIdTypeOfLevelOfCustomer() {
        return idTypeOfLevelOfCustomer;
    }

    public void setIdTypeOfLevelOfCustomer(TypeOfLevelOfCustomer idTypeOfLevelOfCustomer) {
        this.idTypeOfLevelOfCustomer = idTypeOfLevelOfCustomer;
    }

    public TypeOfCustomer getIdTypeOfCustomer() {
        return idTypeOfCustomer;
    }

    public void setIdTypeOfCustomer(TypeOfCustomer idTypeOfCustomer) {
        this.idTypeOfCustomer = idTypeOfCustomer;
    }

    public TypeOfAdministrator getIdTypeOfAdministrator() {
        return idTypeOfAdministrator;
    }

    public void setIdTypeOfAdministrator(TypeOfAdministrator idTypeOfAdministrator) {
        this.idTypeOfAdministrator = idTypeOfAdministrator;
    }

    public List<Purchase> getPurchaseList() {
        return purchaseList;
    }

    public void setPurchaseList(List<Purchase> purchaseList) {
        this.purchaseList = purchaseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.outbootle.model.Customer[ id=" + id + " ]";
    }
    
}
