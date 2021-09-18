package com.example.POJO;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 6:33 下午
 */
public class Postgraduate extends Student{
    /**
     * 导师
     */
    private String tutor;
    /**
     * 研究方向
     */
    private String research;

    @Override
    public String toString() {
        return "Postgraduate{" +
                "studentId=" + super.getStudentId() +
                ", name='" + super.getName() + '\'' +
                ", birthDay=" + super.getBirthDay() +
                ", gender='" + super.getGender() + '\'' +
                ", tutor='" + tutor + '\'' +
                ", research='" + research + '\'' +
                '}';
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }
}
