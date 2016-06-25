<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProductAdd</title>
</head>
<body>
	<s:form action="add" namespace="/product" method="post"
		enctype="multipart/form-data">
		<s:textfield name="id" label=" 编号"></s:textfield>
		<s:textfield name="name" label="名称"></s:textfield>
		<s:textfield name="savedate" label="保质天数"></s:textfield>
		<s:textfield name="price" label="单价"></s:textfield>
		<s:textfield name="date" label="生产日期"></s:textfield>
		<s:textfield name="email" label="邮箱"></s:textfield>
		<s:textfield name="web" label="网站"></s:textfield>
		
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>