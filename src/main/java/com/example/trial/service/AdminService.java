package com.example.trial.service;

import com.example.trial.dao.AdminDao;
import com.example.trial.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    AdminDao adminRepo;

    public Admin save(Admin admin) {
        return adminRepo.save(admin);
    }

    public List<Admin> getAllAdmins() {
        return adminRepo.findAll();
    }


}
