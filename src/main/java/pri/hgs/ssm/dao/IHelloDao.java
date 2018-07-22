package pri.hgs.ssm.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import pri.hgs.ssm.domain.Student;

public interface IHelloDao {
    // 对于其参数名与mapper中不一致情况，可适应@Param("名称") 注解进行校正
    Student getStuById(@Param("id") int stid);
    int delStuById(int stid);
    int updateStu(Map param);

    int insetStu(Student student);
}
