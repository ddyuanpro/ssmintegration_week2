package pri.hgs.ssm.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pri.hgs.ssm.domain.Student;
import pri.hgs.ssm.service.IHelloService;

@RequestMapping(value = "/student")
@RestController
public class HelloControler {
    @Autowired
    IHelloService helloService;
    @RequestMapping(value = "/{stid}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable int stid) {
        Student student = helloService.getStuById(stid);
        if (student == null) {
            student = new Student();
        }
        return student;
    }
    @RequestMapping(value = "/{stid}", method = RequestMethod.DELETE)
    public Result delStuById(@PathVariable int stid) {
        int r = helloService.delStuById(stid);
        if (r == 0)
            return new Result(403, "删除失败");
        return new Result(200, "删除操作成功");
    }
    @RequestMapping(value = "/addStu", method = RequestMethod.POST)
    public Result addAStu(Student student) {
        int result = helloService.insetStu(student);
        if (result == 0)
            return new Result(403, "添加失败。");
        return new Result(200, "添加成功。");
    }

    @RequestMapping(value="/updateStu",method = RequestMethod.PUT)
    public Result updateStu(Student student){
        System.out.println(student);
        Map<String,String> param = new HashMap<>();
        param.put("stid", ""+student.getStid());
        param.put("password", student.getPassword());
        param.put("grate", student.getGrate());
        int result = helloService.updateStu(param);
        if (result == 0)
            return new Result(403, "更新失败。");
        return new Result(200, "更新成功。");
    }
}
