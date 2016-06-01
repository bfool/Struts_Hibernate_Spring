<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add.action">
		学号：<input type="text" name="sv.ssid" value="1"/><br/>
		姓名：<input type="text" name="sv.sname" value="ere"/><br/>
		性别：<select name="sv.sex">	<option value="男">男</option> <option value="女">女</option></select><br/>
		选课：	<input name="cv" type="checkbox" value="1">aa <input name="cv" type="checkbox" value="2">bb<br/>
		<input type="submit" value="提交"/><br/>
	</form>
</body>
</html>