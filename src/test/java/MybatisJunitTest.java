import com.example.DAO.TestMapper;
import com.example.POJO.MybatisTest;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Hxin
 * @version 1.0
 * @since 2021/9/18 10:27 上午
 */
public class MybatisJunitTest {
    private SqlSessionFactory sqlSessionFactory;


    @Before
    public void testBefore(){
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
    public void mybatisTest01(){

        SqlSession sqlSession = sqlSessionFactory.openSession();
        com.example.POJO.MybatisTest mybatisTest = (com.example.POJO.MybatisTest) sqlSession.selectOne("selectTest",1);
        System.out.println(mybatisTest);
    }
    @Test
    public void mybatisTest02(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TestMapper testMapper =  sqlSession.getMapper(TestMapper.class);
        MybatisTest mybatisTest = testMapper.selectTest(1);
        System.out.println(mybatisTest);
    }
}
