package com.example.controller;

import com.example.POJO.Student;
import com.example.service.Interface.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/19 10:17 下午
 */
@Controller
public class StudentController {
    @Autowired
    private IStudentService studentService;



}
