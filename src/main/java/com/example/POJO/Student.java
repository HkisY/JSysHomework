package com.example.POJO;


import java.sql.Date;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 6:18 下午
 */
public abstract class Student {
    /**
     * 学生ID
     */
    private Integer studentId;
    /**
     * 学生名字
     */
    private String name;
    /**
     * 学生生日
     */
    private Date birthDay;
    /**
     * 学生性别
     */
    private String gender;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
