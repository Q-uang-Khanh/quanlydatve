/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tqk.controllers;



import com.tqk.pojo.Chuyenxe;
import com.tqk.service.BenxeService;
import com.tqk.service.ChuyenxeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ADMIN
 */
@Controller
public class IndexController {
    @Autowired
    private ChuyenxeService ChuyenxeService;
    
    @Autowired
    private BenxeService BenxeService;
    
    @RequestMapping("/")
    @Transactional
    public String index(Model model){
        
        model.addAttribute("Chuyenxe", this.ChuyenxeService.getCX());
        return "index";
    }
    
    
    @GetMapping("/ChuyenXe")
    public String view(Model model){
        model.addAttribute("chuyenXe", new Chuyenxe());
        model.addAttribute("ben", this.BenxeService.getBX());
        return "ChuyenXe";
    }
    
    @PostMapping("/ChuyenXe")
    public String add(@ModelAttribute (value = "chuyenXe") Chuyenxe cx, Model model){
        if (ChuyenxeService.add(cx) == true)
            return "index";
        
        model.addAttribute("msg", "Co loi xay ra, vui long thu lai...");
        return "ChuyenXe";
    }
}