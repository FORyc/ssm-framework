package com.dao;

import com.entity.Student;

import java.util.List;

public interface StudentDAO {
    Student queryOne(String id);
    List<Student> queryAll();
}
