/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.repository.impl;

import com.tqk.pojo.Benxe;
import com.tqk.repository.BenxeRepository;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ADMIN
 */
@Repository
@Transactional
public class BenxeRepositoryImpl implements BenxeRepository{

    @Autowired
    private LocalSessionFactoryBean factory;
    
    @Override
    public List<Benxe> getBX() {
        Session session = this.factory.getObject().getCurrentSession();
        Query query = session.createQuery("from Benxe");

        return query.getResultList();
    }
    
}
