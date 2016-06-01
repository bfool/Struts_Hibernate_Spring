<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
</head>
<body>
	<form method="post" action="add.do">
		pcode:<input type="text" name="pcode" value="a"/><br/>
		pname:<input type="text" name="pname" value="pig"/> <br/>
		pdate:<input type="text" name="pdate" value="2016-1-1"/> <br/>
		edate:<input type="text" name="edate" value="2016-3-30"/> <br/>
		unitprice:<input type="text" name="unitprice" value="44.4"/> <br/>
		qtyinstock:<input type="text" name="qtyinstock" value="55.5"/> <br/>
		<input type="submit" value="submit"/>
	</form>
</body>
</html>