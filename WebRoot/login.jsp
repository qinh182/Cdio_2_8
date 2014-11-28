<%@ page language="java" import="java.util.*,java.net.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

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
	
	function con(a){
		alert(a);
	}
	
	
	function checkPermi(){
		with(document.forms["frm"]){
      	var i=userPermi.options[userPermi.selectedIndex].value;
      	if(i==" "){
      		alert("请选择角色！");
     	}
		}
	}

</script>

<body>
<%
	Object message=request.getAttribute("error");
	if(message!=null){
		out.print("<body onload=\"con(\'"+message+"\');\"></body>");
	}	
	
%>



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
							<option value="1">教师</option>
							<option value="1">班干部</option>
							<option value="1">班主任</option>
							<option value="2">管理员</option>
					</select>
					</label>
				</div>

				<button class="btn btn-primary" onclick="checkPermi();">登陆</button>
				</form>
			</div>
</body>
</html>
