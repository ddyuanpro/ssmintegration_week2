import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import pri.hgs.ssm.dao.IHelloDao;
import pri.hgs.ssm.domain.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class HelloTest {
    @Autowired
    IHelloDao helloDao;

    @Test
    public void testQueryStu(){
        Student stu = helloDao.getStuById(1);
        System.out.println(stu);
    }

    @Test
    public void testDelStu(){
        int result = helloDao.delStuById(2);
        System.out.println(result);
    }

    @Test
    public void testUpdateStu(){
        Map<String,String> param = new HashMap<>();
        param.put("stid","1");
        param.put("password", "asd");
        int result = helloDao.updateStu(param);
        System.out.println(result);
    }

    @Test
    public void testInsertStu(){
        Student stu = new Student();
        stu.setName("Ä§Å®");
        stu.setGender(0);
        stu.setPassword("asd123asd");
        stu.setGrate("°ËÄê¶þ°à");
        int result = helloDao.insetStu(stu);
        System.out.println(result);
    }
}
