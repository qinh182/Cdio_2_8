<%@ page language="java" import="java.util.*,java.net.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	System.out.println(request.getAttribute("userID"));
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>登陆</title>

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
</head>


<body>
	<div class="container">
		<h1 class="page-header">XXXX系统</h1>
		<div class="modal" id="login">
			<div class="modal-header">
				<h4>用户登陆</h4>
			</div>

			<div class="modal-body">
				<form class="form-horizontal" action="login" method="post">
					<div class="control-group">
						<label class="control-label">用户名</label>
						<div class="controls">
							<input type="text" placeholder="输入您的用户名" class="span3" name="userID">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label">密码</label>
						<div class="controls">
							<input type="text" placeholder="输入您的密码" class="span3"name="userPw">
						</div>
					</div>
			</div>


			<div class="modal-footer">
				<div class="pull-left">
					<label>身份验证 <select name="userType">
							<option value="0">学生</option>
							<option value="1">教师</option>
							<option value="1">班干部</option>
							<option value="1">班主任</option>
							<option value="2">管理员</option>
					</select>
					</label>
				</div>

				<button type="submit" class="btn btn-primary">登陆</button>
				</form>
			</div>
</body>
</html>
