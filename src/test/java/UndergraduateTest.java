import com.example.DAO.UndergraduateMapper;
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
 * @since 2021/9/18 7:26 下午
 */
public class UndergraduateTest {
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
    public void SQLUndergraduateTest() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UndergraduateMapper undergraduateMapper = sqlSession.getMapper(UndergraduateMapper.class);
        //查询测试
        Undergraduate undergraduate =  undergraduateMapper.selectUndergraduateById(1);
        System.out.println(undergraduate);

        //插入测试
        Date date = new Date(1235125);
        Undergraduate undergraduate1 = new Undergraduate();
        undergraduate1.setName("丽质天成");
        undergraduate1.setGrade("二年级");
        undergraduate1.setBirthDay(date);
        undergraduate1.setGender("女");
        undergraduate1.setTeacher("李相榕");
        int flag = undergraduateMapper.addUndergraduate(undergraduate1);
        System.out.println(flag);
        System.out.println(undergraduateMapper.selectUndergraduateById(2));
        sqlSession.commit();

        //更新测试
        Undergraduate undergraduate2 = new Undergraduate();
        undergraduate2.setStudentId(3);
        undergraduate2.setName("炽热");
        undergraduate2.setGrade("四年级");
        undergraduate2.setBirthDay(date);
        undergraduate2.setGender("男");
        undergraduate2.setTeacher("张宇");
        System.out.println(undergraduate2);
        int flag2 = undergraduateMapper.updateUndergraduate(undergraduate2);
        sqlSession.commit();
    }
}
