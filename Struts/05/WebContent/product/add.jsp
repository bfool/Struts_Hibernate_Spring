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
		产品名:<input type="text" name="name" value="a"/><br/>
		单价:<input type="text" name="price" value="55.6"/> <br/>
		单位:<input type="text" name="unit" value="ooo"/> <br/>
		库存数量:<input type="text" name="qty" value="10"/> <br/>
		采购数量:<input type="text" name="buynum" value="10"/><br/>
		<input type="submit" value="提交">
	</form>
</body>
</html>