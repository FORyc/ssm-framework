package com.student;

import com.BaseTestClass;
import com.entity.Student;
import com.service.StudentService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentTest extends BaseTestClass {
    @Autowired
    private StudentService studentService;

    @Test
    public void test(){
        List<Student> studentList = studentService.queryAll();
        studentList.stream().forEach(System.out::println);
    }
}
