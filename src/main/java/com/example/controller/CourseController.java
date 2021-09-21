package com.example.controller;

import com.example.POJO.Course;
import com.example.POJO.Student;
import com.example.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/20 10:07 下午
 */
@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseServiceImpl courseService;

    @GetMapping("/allCourse")
    public String findAllCourse(Model model){
        List<Course> list = courseService.findAllCourse();
        model.addAttribute("list",list);
        return "allCourse";
    }

    @RequestMapping("/toAddPage")
    public String toAddPage(){
        return "addCourse";
    }

    @RequestMapping("/addCourse")
    public String addCourse(Course course){
        //加判断
        courseService.addCourse(course);
        return "redirect:/course/allCourse";
    }

    @RequestMapping("/toUpdatePage")
    public String toUpdatePage(){
        return "updatePage";
    }

    @RequestMapping("/updateCourse")
    public String updateCourse(Course course){
        if (course.getCourseNum() == 0){
            //增加警报内容
            return "redirect:/course/updateCourse";
        }
        courseService.updateCourseByCourseId(course,course.getCourseNum());
        return "redirect:/course/allCourse";
    }

    @RequestMapping("/cancel")
    public String cancel(){
        return "redirect:/course/allCourse";
    }
}
