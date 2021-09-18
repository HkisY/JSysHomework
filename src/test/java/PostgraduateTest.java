import com.example.DAO.PostgraduateMapper;
import com.example.DAO.UndergraduateMapper;
import com.example.POJO.Postgraduate;
import com.example.POJO.Undergraduate;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 10:30 下午
 */
public class PostgraduateTest {
    private SqlSessionFactory sqlSessionFactory;


    @Before
    public void testBefore() {
        String resource = "spring-mybatis.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void SQLPostgraduateTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        PostgraduateMapper postgraduateMapper = sqlSession.getMapper(PostgraduateMapper.class);
        //查询测试
        Postgraduate postgraduate =  postgraduateMapper.selectPostgraduateById(1);
        System.out.println(postgraduate);

        //插入测试
        Date date = new Date(1235125);
        Postgraduate postgraduate1 = new Postgraduate();
        postgraduate1.setName("丽质天成");
        postgraduate1.setTutor("李相榕");
        postgraduate1.setBirthDay(date);
        postgraduate1.setGender("女");
        postgraduate1.setResearch("机器学习");
        int flag = postgraduateMapper.addPostgraduate(postgraduate1);
        System.out.println(flag);
        System.out.println(postgraduateMapper.selectPostgraduateById(2));
        sqlSession.commit();

        //更新测试
        Postgraduate postgraduate2 = new Postgraduate();
        postgraduate2.setStudentId(2);
        postgraduate2.setName("炽热");
        postgraduate2.setResearch("卷积神经算法");
        postgraduate2.setBirthDay(date);
        postgraduate2.setGender("男");
        postgraduate2.setTutor("kenneth.H.Rosen");
        System.out.println(postgraduate2);
        int flag2 = postgraduateMapper.updatePostgraduate(postgraduate2);
        sqlSession.commit();
    }
}
