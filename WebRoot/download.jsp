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
<meta charset="utf-8">
<title>资源下载</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"
	rel="stylesheet">

<style>
#div {
	width: 250px;
	height: 300px;
	position: absolute;
	left: 334px;
	right: auto;
	border: inset #CCCCCC;
	top: 166px;
}

.div-a {
	float: left;
	width: 49%;
	border: 1px solid #F00
}

.div-b {
	float: left;
	width: 49%;
	border: 1px solid #000
}

#div1 {
	width: 280px;
	height: 300px;
	position: absolute;
	left: 477px;
	right: auto;
	border: inset #CCCCCC;
	top: 621px;
}

#div2 {
	width: 280px;
	height: 300px;
	position: absolute;
	left: 783px;
	right: auto;
	border: inset #CCCCCC;
	top: 621px;
}

/* GLOBAL STYLES
    -------------------------------------------------- */
/* Padding below the footer and lighter body text */
body {
	padding-bottom: 50px;
	color: #5a5a5a;
}

/* CUSTOMIZE THE NAVBAR
    -------------------------------------------------- */

/* Special class on .container surrounding .navbar, used for positioning it into place. */
.navbar-wrapper {
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	z-index: 10;
	margin-top: 20px;
	margin-bottom: -90px;
	/* Negative margin to pull up carousel. 90px is roughly margins and height of navbar. */
}

.navbar-wrapper .navbar {
	
}

/* Remove border and change up box shadow for more contrast */
.navbar .navbar-inner {
	border: 0;
	-webkit-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	-moz-box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
	box-shadow: 0 2px 10px rgba(0, 0, 0, .25);
}

/* Downsize the brand/project name a bit */
.navbar .brand {
	padding: 14px 20px 16px;
	/* Increase vertical padding to match navbar links */
	font-size: 16px;
	font-weight: bold;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, .5);
}

/* Navbar links: increase padding for taller navbar */
.navbar .nav>li>a {
	padding: 15px 20px;
}

/* Offset the responsive button for proper vertical alignment */
.navbar .btn-navbar {
	margin-top: 10px;
}

/* CUSTOMIZE THE CAROUSEL
    -------------------------------------------------- */

/* Carousel base class */
.carousel {
	margin-bottom: 60px;
}

.carousel .container {
	position: relative;
	z-index: 9;
}

.carousel-control {
	height: 80px;
	margin-top: 0;
	font-size: 120px;
	text-shadow: 0 1px 1px rgba(0, 0, 0, .4);
	background-color: transparent;
	border: 0;
	z-index: 10;
}

.carousel .item {
	height: 500px;
}

.carousel img {
	position: absolute;
	top: 0;
	left: 0;
	min-width: 100%;
	height: 500px;
}

.carousel-caption {
	background-color: transparent;
	position: static;
	max-width: 550px;
	padding: 0 20px;
	margin-top: 200px;
}

.carousel-caption h1,.carousel-caption .lead {
	margin: 0;
	line-height: 1.25;
	color: #fff;
	text-shadow: 0 1px 1px rgba(0, 0, 0, .4);
}

.carousel-caption .btn {
	margin-top: 10px;
}

/* MARKETING CONTENT
    -------------------------------------------------- */

/* Center align the text within the three columns below the carousel */
.marketing .span4 {
	text-align: center;
}

.marketing h2 {
	font-weight: normal;
}

.marketing .span4 p {
	margin-left: 10px;
	margin-right: 10px;
}

/* Featurettes
    ------------------------- */
.featurette-divider {
	margin: 80px 0; /* Space out the Bootstrap <hr> more */
}

.featurette {
	padding-top: 120px;
	/* Vertically center images part 1: add padding above and below text. */
	overflow: hidden;
	/* Vertically center images part 2: clear their floats. */
}

.featurette-image {
	margin-top: -120px;
	/* Vertically center images part 3: negative margin up the image the same amount of the padding to center it. */
}

/* Give some space on the sides of the floated elements so text doesn't run right into it. */
.featurette-image.pull-left {
	margin-right: 40px;
}

.featurette-image.pull-right {
	margin-left: 40px;
}

/* Thin out the marketing headings */
.featurette-heading {
	font-size: 50px;
	font-weight: 300;
	line-height: 1;
	letter-spacing: -1px;
}

/* RESPONSIVE CSS
    -------------------------------------------------- */
@media ( max-width : 979px) {
	.container.navbar-wrapper {
		margin-bottom: 0;
		width: auto;
	}
	.navbar-inner {
		border-radius: 0;
		margin: -20px 0;
	}
	.carousel .item {
		height: 500px;
	}
	.carousel img {
		width: auto;
		height: 500px;
	}
	.featurette {
		height: auto;
		padding: 0;
	}
	.featurette-image.pull-left,.featurette-image.pull-right {
		display: block;
		float: none;
		max-width: 40%;
		margin: 0 auto 20px;
	}
}

@media ( max-width : 767px) {
	.navbar-inner {
		margin: -20px;
	}
	.carousel {
		margin-left: -20px;
		margin-right: -20px;
	}
	.carousel .container {
		
	}
	.carousel .item {
		height: 300px;
	}
	.carousel img {
		height: 300px;
	}
	.carousel-caption {
		width: 65%;
		padding: 0 70px;
		margin-top: 100px;
	}
	.carousel-caption h1 {
		font-size: 30px;
	}
	.carousel-caption .lead,.carousel-caption .btn {
		font-size: 18px;
	}
	.marketing .span4+.span4 {
		margin-top: 40px;
	}
	.featurette-heading {
		font-size: 30px;
	}
	.featurette .lead {
		font-size: 18px;
		line-height: 1.5;
	}
}
</style>

</head>
<body>

	<div class="container">
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
						<li class="active"><a href="#">资源下载</a></li>
						<li><a href="#">书影推荐</a></li>
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
	</div>

	<div id="myCarousel" class="carousel slide">
		<div class="carousel-inner">
			<div class="item active">

				<img
					src="${pageContext.request.contextPath}/bootstrap/img/17c5f24afe.jpg">
			</div>

		</div>

	</div>
	<!-- /.carousel -->

	<div class="container">

		<ul class="nav  nav-tabs">
			<li class="active"><a href="#tab1" data-toggle="tab">全部</a></li>
			<li><a href="#tab2" data-toggle="tab">文档</a></li>
			<li><a href="#tab3" data-toggle="tab">视频</a></li>
			<li><a href="#tab4" data-toggle="tab">其他</a></li>
		</ul>
		<div class="tab-content" style="">
			<div class="tab-pane active" id="tab1">
				<%
					ResourceDao rd = new ResourceDaoImpl();
					List<Resource> listRes = rd.listRes();
					int i = 0;
					for (Resource res : listRes)
						if (i++ < 5) {
				%>

				<table width="930" align="center" border="2" bordercolor="#CCCCCC">
					<tr>

						<td height="30" colspan="5"><strong>全部</strong></td>
					</tr>
					<tr>
						<td height="100" valign="top" colspan="5"><strong>简介:	</strong><%=res.getResDescribe()%></td>
					</tr>
					<tr>
						<td><strong>发布时间：<%=res.getResDate()%></strong></td>
						<td><strong>发布人：<%=res.getResName()%></strong></td>
						<td><strong>资源分类：<%=res.getResType()%></strong></td>
						<td><strong>资源大小：</strong></td>
						<td align="right">
							<button type="button" ><a  href="downloadJsp.jsp?fileName=<%=res.getResFile()%>">下载</a></button>
						</td>
					</tr>
				</table>
				<%
					}
				%>
			</div>

			<div class="tab-pane" id="tab2">
			<%for (Resource res : listRes) 
				if (res.getResType().equals("word")) { %>
				<table width="930" align="center" border="2" bordercolor="#CCCCCC">
					<tr>

						<td height="30" colspan="5"><strong>文档</strong></td>
					</tr>
					<tr>
						<td height="100" valign="top" colspan="5"><strong>简介:	</strong><%=res.getResDescribe()%></td>
					</tr>
					<tr>
						<td><strong>发布时间：<%=res.getResDate()%></strong></td>
						<td><strong>发布人：<%=res.getResName()%></strong></td>
						<td><strong>资源分类：<%=res.getResType()%></strong></td>
						<td><strong>资源大小：</strong></td>
						<td align="right">
							<button type="button"><a  href="downloadJsp.jsp?fileName=<%=res.getResFile()%>">下载</a></button>
						</td>
					</tr>
				</table><%
					}
				%>
			</div>

			<div class="tab-pane" id="tab3">
			<%for (Resource res : listRes) 
				if (res.getResType().equals("video")) { %>
				<table width="930" align="center" border="2" bordercolor="#CCCCCC">
					<tr>

						<td height="30" colspan="5"><strong>视频</strong></td>
					</tr>
					<tr>
						<td height="100" valign="top" colspan="5"><strong>简介:	</strong><%=res.getResDescribe()%></td>
					</tr>
					<tr>
						<td><strong>发布时间：<%=res.getResDate()%></strong></td>
						<td><strong>发布人：<%=res.getResName()%></strong></td>
						<td><strong>资源分类：<%=res.getResType()%></strong></td>
						<td><strong>资源大小：</strong></td>
						<td align="right">
							<button type="button" ><a href="downloadJsp.jsp?fileName=<%=res.getResFile()%>">下载</a></button>
						</td>
					</tr>
				</table><%
					}
				%>
			</div>

			<div class="tab-pane" id="tab4">
				<%for (Resource res : listRes) 
				if (res.getResType().equals("other")) { %>
				<table width="930" align="center" border="2" bordercolor="#CCCCCC">
					<tr>

						<td height="30" colspan="5"><strong>其他</strong></td>
					</tr>
					<tr>
						<td height="100" valign="top" colspan="5"><strong>简介:	</strong><%=res.getResDescribe()%></td>
					</tr>
					<tr>
						<td><strong>发布时间：<%=res.getResDate()%></strong></td>
						<td><strong>发布人：<%=res.getResName()%></strong></td>
						<td><strong>资源分类：<%=res.getResType()%></strong></td>
						<td><strong>资源大小：</strong></td>
						<td align="right">
							<button type="button" ><a  href="downloadJsp.jsp?fileName=<%=res.getResFile()%>">下载</a></button>
						</td>
					</tr>
				</table><%
					}
				%>
			</div>



		</div>

		<a href="#SubmitCompetition" data-toggle="modal"
			class="btn btn-primary">发布资源</a>

		<div class="modal hide" id="SubmitCompetition">
			<a href="#" class="close" data-dismiss="modal">×</a>
			<div class="page-header">
				<div class="span4">
					<h4 class="pull-left">我要上传</h4>
				</div>
			</div>
			<div class="modal-body">
				<form class="form-horizontal"action="upload"method="post" ENCTYPE="multipart/form-data">
					<div>
						<div class="control-group">
							<label class="control-label">资源标题</label>
							<div class="controls">
								<input type="text" placeholder="输入您的标题名" class="span3"name="title">
							</div>
						</div>
					</div>

					<div class="control-group">
						<label class="control-label">资源类型</label>
						<div class="controls">
							<select class="selectpicker" data-style="btn-primary"
								name="type">
								<option value="word">文档</option>
								<option value="video">视频</option>
								<option value="other">其他</option>

							</select>
						</div>
					</div>
					<div>
						<div class="control-group">
							<label class="control-label">资源简介</label>
							<div class="controls">
								<textarea class="form-horizontal" rows="8" cols="20"name="describe"></textarea>
							</div>
							<div class="span4"></div>

							<button type="submit" class="btn btn-primary pull-right">上传</button>
							<div>
								<div class="control-group">
									<label class="control-label">文件传输</label>
									<div class="controls">
										<input type="file" id="inputfile"name="path">
									</div>
								</div>
							</div>

						</div>
					</div>


				</form>
			</div>



			<script
				src="${pageContext.request.contextPath}/bootstrap/js/jquery-2.1.1.min.js"></script>
			<script
				src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
			
		</div>
</body>
</html>
