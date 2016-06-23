<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
</head>
<body>
	<form action="add.action" method="post">
		编号:<input type="text" name="ev.eid" value="1"/><br/>
		姓名:<input type="text" name="ev.ename" value="a"/><br/>
		年龄:<input type="text" name="ev.eage" value="33"/> <br/>
		工资:<input type="text" name="ev.esal" value="33.2"/> <br/>
		加入公司日期:<input type="text" name="joindate" value="2013-01-01"/> <br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>