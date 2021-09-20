package com.example.DAO;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/20 3:23 下午
 */
@Component
public interface ChooseCourseMapper {

    /**
     * 添加选课关联
     * @param studentId 学生Id
     * @param courseNum 课程Id
     * @return 1 success 0 fail
     */
    int addChooseRecord(Integer studentId,Integer courseNum);

    /**
     * 改变选课联结状态
     * @param stuentId 学生ID
     * @param courseNum 课程ID
     * @param state 1 表示状态在线  2 状态下线 即删除联结
     * @return 1 success 0 fail
     */
    int updateChooseRecord(Integer stuentId,Integer courseNum,Integer state);
}
