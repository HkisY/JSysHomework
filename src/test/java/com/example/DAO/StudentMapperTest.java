package com.example.DAO;

import com.example.POJO.Student;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/20 8:08 下午
 */
public class StudentMapperTest extends TestCase {
    @Resource
    StudentMapper studentMapper;

//    public void testSelectAllStudent() {
//        List<Student> students = studentMapper.selectAllStudent();
//        for (Student student : students) {
//            System.out.println(student);
//        }
//    }

    public void testSelectStudentById() {
    }

    public void testSelectStudentByName() {
    }

    public void testAddStudent() {
    }

    public void testUpdateStudent() {
    }
}