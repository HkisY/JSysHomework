package com.example.service.Interface;


import com.example.POJO.Course;

import java.util.List;

/**
 * 课程相关业务逻辑
 * @author Hxin
 * @version 1.0
 * @since 2021/9/19 9:54 下午
 */
public interface ICourseService {
    /**
     * 寻找全部课程
     * @return list
     */
    List<Course> findAllCourse();
    /**
     * 添加课程信息
     * @param course course POJO
     * @return 1 success 2 fail
     */
    int addCourse(Course course);

    /**
     * 根据课程Id查询课程信息
     * @param courseId 课程Id
     * @return Course POJO
     */
    Course findCourseByCourseId(Integer courseId);

    /**
     * 根据课程名字查询课程信息
     * @param courseName 课程名字
     * @return Course POJO
     */
    Course findCourseByCourseName(String courseName);

    /**
     * 根据课程Id修改课程信息
     * @param course course POJO 部分字段可为空 代表不修改
     * @param courseId courseId 用于匹配修改
     * @return 1 success 2 fail
     */
    int updateCourseByCourseId(Course course,Integer courseId);
}
