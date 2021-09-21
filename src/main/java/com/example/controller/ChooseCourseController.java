package com.example.controller;

import com.example.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/20 3:30 下午
 */
@Controller
@RequestMapping("/chose")
public class ChooseCourseController {
    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping("/toSelectCoursePage")
    public String toSelectPage(){
        return "selectCoursePage";
    }

    @RequestMapping("/selectCourse")
    public String selectCourse(@RequestParam("studentId") String studentId,@RequestParam("courseId") String courseId){
        //判断逻辑  本科生学分限制与研究生学分限制
        int i = Integer.parseInt(studentId);
        int j = Integer.parseInt(courseId);
        System.out.println("p----------------"+i+j);
        studentService.addCourseForStudent(i,j);
        return "redirect:/course/allCourse";
    }

    @RequestMapping("/cancel")
    public String cancel(){
        return "redirect:/course/allCourse";
    }
}
