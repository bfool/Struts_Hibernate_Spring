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
<form action="search" method="post">
产品检索：价格在
<input type="text" value="" name="low">到
<input type="text" value="" name="high">
<input type="button" value="检索" >
</form>

<table>
   <tr>
      <td>编号</td>
      <td>名称</td>
      <td>单价</td>
      <td>库存数量</td>
   </tr>
   <c:forEach var="pv" items="${pv}">
   <tr>
      <td>${pv.productID}</td>
      <td>${pv.productName}</td>
      <td>${pv.unitPrice }</td>
      <td>${pv.unitsInStock}</td>
   </tr>
   </c:forEach>
</table>
<div>
  <a href="search?pageIndex=1">首页</a> <a href="search?pageIndex=${pageIndex}-1">上页</a> <a href="search?pageIndex=${pageIndex}+1">下页</a> <a href="">末页</a>
</div>

</body>
</html>