package com.example.service;

import com.example.DAO.ChooseCourseMapper;
import com.example.DAO.PostgraduateMapper;
import com.example.DAO.StudentMapper;
import com.example.DAO.UndergraduateMapper;
import com.example.POJO.Postgraduate;
import com.example.POJO.Student;
import com.example.POJO.Undergraduate;
import com.example.service.Interface.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/19 10:15 下午
 */
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private PostgraduateMapper postgraduateMapper;
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private UndergraduateMapper  undergraduateMapper;
    @Autowired
    private ChooseCourseMapper chooseCourseMapper;


    @Override
    public List<Postgraduate> findAllPostgraduate() {
        return postgraduateMapper.selectAllPostgraduate();
    }

    @Override
    public List<Undergraduate> findAllUndergraduate() {
        return undergraduateMapper.selectAllUndergraduate();
    }

    @Override
    public int addStudent(Undergraduate undergraduate) {
        //加入事务操作
        int b =  studentMapper.addStudent(undergraduate);
        int a =  undergraduateMapper.addUndergraduate(undergraduate);
        if (a==1&&b==1){
            return 1;
        }
        return 0;
    }

    @Override
    public int addStudent(Postgraduate postgraduate) {
        int b =  studentMapper.addStudent(postgraduate);
        int a =  postgraduateMapper.addPostgraduate(postgraduate);
        if (a==1&&b==1){
            return 1;
        }
        return 0;
    }

    @Override
    public Student findStudentByStudentId(Integer studentId) {
        return studentMapper.selectStudentById(studentId);
    }

    @Override
    public Student findStudentByStudentName(String studentName) {
        return studentMapper.selectStudentByName(studentName);
    }

    @Override
    public int updateStudentByStudentId(Student student, Integer studentId) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public int addCourseForStudent(Integer studentId, Integer courseId) {
        return chooseCourseMapper.addChooseRecord(studentId,courseId);
    }

    @Override
    public int updateCourseForStudent(Integer studentId, Integer courseId) {
        //param state  0 表示数据失效
        return chooseCourseMapper.updateChooseRecord(studentId,courseId,0);
    }
}
