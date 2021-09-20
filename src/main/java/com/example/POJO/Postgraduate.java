package com.example.POJO;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 6:33 下午
 */
public class Postgraduate extends Student{
    /**
     * 学生ID
     */
    private Integer studentId;
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
                "studentId=" + studentId +
                ", name='" + super.getName() + '\'' +
                ", birthDay=" + super.getBirthday() +
                ", gender='" + super.getGender() + '\'' +
                ", grade='" + super.getGrade() + '\'' +
                ", major='" + super.getMajor() + '\'' +
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
