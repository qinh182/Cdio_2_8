<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link
	href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css"
	rel="stylesheet" type="text/css">
<script
	src="${pageContext.request.contextPath}/bootstrap/js/jquery-2.1.1.min.js"></script>
<script
	src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
<meta charset="utf-8">
<title>首页</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

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

<body class="home-template">
	<div class="container">
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<a href="#" class="btn btn-navbar" data-toggle="collapse"
					data-target=".nav-callapse"> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
				</a> <a class="brand" herf="#">xxx社区</a>
				<div class="nav-collapse">
					<ul class="nav nav-collapse">
						<li class="active"><a href="#">首页</a></li>
						<li><a href="#">通知详情</a></li>
						<li><a href="#">比赛资讯</a></li>
						<li><a href="download.jsp">资源下载</a></li>
						<li><a href="#">书影推荐</a></li>
						<li><a href="#">问题解答</a></li>
						<li><a href="userinfo.jsp">个人信息</a></li>
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
				<img src="/Cdio_2_8/bootstrap/img/10.jpg">
			</div>
			<div class="item">
				<img src="/Cdio_2_8/bootstrap/img/08.jpg">
			</div>
			<div class="item">
				<img src="/Cdio_2_8/bootstrap/img/09.jpg">
			</div>
		</div>
		<a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
		<a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a>
	</div>
	<!-- /.carousel -->
	<div class="container">
		<div class="margin:0 auto">
			<h2>
				<strong>XX社区快速入</strong>口
			</h2>
			<p>马上进入热门来先睹为快吧</p>
		</div>
		<div style="border:1px solid black; height:1000px;">
			<div style="border:1px solid black;margin:0 auto">
				<h2>
					<strong>热门通知</strong>
				</h2>
				<p>
					<a class="btn btn btn-warning" href="#">更多 &raquo;</a>
				</p>
			</div>
			<blockquote>
				<p>第一条 为充分调动学生学习的积极性和主动性，提升人才培养质量，根据教育部《普通高等学校学生管理规定》（教
					育部令第21，特制定本办法。第二条 转专业应遵循的基本原则。</p>
				<small>来自<city>XXX</city></small>
			</blockquote>
			<blockquote>
				<p>第一条 为充分调动学生学习的积极性和主动性，提升人才培养质量，根据教育部《普通高等学校学生管理规定》（教
					育部令第21，特制定本办法。第二条 转专业应遵循的基本原则。</p>
				<small>来自<city>XXX</city></small>
			</blockquote>
		</div>
	</div>


	<!-- Marketing messaging and featurettes
    ================================================== -->
	<!-- Wrap the rest of the page in another container to center all the content. -->

	<div class="container marketing">

		<!-- Three columns of text below the carousel -->

		<div class="row"></div>
		<div class="row">

			<div class="span4" style="border: 1px solid black;margin:0 auto">

				<div style=" border: 1px solid black; background-color:#06C">
					<h2>
						<strong>热门资讯</strong>
					</h2>
				</div>
				<p>Donec sed odio dui. Etiam porta sem malesuada magna mollis
					euismod. Nullam id dolor id nibh ultricies vehicula ut id elit.
					Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
					Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</p>
				<div style="border: 1px solid black;">

					<p>
						<a class="btn btn-primary" href="#">更多 &raquo;</a>
					</p>
				</div>
			</div>
			<!-- /.span4 -->

			<div class="span4" style="border: 1px solid black;margin:0 auto">

				<div style="border: 1px solid black; background:#FF0">
					<h2>
						<strong>热门资源</strong>
					</h2>
				</div>
				<p>Duis mollis, est non commodo luctus, nisi erat porttitor
					ligula, eget lacinia odio sem nec elit. Cras mattis consectetur
					purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo,
					tortor mauris condimentum nibh, ut fermentum massa justo sit amet
					risus.</p>
				<div style="border: 1px solid black;">
					<p>
						<a class="btn btn btn-warning" href="#">更多 &raquo;</a>
					</p>
				</div>
			</div>
			<!-- /.span4 -->
			<div class="span4" style="border: 1px solid black;margin:0 auto">

				<div style="border: 1px solid black; background:#F00">
					<h2>
						<strong>热门问答</strong>
					</h2>
				</div>
				<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in,
					egestas eget quam. Vestibulum id ligula porta felis euismod semper.
					Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum
					nibh, ut fermentum massa justo sit amet risus.</p>
				<div style="border: 1px solid black;">
					<p>
						<a class="btn btn btn-danger" href="#">更多 &raquo;</a>
					</p>
				</div>
			</div>
			<!-- /.span4 -->
		</div>
		<!-- /.row -->




		<!-- FOOTER -->
		<footer>
		<p class="pull-right">
			<a href="#">Back to top</a>
		</p>
		<p>
			&copy; 2013 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a
				href="#">Terms</a>
		</p>
		</footer>

	</div>
	<!-- /.container -->

	<script>
		!function($) {
			$(function() {
				// carousel demo
				$('#myCarousel').carousel()
			})
		}(window.jQuery)
	</script>

</body>
</html>
