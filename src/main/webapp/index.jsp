<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <!-- 其中get和post方法是html中自带的，但是不支持PUT和DELETE方法，所以需要通过POST方法模拟这两种方法，只需要在表单中添加一个隐藏域，名为_method，值为PUT或DELETE。 -->
    <form action="student/updateStu" method="POST">
    <input type="hidden" name="_method" value="PUT">
        <input type="hidden" name="stid" value="1" /> 
        密码：<input type="text" name="password" />  
        班级：<input type="text" name="grate" />
            <input type="submit" value="修改" />
    </form>

    <form action="student/addStu" method="post">
    name:<input type="text" name="name" /> <br/>
password:<input type="text" name="password" /> <br/>
   grate:<input type="text" name="grate" /> <br/>
  gender:<input type="text" name="gender"/> <br/>
         <input type="submit" value="添加" />
    </form>
    <form action="student/1" method="post">
        <input type="hidden" name="_method" value="DELETE"/>
        <input type="submit" value="删除" />
    </form>
</body>
</html>
