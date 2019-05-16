package com.thanhphuong.dao;

import com.thanhphuong.model.Admin;
//import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
public interface AdminDAO {
    List<Admin> getAllAdmin();
}
