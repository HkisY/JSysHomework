package com.example.service.Interface;

import com.example.POJO.Postgraduate;
import com.example.POJO.Student;
import com.example.POJO.Undergraduate;

import java.util.List;

/**
 * 学生相关业务逻辑
 * @author Hxin
 * @version 1.0
 * @since 2021/9/19 9:47 下午
 */
public interface IStudentService {
    /**
     * 展示所有学生
     * @return Student List
     */
    List<Student> findAllStudent();
    /**
     * 添加学生信息
     * @param undergraduate undergraduate POJO
     * @return 1 success 0 fail
     */
    int addStudent(Undergraduate undergraduate);

    /**
     * 添加学生信息
     * @param postgraduate postgraduate POJO
     * @return 1 success 0 fail
     */
    int addStudent(Postgraduate postgraduate);

    /**
     * 根据学生Id查询学生信息
     * @param studentId 学生ID
     * @return student POJO
     */
    Student findStudentByStudentId(Integer studentId);

    /**
     * 根据学生名字查询学生信息
     * @param studentName 学生姓名
     * @return student POJO
     */
    Student findStudentByStudentName(String studentName);

    /**
     * 根据学生Id修改学生信息
     * @param student student POJO 部分字段可为空 代表不修改
     * @param studentId 学生Id 用于匹配修改
     * @return 1 success 2 fail
     */
    int updateStudentByStudentId(Student student,Integer studentId);

    /**
     * 为学生选课
     * @param studentId 学生身份标识
     * @param courseId 课程内容标识
     * @return 1 success 0 fail
     */
    int addCourseForStudent(Integer studentId,Integer courseId);

    /**
     * 将课程移除出学生的选择
     * @return 1 success 0 fail
     */
    int updateCourseForStudent(Integer studentId, Integer courseId);
}
