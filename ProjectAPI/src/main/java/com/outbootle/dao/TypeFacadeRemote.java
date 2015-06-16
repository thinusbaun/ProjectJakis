/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.outbootle.dao;

import com.outbootle.model.Type;
import java.util.List;
import javax.ejb.Remote;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Olaa
 */
@Component
@Transactional
@Remote
public interface TypeFacadeRemote {

    void create(Type type);

    void edit(Type type);

    void remove(Type type);

    Type find(Object id);

    List<Type> findAll();

    List<Type> findRange(int[] range);

    int count();
    
}
