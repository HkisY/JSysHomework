package com.example.controller;

import com.example.POJO.Postgraduate;
import com.example.POJO.Student;
import com.example.POJO.Undergraduate;
import com.example.service.StudentServiceImpl;
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
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping("/toUpdatePage")
    public String toUpdatePage(){
        return "updateStudent";
    }

    @RequestMapping("/toSelectPage")
    public String toSelectPage(){
        return "selectPage";
    }

    @RequestMapping("/addUndergraduate")
    public String addUndergraduate(Undergraduate undergraduate){
        studentService.addStudent(undergraduate);
        return "redirect:/allUndergraduate";
    }

    @RequestMapping("/addPostgraduate")
    public String addPostgraduate(Postgraduate postgraduate){
        studentService.addStudent(postgraduate);
        return "redirect:/allUndergraduate";
    }

    @RequestMapping("/toAddUnder")
    public String toAddUnderPage(){
        return "addUndergraduate";
    }

    @RequestMapping("/toAddPost")
    public String toAddPostPage(){
        return "addPostgraduate";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        //ajax异步增加 用户输入type_num后后续输入词条的变换
        if (student.getTypeNum()==1){
            studentService.addStudent((Undergraduate) student);
            return "redirect:/student/allStudent";
        }else if (student.getTypeNum() == 2){
            studentService.addStudent((Postgraduate) student);
        }
        return "redirect:/student/allStudent";
    }

    @RequestMapping("/allUndergraduate")
    public String allUndergraduate(Model model){
        List<Undergraduate> list = studentService.findAllUndergraduate();
        model.addAttribute("list",list);
        return "allUndergraduate";
    }

    @RequestMapping("/allPostgraduate")
    public String allPostgraduate(Model model){
        List<Postgraduate> list = studentService.findAllPostgraduate();
        model.addAttribute("list",list);
        return "allPostgraduate";
    }

}
