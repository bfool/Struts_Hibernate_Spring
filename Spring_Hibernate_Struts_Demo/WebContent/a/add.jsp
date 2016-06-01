<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
</head>
<body>
	<s:form action="add" namespace="/a" method="post"
		enctype="multopart/form-data">
		<s:textfield name="id" label="name"></s:textfield>
		<s:textfield name="name" label="name"></s:textfield>
		<s:textarea name="introduce" label="name"></s:textarea>
		<s:radio name="radio" label="name" list="alist" listKey="id"
			listValue="name"></s:radio>
		<s:select name="select" label="name" list="alist" listKey="id"
			listValue="name"></s:select>
		<%-- <s:checkboxlist list=""></s:checkboxlist> --%>
		<s:submit value="提交"></s:submit>
	</s:form>
</body>
</html>