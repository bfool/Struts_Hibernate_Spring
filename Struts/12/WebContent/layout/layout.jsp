<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Coffee System</title>
<link href="../css/default.css" rel="stylesheet" type="text/css"
	media="screen" />
</head>
<body>

	<div id="wrapper">
		<!-- start header -->
		<tiles:insertAttribute name="top"></tiles:insertAttribute>
		<!-- end header -->
		<!-- start page -->
		<div id="page">
			<div id="page-bgtop">
				<div id="page-bgbtm">
					<tiles:insertAttribute name="left"></tiles:insertAttribute>
					<!-- start content -->
					<div id="content">
						<tiles:insertAttribute name="body"></tiles:insertAttribute>
					</div>
					<!-- end content -->
					<!-- start sidebars -->
					<tiles:insertAttribute name="right"></tiles:insertAttribute>
					<!-- end sidebars -->
					<div style="clear: both;">&nbsp;</div>
				</div>
				<!-- end page -->
			</div>
		</div>
	</div>

	<tiles:insertAttribute name="footer"></tiles:insertAttribute>
	
	<div style="text-align: center; font-size: 0.75em;">
		Design downloaded from <a href="http://www.freewebtemplates.com/">free
			website templates</a>.
	</div>
</body>


</body>
</html>