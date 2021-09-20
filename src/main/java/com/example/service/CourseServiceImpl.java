package com.example.service;

import com.example.DAO.CourseManageMapper;
import com.example.POJO.Course;
import com.example.service.Interface.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/19 10:14 下午
 */
@Service
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private CourseManageMapper courseManageMapper;

    @Override
    public List<Course> findAllCourse() {
        return courseManageMapper.selectAllCourse();
    }

    @Override
    public int addCourse(Course course) {
        return courseManageMapper.addCourse(course);
    }

    @Override
    public Course findCourseByCourseId(Integer courseId) {
        return courseManageMapper.selectCourseByCourseNum(courseId);
    }

    @Override
    public Course findCourseByCourseName(String courseName) {
        return courseManageMapper.selectCourseByCourseName(courseName);
    }

    @Override
    public int updateCourseByCourseId(Course course, Integer courseId) {
        return courseManageMapper.updateCourseByCourseId(course);
    }
}
