package com.example.DAO;

import com.example.POJO.Course;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 6:52 下午
 */
@Component
public interface CourseManageMapper {
    /**
     * 查看所有课程
     * @return List
     */
    List<Course> selectAllCourse();
    /**
     * 根据课程Id查询课程相关信息
     * @param courseId 课程Id
     * @return Course POJO
     */
    Course selectCourseByCourseNum(Integer courseId);

    /**
     * 根据课程Id查询课程相关信息
     * @param courseName 课程名字
     * @return Course POJO
     */
    Course selectCourseByCourseName(String courseName);

    /**
     * 添加课程
     * @param course Course POJO
     * @return 1 success 0 failed
     */
    int addCourse(Course course);

    /**
     * 更新课程信息
     * @param course Course POJO
     * @return 1 success  0 failed
     */
    int updateCourseByCourseId(Course course);
}
