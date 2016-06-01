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
<s:form action="add" namespace="/bank" method="post" enctype="multopart/form-data">
<s:textfield name="bv.idname" label="账号" value="1"></s:textfield>
<s:textfield name="bv.name" label="姓名" value="a"></s:textfield>
<s:textfield name="bv.identity" label="身份证号码" value="1"></s:textfield>
<s:textfield name="bv.date" label="开户日期" value="2013-1-1"></s:textfield>
<s:textfield name="bv.money" label="开户余额" value="3.3"></s:textfield>

<s:submit value="提交"></s:submit>
</s:form>
</body>
</html>