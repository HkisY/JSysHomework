package com.example.DAO;

import com.example.POJO.Postgraduate;
import com.example.POJO.Undergraduate;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 10:19 下午
 */
@Component
public interface PostgraduateMapper {
    /**
     * 查询全部研究生
     * @return list
     */
    List<Postgraduate> selectAllPostgraduate();
    /**
     * 根据学生ID查询学生信息，并展示
     * @param studentId 学生Id
     * @return Postgraduate POJO
     */
    Postgraduate selectPostgraduateById(Integer studentId);

    /**
     * 添加学生信息
     * @param postgraduate PostgraduateMapper POJO
     * @return 1表示操作成功  0表示操作失败
     */
    int addPostgraduate(Postgraduate postgraduate);

    /**
     * 根据学生Id，更新学生信息
     * @param postgraduate PostgraduateMapper POJO
     * @return 1表示操作成功  0表示操作失败
     */
    int updatePostgraduate(Postgraduate postgraduate);
}
