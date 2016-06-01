<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CITY OA管理系统</title>
<link rel="stylesheet" type="text/css" href="../css/main.css">
</head>
<body>
<div id="header">
<h1>系统主页</h1>

</div>
<div>
登录用户:${user.name}
</div>
<div id="middle">
	<div id="left">
		<ul>
			<li><a href="../department/tomain.action">部门管理</a></li>
			<li><a href="../behave/tomain.action">爱好管理</a></li>
			<li><a href="../employee/tomain.action">员工管理</a></li>
			<li><a href="../logout.action">用户注销</a></li>
		</ul>
	</div>
	<div id="main">
		接收的登录帐号:${id}<br/>
		Session中的账号:${userid}
	</div>
	<div id="right">
	</div>
	
</div>
<div id="footer">
<h5>城市学院版权所有</h5>
</div>




</body>
</html>