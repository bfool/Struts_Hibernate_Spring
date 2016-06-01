<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>员工主页</h1>
<form action="tomain.action" method="post">
年龄:从<input type="text" name="low" /> 到<input type="text" name="high" />
<input type="submit" value="提交" />

</form>
<c:forEach var="ev" items="${employeeList }">
  ${ev.name }-${ev.age}<br/>

</c:forEach>
<a href="tomain.action?pageIndex=${pageIndex-1 }">上页</a><a href="tomain.action?pageIndex=${pageIndex+1 }">下页</a>
</body>
</html>