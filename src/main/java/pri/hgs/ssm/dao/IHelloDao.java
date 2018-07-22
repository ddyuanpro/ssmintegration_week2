package pri.hgs.ssm.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import pri.hgs.ssm.domain.Student;

public interface IHelloDao {
    // �������������mapper�в�һ�����������Ӧ@Param("����") ע�����У��
    Student getStuById(@Param("id") int stid);
    int delStuById(int stid);
    int updateStu(Map param);

    int insetStu(Student student);
}
