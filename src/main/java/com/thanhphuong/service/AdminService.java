package com.thanhphuong.service;

import com.thanhphuong.dao.AdminDAO;
import com.thanhphuong.model.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService implements AdminDAO {
    @Autowired
    SessionFactory sessionFactory;

    public List<Admin> getAllAdmin() {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        List<Admin> adminList = session.createQuery("from Admin ", Admin.class).getResultList();
        return adminList;
    }
}
