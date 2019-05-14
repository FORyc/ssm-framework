package com.controller;

import com.entity.Student;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/queryOne")
    @ResponseBody
    public Student queryOne(@RequestParam("sid")String id){
        return studentService.queryOne(id);
    }

    @RequestMapping(value = "/queryAll")
    @ResponseBody
    public List<Student> queryAll(){
        return studentService.queryAll();
    }
}
