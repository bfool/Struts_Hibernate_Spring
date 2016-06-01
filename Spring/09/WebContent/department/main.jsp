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
<h1>部门主页</h1>
<c:forEach var="dv" items="${departmentList}">
  ${dv.no }-${dv.code }-<a href="toview.action?dv.no=${dv.no}">${dv.name}</a>   <a href="delete.action?dv.no=${dv.no}">删除</a><br/>

</c:forEach>
<a href="toadd.action">增加部门</a>


</body>
</html>