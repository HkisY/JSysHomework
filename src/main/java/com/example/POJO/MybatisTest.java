package com.example.POJO;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 9:51 上午
 */
public class MybatisTest {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
