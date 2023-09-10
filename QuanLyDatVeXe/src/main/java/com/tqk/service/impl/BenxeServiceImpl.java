/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.service.impl;

import com.tqk.pojo.Benxe;
import com.tqk.repository.BenxeRepository;
import com.tqk.service.BenxeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ADMIN
 */
@Service
public class BenxeServiceImpl implements BenxeService{

    @Autowired
    private BenxeRepository repo;
    
    @Override
    public List<Benxe> getBX() {
        return this.repo.getBX();
    }
    
}
