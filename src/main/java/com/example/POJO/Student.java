package com.example.POJO;


import java.sql.Date;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 6:18 下午
 */
public class Student {
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
    private Date birthday;
    /**
     * 学生性别
     */
    private String gender;
    /**
     * 学生年级
     */
    private String grade;
    /**
     * 学生专业
     */
    private String major;
    /**
     * 1 代表本科生  2 代表研究生
     */
    private int typeNum;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                ", typeNum=" + typeNum +
                '}';
    }

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getTypeNum() {
        return typeNum;
    }

    public void setTypeNum(int typeNum) {
        this.typeNum = typeNum;
    }
}
