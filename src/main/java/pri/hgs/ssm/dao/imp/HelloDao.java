package pri.hgs.ssm.dao.imp;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pri.hgs.ssm.dao.IHelloDao;
import pri.hgs.ssm.domain.Student;

@Component
public class HelloDao implements IHelloDao {
    @Autowired
    SqlSessionTemplate ssTemplate;
    @Override
    public Student getStuById(int stid) {
        return ssTemplate.getMapper(IHelloDao.class).getStuById(stid);
    }
    @Override
    public int delStuById(int stid) {
        return ssTemplate.getMapper(IHelloDao.class).delStuById(stid);
    }
    @Override
    public int updateStu(Map param) {
        return ssTemplate.getMapper(IHelloDao.class).updateStu(param);
    }
    @Override
    public int insetStu(Student student) {
        return ssTemplate.getMapper(IHelloDao.class).insetStu(student);
    }
}
