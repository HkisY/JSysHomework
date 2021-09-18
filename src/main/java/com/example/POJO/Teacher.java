package com.example.POJO;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 6:36 下午
 */
public class Teacher {
    /**
     * 教师Id
     */
    private Integer teacherId;
    /**
     * 教师姓名
     */
    private String name;
    /**
     * 教师研究方向
     */
    private String research;

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name='" + name + '\'' +
                ", research='" + research + '\'' +
                '}';
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }
}
