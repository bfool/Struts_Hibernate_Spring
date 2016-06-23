<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add.action" method="post">
		账号:<input type="text" name="uv.id" value="1"/><br /> 
		密码:<input type="password"	name="uv.pwd" value="1"/><br /> 
		姓名:<input type="text" name="uv.name" value="a" /><br />
		年龄:<input type="text" name="uv.age" value="21"/><br /> 
		工资:<input type="text"	name="uv.money" value="300"/> 
		<input type="submit" value="提交" />

	</form>
</body>
</html>