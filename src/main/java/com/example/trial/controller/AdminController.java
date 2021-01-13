package com.example.trial.controller;

import com.example.trial.entity.Admin;
import com.example.trial.service.AdminService;
import com.example.trial.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @Autowired
    PassengerService passengerService;

    @PostMapping("/adminRegister")
    public Admin adminRgister(Admin admin){
        return adminService.save(admin);
    }

    @GetMapping("getAllAdmin")
    public List<Admin> getAllAdmin(){
        return adminService.getAllAdmins();
    }
}
