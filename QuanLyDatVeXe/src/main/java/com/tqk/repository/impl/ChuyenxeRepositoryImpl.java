/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.repository.impl;

import com.tqk.pojo.Chuyenxe;
import com.tqk.repository.ChuyenXeRepository;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.HibernateException;
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
public class ChuyenxeRepositoryImpl implements ChuyenXeRepository{
    @Autowired
    private LocalSessionFactoryBean factory;

//    @Override
//    public List<Chuyenxe> getCX() {
//        Session session = this.factory.getObject().getCurrentSession();
//        Query query = session.createQuery("from Chuyenxe");
//
//        return query.getResultList();
//    }

    @Override
    public Chuyenxe getChuyenxeById(int id) {
        Session session = this.factory.getObject().getCurrentSession();
        return session.get(Chuyenxe.class, id);
    }

    @Override
    public boolean addOrUpdate(Chuyenxe cx) {
        Session session = this.factory.getObject().getCurrentSession();
        try {
            if (cx.getIDChuyenXe()== null) {
                session.save(cx);
            } else {
                session.update(cx);
            }
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(Chuyenxe cx) {
        Session session = this.factory.getObject().getCurrentSession();
        try {
            session.delete(cx);
            return true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Chuyenxe> getCX(Map<String, String> params) {
        
    }
    
    
}
