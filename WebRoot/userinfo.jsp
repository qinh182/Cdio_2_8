<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.cdio.planx.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>个人信息页面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<link
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"
	rel="stylesheet" type="text/css">
<script
	src="${pageContext.request.contextPath}/bootstrap/js/jquery-2.1.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>

<script type="text/javascript">
	function fun(index) {
		switch (index) {
		case 1: {
			document.getElementById('STYLE1').style.display = "";
			document.getElementById('STYLE2').style.display = "none";
			document.getElementById('STYLE3').style.display = "none";
			document.getElementById('STYLE4').style.display = "";
			document.getElementById('STYLE5').style.display = "";
			document.getElementById('STYLE6').style.display = "";
			document.getElementById('STYLE7').style.display = "";
			document.getElementById('STYLE8').style.display = "";
			document.getElementById('STYLE9').style.display = "";
			document.getElementById('STYLE10').style.display = "";
			document.getElementById('STYLE11').style.display = "none";
			document.getElementById('STYLE12').style.display = "none";
			document.getElementById('STYLE13').style.display = "";
			document.getElementById('STYLE14').style.display = "";
			document.getElementById('STYLE15').style.display = "";
			document.getElementById('STYLE16').style.display = "";
			document.getElementById('STYLE17').style.display = "";
			document.getElementById('STYLE18').style.display = "";
		}
			break;
		case 2: {
			document.getElementById('STYLE1').style.display = "";
			document.getElementById('STYLE2').style.display = "";
			document.getElementById('STYLE3').style.display = "none";
			document.getElementById('STYLE4').style.display = "none";
			document.getElementById('STYLE5').style.display = "";
			document.getElementById('STYLE6').style.display = "none";
			document.getElementById('STYLE7').style.display = "";
			document.getElementById('STYLE8').style.display = "none";
			document.getElementById('STYLE9').style.display = "";
			document.getElementById('STYLE10').style.display = "";
			document.getElementById('STYLE11').style.display = "";
			document.getElementById('STYLE12').style.display = "none";
			document.getElementById('STYLE13').style.display = "none";
			document.getElementById('STYLE14').style.display = "";
			document.getElementById('STYLE15').style.display = "none";
			document.getElementById('STYLE16').style.display = "";
			document.getElementById('STYLE17').style.display = "none";
			document.getElementById('STYLE18').style.display = "";
		}
			break;
		case 3: {
			document.getElementById('STYLE1').style.display = "";
			document.getElementById('STYLE2').style.display = "none";
			document.getElementById('STYLE3').style.display = "";
			document.getElementById('STYLE4').style.display = "none";
			document.getElementById('STYLE5').style.display = "";
			document.getElementById('STYLE6').style.display = "";
			document.getElementById('STYLE7').style.display = "";
			document.getElementById('STYLE8').style.display = "";
			document.getElementById('STYLE9').style.display = "";
			document.getElementById('STYLE10').style.display = "";
			document.getElementById('STYLE11').style.display = "none";
			document.getElementById('STYLE12').style.display = "";
			document.getElementById('STYLE13').style.display = "none";
			document.getElementById('STYLE14').style.display = "";
			document.getElementById('STYLE15').style.display = "";
			document.getElementById('STYLE16').style.display = "";
			document.getElementById('STYLE17').style.display = "";
			document.getElementById('STYLE18').style.display = "";
		}
			break;
		}
	}
</script>
<style type="text/css">
div.margin {
	margin-bottom: 30px
}

#mydiv {
	width: 146px;
	height: 340px;
	position: absolute;
	left: 193px;
	right: auto;
	border: #FF0000;
	top: 58px;
}

#yourdiv {
	width: 146px;
	height: 338px;
	position: absolute;
	left: 376px;
	right: auto;
	border: #CC0033;
	top: 57px;
}

#div {
	width: 718px;
	height: 540px;
	position: absolute;
	left: 334px;
	right: auto;
	border: inset #CCCCCC;
	top: 166px;
}

#close {
	width: 83px;
	height: 20px;
	position: absolute;
	left: 653px;
	right: auto;
	border: #CCCCCC;
	top: 744px;
}

.STYLE1 {
	font-size: 18px
}

body {
	background-image: url(${pageContext.request.contextPath}/bootstrap/img/background.jpg);
}
</style>
</head>
<%
	String permi = (String) request.getSession().getAttribute("permi");

	int i = -1;
	if (permi != null) {
		i = Integer.parseInt(permi);
		if (i == 0) {
			i = 1;
		}
	}
	out.print("<body onload=\"fun(" + i + ");\">");
%>


<div class="container">
	<h1 class="page-header">我的个人信息</h1>
</div>
<img src="${pageContext.request.contextPath}/bootstrap/img/info.png">
</br>
<div id="div">
	<div id="mydiv">
		<div align="right" class="margin STYLE1" id="STYLE1">姓名：</div>
		<div align="right" class="margin STYLE1" id="STYLE2">教职工号：</div>
		<div align="right" class="margin STYLE1" id="STYLE3">班主任号：</div>
		<div align="right" class="margin STYLE1" id="STYLE4">学号：</div>
		<div align="right" class="margin STYLE1" id="STYLE5">性别：</div>
		<div align="right" class="margin STYLE1" id="STYLE6">专业：</div>
		<div align="right" class="margin STYLE1" id="STYLE7">学院：</div>
		<div align="right" class="margin STYLE1" id="STYLE8">班级：</div>
		<div align="right" class="margin STYLE1" id="STYLE9">联系方式：</div>
	</div>
	<div id="yourdiv">
		<div align="left" class="margin STYLE1" id="STYLE10"><%=request.getSession().getAttribute("name")%></div>
		<div align="left" class="margin STYLE1" id="STYLE11"><%=request.getSession().getAttribute("id")%></div>
		<div align="left" class="margin STYLE1" id="STYLE12"><%=request.getSession().getAttribute("id")%></div>
		<div align="left" class="margin STYLE1" id="STYLE13"><%=request.getSession().getAttribute("id")%></div>
		<div align="left" class="margin STYLE1" id="STYLE14"><%=request.getSession().getAttribute("sex")%></div>
		<div align="left" class="margin STYLE1" id="STYLE15"><%=request.getSession().getAttribute("major")%></div>
		<div align="left" class="margin STYLE1" id="STYLE16"><%=request.getSession().getAttribute("academy")%></div>
		<div align="left" class="margin STYLE1" id="STYLE17"><%=request.getSession().getAttribute("class")%></div>
		<div align="left" class="margin STYLE1" id="STYLE18"><%=request.getSession().getAttribute("cont")%></div>
	</div>
</div>
	

</body>
<br>
</body>
</html>
