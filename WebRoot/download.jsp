<%@page import="com.cdio.planx.dao.impl.ResourceDaoImpl"%>
<%@page import="com.cdio.planx.dao.ResourceDao"%>
<%@page import="com.cdio.planx.domain.Resource"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" import="java.util.*,com.cdio.planx.*"
	pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>资源下载</title>

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
</head>

<body>
	<div class="container">
		<h1 class="page-header">资源下载</h1>
		<ul class="nav nav-pills">
			<li class="active"><a href="#tab1" data-toggle="tab">电影下载</a></li>
			<li><a href="#tab2" data-toggle="tab">书籍下载</a></li>
			<li><a href="#tab3" data-toggle="tab">其它下载</a></li>
		</ul>
		<div class="tab-content">
			<div class="tab-pane active" id="tab1">
				<%
				ResourceDao rd = new ResourceDaoImpl();
				List<Resource> listRes = rd.listRes();
				for (Resource res : listRes) 
					if (res.getResType().equals("movie")) {
			%>
				<blockquote>
					<img src="" width="64" height="64" /><span class="STYLE1"><span
						class="STYLE2"><%=res.getResName()%></span></span></br> <span><%=res.getResDescribe()%></span>
					<div align="right">
						<a type="button" href="界面.rar" style="colorL:red;">下载</a>
				</blockquote>
		<% 		}%>
			</div>
			<div class="tab-pane " id="tab2">
			<%
				for (Resource res : listRes) 
					if (res.getResType().equals("book")) {
			%>
				<blockquote>
					<span class="STYLE2"><%=res.getResName()%></span></br> </span><%=res.getResDescribe()%></span>
					<div align="right">
						<a type="button" href="界面.rar" style="colorL:red;">下载</a>
				</blockquote>
			<% 		}%>
			</div>
			<div class="tab-pane" id="tab3">
			<%for (Resource res : listRes) 
					if (res.getResType().equals("other")) {
			%>
				<blockquote>
					<span class="STYLE2"><%=res.getResName()%></span></br> </span><%=res.getResDescribe()%></span>
					<div align="right">
						<a type="button" href="界面.rar" style="colorL:red;">下载</a>
				</blockquote>
				<%
					}
				%>
			</div>
		</div>
	</div>
	</div>
	<div align="center">
		<a href="#SubmitNotice" data-toggle="modal" class="btn btn-primary">上传资源</a>
	</div>
	<div class="modal hide" id="SubmitNotice">
		<a href="#" class="close" data-dismiss="modal">×</a>
		<div class="page-header">
			<div class="span4">
				<h4 class="pull-left">资源上传</h4>
			</div>
		</div>
		<div class="modal-body">
			<form class="form-horizontal">
				<div>
					<div class="control-group">
						<label class="control-label">内容描述：</label>
						<div class="controls">
							<textarea class="form-control" rows="5"></textarea>
						</div>
					</div>
				</div>
			</form>
		</div>
		<div class="modal-footer">
			<form class="form-inline" role="form"action="upload">
				<div class="form-horizontal">
					<span>名称</span> <input name="filename" class="form-control" id="name"
						placeholder="请输入名称">
				</div>
				<div class="form-group">
					<span>选择要上传的文件</span> <input name="浏览" type="file">
				</div>
			<button type="button" class="btn btn-primary">上传</button>
			</form>
		</div>
	</div>
	</div>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<p>&nbsp;</p>
	<div align="center">
		<button type="button" class="btn-primary">关闭窗口</button>

	</div>





</body>
<script
	src="${pageContext.request.contextPath}/bootstrap/js/jquery-2.1.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
<script type="text/javascript"></script>

</html>
