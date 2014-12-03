<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.cdio.planx.dao.impl.GroomDaoImpl"%>
<%@page import="com.cdio.planx.dao.GroomDao"%>
<%@page import="com.cdio.planx.domain.Groom"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html lang="en" class="no-js">
<head>

<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>书影推荐</title>
<link
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"
	rel="stylesheet">
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="../favicon.ico">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/bootstrap/css/demo.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/bootstrap/css/component.css" />
<script
	src="${pageContext.request.contextPath}/bootstrap/js/modernizr.custom.js"></script>
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<a href="#" class="btn btn-navbar" data-toggle="collapse"
				data-target=".nav-callapse"> <span class="icon-bar"></span> <span
				class="icon-bar"></span> <span class="icon-bar"></span>
			</a> <a class="brand" herf="#">xxx社区</a>
			<div class="nav-collapse">
				<ul class="nav nav-collapse">
					<li><a href="#">首页</a></li>
					<li><a href="#">通知详情</a></li>
					<li><a href="#">比赛资讯</a></li>
					<li><a href="#">资源下载</a></li>
					<li class="active"><a href="#">书影推荐</a></li>
					<li><a href="#">问题解答</a></li>
					<li><a href="#">个人信息</a></li>
					<li><a href="#">班主任信箱</a></li>
					<li><a href="#">注销</a></li>
				</ul>
				<ul class="nav pull-right">
				</ul>
			</div>
		</div>
	</div>

	<img
		src="${pageContext.request.contextPath}/bootstrap/img/286760_meitu_2.jpg">
	<div class="container">
		</br>
		<div align="right">
			<a href="#SubmitNotice" data-toggle="modal" class="btn btn-primary">上传资源</a>
		</div>

		<div id="grid-gallery" class="grid-gallery">
			<section class="grid-wrap">
				<ul class="grid">
					<li class="grid-sizer" />
					<!-- for Masonry column width -->
					<%
						GroomDao gd = new GroomDaoImpl();
									List<Groom> listGroom = gd.listGroom();
									int i = 0;
									for (Groom groom:listGroom)
										if (i++<8){
					%>

					<li>
						<figure>
							<img
								src="${pageContext.request.contextPath}/image/<%=groom.getGroomPic()%>" />
							<figcaption>
								<h3><%=groom.getGroomTitle()%></h3>
								<p><%=groom.getGroomBrief()%></p>
							</figcaption>
						</figure>
					</li>
					<%
						}
					%>
				</ul>
			</section>
			<!-- // grid-wrap -->
			<section class="slideshow">
				<ul>
					<%
						int j=0;
									for (Groom groom:listGroom)
																	if (j++<8){
					%>
					<li>
						<figure>
							<figcaption>
								<h3><%=groom.getGroomTitle()%></h3>
								<p><%=groom.getGroomBrief()%></p>
							</figcaption>
							<img width="100" height="300"
								src="${pageContext.request.contextPath}/image/<%=groom.getGroomPic()%>"
								alt="img01" />
						</figure>
					</li>
					<%
						}
					%>
				</ul>
				<nav>
					<span class="icon nav-prev"></span> <span class="icon nav-next"></span>
					<span class="icon nav-close"></span>
				</nav>
				<div class="info-keys icon">Navigate with arrow keys</div>
			</section>
			<!-- // slideshow -->
		</div>
		<!-- // grid-gallery -->
	</div>

	<script
		src="${pageContext.request.contextPath}/bootstrap/js/imagesloaded.pkgd.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/masonry.pkgd.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/classie.js"></script>
	<script
		src="${pageContext.request.contextPath}/bootstrap/js/cbpGridGallery.js"></script>
	<script>
		new CBPGridGallery(document.getElementById('grid-gallery'));
	</script>
</body>
</html>
