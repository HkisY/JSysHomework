package com.example.serviceTest;

import com.example.BaseTest;
import com.example.POJO.Undergraduate;
import com.example.service.Interface.IStudentService;
import org.junit.Test;

import javax.annotation.Resource;
import java.sql.Date;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/21 3:53 下午
 */
public class serviceTest extends BaseTest {

    @Resource
    private IStudentService studentService;

    @Test
    public void test(){
        Undergraduate undergraduate = new Undergraduate();
        undergraduate.setStudentId(1002);
        undergraduate.setName("诸葛青");
        undergraduate.setTeacher("李相榕");
        undergraduate.setGender("男");
        undergraduate.setGrade("四年级");
        undergraduate.setMajor("神秘学");
        undergraduate.setBirthday(Date.valueOf("2021-01-01"));
        undergraduate.setClassName("死亡四班");
        int i = studentService.addStudent(undergraduate);
        System.out.println(i);
    }
}
