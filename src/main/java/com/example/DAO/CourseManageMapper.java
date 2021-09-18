package com.example.DAO;

import com.example.POJO.Course;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 6:52 下午
 */
public interface CourseManageMapper {
    /**
     * 根据课程Id查询课程相关信息
     * @param courseId 课程Id
     * @return Course POJO
     */
    Course selectCourseByCourseId(Integer courseId);

    /**
     * 添加课程
     * @param course Course POJO
     * @return 1 success 2 failed
     */
    boolean addCourse(Course course);

    /**
     * 更新课程信息
     * @param course Course POJO
     * @param courseId 课程Id
     * @return 1 success  2 failed
     */
    boolean updateCourseByCourseId(Course course,Integer courseId);
}
