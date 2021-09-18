package com.example.DAO;

import com.example.POJO.Undergraduate;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 6:44 下午
 */
public interface UndergraduateMapper {

    /**
     * 根据学生ID查询学生信息，并展示
     * @param studentId 学生Id
     * @return Student POJO
     */
    Undergraduate selectUndergraduateById(Integer studentId);

    /**
     * 添加学生信息
     * @param undergraduate Undergraduate POJO
     * @return 1表示操作成功  0表示操作失败
     */
    int addUndergraduate(Undergraduate undergraduate);

    /**
     * 根据学生Id，更新学生信息
     * @param undergraduate Undergraduate POJO
     * @return 1表示操作成功  0表示操作失败
     */
    int updateUndergraduate(Undergraduate undergraduate);
}
