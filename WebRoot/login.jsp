<%@ page language="java" import="java.util.*,java.net.*"
	pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<style type="text/css">
#fullBg {
	z-index: 2;
	height: 100%;
	width: 100%;
	position: absolute;
	top: 0px;
	background: url(/Cdio_2_8/bootstrap/img/26.jpg);
}

.form-signin {
	max-width: 280px;
	margin: 60px auto 10px;
}

.form-signin .form-signin-heading {
	text-align: center;
	font-weight: bold;
	text-shadow: 0px 1px 2px #111;
	color: #fff;
	margin-bottom: 20px;
}

.form-signin .checkbox {
	font-weight: normal;
}

.form-signin .form-control {
	position: relative;
	font-size: 16px;
	height: auto;
	padding: 10px;
	-webkit-box-sizing: border-box;
	-moz-box-sizing: border-box;
	box-sizing: border-box;
}

.form-signin input[type="text"] {
	margin-bottom: -1px;
	border-top: 1px solid #000;
	border-right: 1px solid #000;
	border-left: 1px solid #000;
	border-radius: 6px 6px 0px 0px;
}

.form-signin input[type="text"]:focus {
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
}

.form-signin input[type="password"] {
	z-index: 2;
	margin-bottom: 20px;
	border-top: none;
	border-bottom: 1px solid #000;
	border-right: 1px solid #000;
	border-left: 1px solid #000;
	border-radius: 0px 0px 6px 6px;
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0px 1px 0px 0px
		rgba(255, 255, 255, 0.5);
}

.form-signin input[type="password"]:focus {
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075), 0px 1px 0px 0px
		rgba(255, 255, 255, 0.5);
}

.form-signin .btn {
	font-weight: bold;
	text-shadow: 0px -1px 0px rgba(0, 0, 0, 0.2);
}

p.sign-up {
	text-shadow: 0px 1px 2px #222;
	color: #fff;
	font-size: 12px;
}
</style>

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
<script type="text/javascript">
	function con(a) {
		alert(a);
	}

	function checkPermi() {
		with (document.forms["frm"]) {
			var i = userPermi.options[userPermi.selectedIndex].value;
		if (i=" ") {
				alert("请选择角色！");
			}
		}
	}
</script>

<body>

	<div id="fullBg" />

	<div class="container">
		<form class="form-signin" action="login" method="post"name="frm">

			<h1 class="form-signin-heading">Please Login</h1>
			<center>
				<input type="text" class="form-control" name="username"	placeholder="请输入用户名" required autofocus /> 
				<input type="password"class="form-control" name="password" placeholder="请输入密码" required autofocus/>
				<select class="selectpicker" data-style="btn-primary"
					name="userPermi">
			<!--	<option value=" ">请选择您的身份</option>  -->	
					<option value="0">学生</option>
					<option value="1">班干部</option>
					<option value="2">教师</option>
					<option value="3">班主任</option>
					<option value="4">管理员</option>
				</select>
			</center>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Log
				in</button>
		</form>
		<p class="text-center sign-up">
			欢迎进入<strong>师生交流社区</strong>
		</p>
	</div>

<%
Object message=request.getAttribute("error");
			 if(message!=null){
			 out.print("<body onload=\"con(\'"+message+"\');\"></body>");
			 }	
		
			 %>
	<!-- 



	<div class="container">
		<h1 class="page-header">XXXX系统</h1>
		<div class="modal" id="login">
			<div class="modal-header">
				<h4>用户登陆</h4>
			</div>

			<div class="modal-body">
				<form class="form-horizontal" action="login" method="post"name="frm">
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
					<label>身份验证 <select name="userPermi">
							<option value=" ">请选择</option>
							<option value="0">学生</option>
							<option value="1">班干部</option>
							<option value="2">教师</option>
							<option value="3">班主任</option>
							<option value="4">管理员</option>
					</select>
					</label>
				</div>

				<button class="btn btn-primary" onclick="checkPermi();">登陆</button>
				</form>
			</div> -->
</body>
</html>
