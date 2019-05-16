package com.thanhphuong.controller;

import com.thanhphuong.model.Admin;
import com.thanhphuong.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainController {
    @Autowired
    AdminService adminService;

    @RequestMapping("/")
    public String index() {
        List<Admin> adminList = adminService.getAllAdmin();
        System.out.println(adminList.size());
        return "index";
    }
}
