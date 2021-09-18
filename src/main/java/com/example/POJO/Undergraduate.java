package com.example.POJO;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 6:28 下午
 */
public class Undergraduate extends Student {
    /**
     * 学生班级
     */
    private String grade;
    /**
     * 学生班主任
     */
    private String teacher;

    @Override
    public String toString() {
        return "Undergraduate{" +
                "studentId=" + super.getStudentId() +
                ", name='" + super.getName() + '\'' +
                ", birthDay=" + super.getBirthDay() +
                ", gender='" + super.getGender() + '\'' +
                ", grade='" + grade + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
