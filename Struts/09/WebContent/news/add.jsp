<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:form action="add" namespace="/news" method="post" enctype="multipart/form-data" >
	<s:textfield  name="nv.title" label="标题" value="a"></s:textfield>
	<s:textfield  name="nv.context" label="内容" value="b"></s:textfield>
	<s:file name="photo" label="图片"></s:file>
	<s:submit value="提交"></s:submit>
</s:form>
</body>
</html>