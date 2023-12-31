/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.repository;

import com.tqk.pojo.Chuyenxe;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public interface ChuyenXeRepository {
    List<Chuyenxe> getCX(Map<String,String> params);
    
    Chuyenxe getChuyenxeById(int id);
    
    boolean addOrUpdate(Chuyenxe cx);
    
    boolean delete(Chuyenxe cx);

}
