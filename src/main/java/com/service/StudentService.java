package com.service;

import com.entity.Student;

import java.util.List;

public interface StudentService {
    Student queryOne(String id);
    List<Student> queryAll();
}
