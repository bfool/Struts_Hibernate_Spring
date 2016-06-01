<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>增加员工</h1>
<form action="add.action" method="post">
账号:<input type="text" name="ev.id" /><br/>
密码:<input type="text" name="ev.password" /><br/>
姓名:<input type="text" name="ev.name" /><br/>
年龄:<input type="text" name="ev.age" /><br/>
部门:<select name="ev.department.no">
     <option value="1">销售部</option>
     <option value="2">生产部</option>
</select>
照片:<input type="file" name="photo"><br/>
爱好：<input type="checkbox" name="behaves" value="1" />旅游
<input type="checkbox" name="behaves" value="2" />爬山
<input type="checkbox" name="behaves" value="3" />音乐<br/>
地址:<input type="text" name="ev.address.address" /><br/>
城市:<input type="text" name="ev.address.city" /><br/>

<input type="submit" value="提交" />

</form>
</body>
</html>