package com.example.POJO;

/**
 * 学生选课关联POJO
 * @author Hxin
 * @version 1.0
 * @since 2021/9/20 12:56 下午
 */
public class StudentLinkCourse {
    /**
     * 学生Id
     */
    private Integer studentId;
    /**
     * 课程Num
     */
    private Integer courseNum;

    @Override
    public String toString() {
        return "StudentLinkCourse{" +
                "studentId=" + studentId +
                ", courseNum=" + courseNum +
                '}';
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }
}
