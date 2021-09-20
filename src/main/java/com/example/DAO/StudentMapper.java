package com.example.DAO;

import com.example.POJO.Postgraduate;
import com.example.POJO.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/20 1:19 下午
 */
@Component
public interface StudentMapper {
    /**
     * 查找全部学生
     * @return Student List
     */
    List<Student> selectAllStudent();
    /**
     * select Student By Id
     * @param studentId 学生Id
     * @return Student POJO
     */
    Student selectStudentById(Integer studentId);

    /**
     * select Student By Name
     * @param studentName 学生name
     * @return Student POJO
     */
    Student selectStudentByName(String studentName);

    /**
     * 添加学生信息
     * @param student student POJO
     * @return 1表示操作成功  0表示操作失败
     */
    int addStudent(Student student);

    /**
     * 根据学生Id，更新学生信息
     * @param student student POJO
     * @return 1表示操作成功  0表示操作失败
     */
    int updateStudent (Student student);
}
