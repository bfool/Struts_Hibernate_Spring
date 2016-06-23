<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>add</title>
</head>
<body>
	<s:form action="add.action" method="post" theme="simple" namespace="/list">
		课程编号:<input type="text" name="cv.cno" value="a"/><br/>
		课程名称:<input type="text" name="cv.cname" value="xxxxx"/> <br/>
		学分:<input type="text" name="cv.credit" value="11"/> <br/>
		课程性质:<input type="radio" name="cv.cproperty" value="b"/>  必修
				<input type="radio" name="cv.cproperty" value="k" /> 考查
				<input type="radio" name="cv.cproperty" value="x" /> 选修
			
				<table>
					<tr>
						<th>学号</th>
						<th>姓名</th>
						<th>平时成绩</th>
						<th>期末成绩</th>
					</tr>
					<s:iterator value="new int[3]" status="status">
						<tr>
							<td><s:textfield name="%{'stu[' + #status.index + '].sno'}"></s:textfield></td>
							<td><s:textfield name="%{'stu[' + #status.index + '].sname'}"></s:textfield></td>
							<td><s:textfield name="%{'stu[' + #status.index + '].ordinaryscore'}"></s:textfield></td>
							<td><s:textfield name="%{'stu[' + #status.index + '].endingscore'}"></s:textfield></td>
						</tr>
					</s:iterator>
				</table>
				<input type="submit" value="提交">
			</s:form>
		
</body>
</html>