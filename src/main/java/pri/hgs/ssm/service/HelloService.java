package pri.hgs.ssm.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pri.hgs.ssm.dao.IHelloDao;
import pri.hgs.ssm.domain.Student;

@Service
public class HelloService implements IHelloService {
    @Autowired
    IHelloDao helloDao;
    @Override
    public Student getStuById(int stid) {
        return helloDao.getStuById(stid);
    }
    @Override
    public int delStuById(int stid) {
        return helloDao.delStuById(stid);
    }
    @Override
    public int updateStu(Map param) {
        return helloDao.updateStu(param);
    }
    @Override
    public int insetStu(Student student) {
        return helloDao.insetStu(student);
    }
}
