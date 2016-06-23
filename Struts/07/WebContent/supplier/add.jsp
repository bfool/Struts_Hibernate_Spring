<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
</head>
<body>
<h3>增加新供应商</h3>

<s:form action="add" namespace="/supplier" method="post" enctype="multopart/form-data">
<s:textfield name="sid" label="编码"></s:textfield>
<s:textfield name="name" label="名称"></s:textfield>
<s:textarea name="introduce" label="介绍"></s:textarea>
<s:textfield name="sale" label="年销售额"></s:textfield>
<s:radio name="" label="行业" list="categoryList" listKey="iid" listValue="name"></s:radio>
<s:select name="" label="性质" list="typeList" listKey="cid" listValue="name"></s:select>
<%-- <s:checkboxlist list=""></s:checkboxlist> --%>
<s:submit value="提交"></s:submit>
</s:form>
</body>
</html>