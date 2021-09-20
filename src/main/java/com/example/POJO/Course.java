package com.example.POJO;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 6:41 下午
 */
public class Course {
    /**
     * 课程Id
     */
    private Integer courseNum;
    /**
     * 课程名字
     */
    private String courseName;
    /**
     * 课程描述
     */
    private String description;
    /**
     * 课程学分
     */
    private int score;
    /**
     * 课程任课老师
     */
    private String teacher;

    @Override
    public String toString() {
        return "Course{" +
                "courseNum=" + courseNum +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", score=" + score +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
