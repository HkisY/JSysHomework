package com.example.POJO;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 6:28 下午
 */
public class Undergraduate extends Student {
    /**
     * 学生Id
     */
    private Integer studentId;
    /**
     * 学生班级
     */
    private String className;
    /**
     * 学生班主任
     */
    private String teacher;

    @Override
    public String toString() {
        return "Undergraduate{" +
                "studentId=" + super.getStudentId() +
                ", name='" + super.getName() + '\'' +
                ", birthDay=" + super.getBirthday() +
                ", gender='" + super.getGender() + '\'' +
                ", grade='" + super.getGrade() + '\'' +
                ", className='" + className + '\'' +
                ", major='" + super.getMajor() + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    @Override
    public Integer getStudentId() {
        return studentId;
    }

    @Override
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
