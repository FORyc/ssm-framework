package com.service.impl;

import com.annotation.ExecutionTime;
import com.dao.StudentDAO;
import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public Student queryOne(String id) {
        return studentDAO.queryOne(id);
    }

    @ExecutionTime
    @Override
    public List<Student> queryAll() {
        return studentDAO.queryAll();
    }
}
