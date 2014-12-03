<%@page import="com.cdio.planx.domain.Resource"%>
<%@page import="com.cdio.planx.domain.Competition"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	String type = request.getParameter("type");
	Competition com = new Competition();
	Resource res = new Resource();
	if(request.getAttribute("com")!=null)
		com=(Competition)request.getAttribute("com");
	if(request.getAttribute("res")!=null)
		res =(Resource)request.getAttribute("res");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<title>详情页面</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="bootstrap/bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"><style type="text/css">
<!--
body {
	margin-left: 200px;
	margin-right: 200px;
}
.STYLE1 {font-size: 24px}
.STYLE2 {font-size: 17.5px}
-->
</style></head>
<body  style="text-align:center">
<div class="container">
  <h1 class="page-header">${com.competitionTitle}${res.resName }</h1>
</div>


<p class="STYLE1">
${com.competitionContent}${res.resDescribe}
</p>
<h3 class="STYLE1 STYLE1" >&nbsp;</h3>
<p >&nbsp;</p>
<p align="right" class="STYLE2" >${com.competitionAuthor}${res.resAuthor}</p>
<p align="right" class="STYLE2" >${com.competitionDate}${res.resDate}</p>
<p >&nbsp;</p>
<p >&nbsp;</p>
<p >&nbsp;</p>


<script src="bootstrap/bootstrap/js/bootstrap.js"></script>
<script src="bootstrap/bootstrap/js/jquery-2.1.1.min.js"></script>
</body>
</html>