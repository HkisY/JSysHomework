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
    private Integer courseId;
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
    private Teacher teacher;

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", description='" + description + '\'' +
                ", score=" + score +
                ", teacher=" + teacher +
                '}';
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
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

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
