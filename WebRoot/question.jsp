<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="bootstrap/css/reset.css" />
	<link rel="stylesheet" href="bootstrap/css/timeline.css">
	<link href="bootstrap/css/bootstrap.css" rel="stylesheet" >
	<script src="bootstrap/js/timeline.js"></script>
	<title>问题解答</title>
    <style>
#div{
	width:250px;
	height:300px;
	position:absolute;
	left:334px;
	right:auto;
	border: inset #CCCCCC;
	top: 166px;
}

.div-a{ float:left;width:49%; } 
.div-b{ float:left;width:49%; } 


#div1{
	width:280px;
	height:300px;
	position:absolute;
	left:477px;
	right:auto;
	border: inset #CCCCCC;
	top: 621px;
}
#div2{
	width:280px;
	height:300px;
	position:absolute;
	left:783px;
	right:auto;
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
      margin-bottom: -90px; /* Negative margin to pull up carousel. 90px is roughly margins and height of navbar. */
    }
    .navbar-wrapper .navbar {

    }

    /* Remove border and change up box shadow for more contrast */
    .navbar .navbar-inner {
      border: 0;
      -webkit-box-shadow: 0 2px 10px rgba(0,0,0,.25);
         -moz-box-shadow: 0 2px 10px rgba(0,0,0,.25);
              box-shadow: 0 2px 10px rgba(0,0,0,.25);
    }

    /* Downsize the brand/project name a bit */
    .navbar .brand {
      padding: 14px 20px 16px; /* Increase vertical padding to match navbar links */
      font-size: 16px;
      font-weight: bold;
      text-shadow: 0 -1px 0 rgba(0,0,0,.5);
    }

    /* Navbar links: increase padding for taller navbar */
    .navbar .nav > li > a {
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
      text-shadow: 0 1px 1px rgba(0,0,0,.4);
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
    .carousel-caption h1,
    .carousel-caption .lead {
      margin: 0;
      line-height: 1.25;
      color: #fff;
      text-shadow: 0 1px 1px rgba(0,0,0,.4);
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
      padding-top: 120px; /* Vertically center images part 1: add padding above and below text. */
      overflow: hidden; /* Vertically center images part 2: clear their floats. */
    }
    .featurette-image {
      margin-top: -120px; /* Vertically center images part 3: negative margin up the image the same amount of the padding to center it. */
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

    @media (max-width: 979px) {

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
      .featurette-image.pull-left,
      .featurette-image.pull-right {
        display: block;
        float: none;
        max-width: 40%;
        margin: 0 auto 20px;
      }
    }


    @media (max-width: 767px) {

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
      .carousel-caption .lead,
      .carousel-caption .btn {
        font-size: 18px;
      }

      .marketing .span4 + .span4 {
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
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet" type="text/css">
    <link href="bootstrap/css/font-awesome.css" rel="stylesheet" type="text/css">
    <link href="bootstrap/css/font-awesome.min.css" rel="stylesheet" type="text/css">
</head>
<body>

<div class="container">
<div class="navbar navbar-inverse navbar-fixed-top">
<div class="navbar-inner">
<a href="#" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-callapse">
<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</a>
<a class="brand" herf="#">师生交流社区</a>
<div  class="nav-collapse">
<ul class="nav nav-collapse">
<li ><a href="mainmenu.jsp">首页</a></li>
<li ><a href="notice">通知详情</a></li>
<li ><a href="competition">比赛资讯</a></li>
<li ><a href="download.jsp"">资源下载</a></li>
<li ><a href="groom.jsp"">书影推荐</a></li>
<li class="active"><a href="question.jsp">问题解答</a></li>
<li ><a href="userinfo.jsp">个人信息</a></li>
<li ><a href="#">班主任信箱</a></li>
<li ><a href="login.jsp">注销</a></li>
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
         <img src="bootstrap/img/feizhuliu_qixi-003.jpg"> </div>
        
      </div>
     
    </div><!-- /.carousel -->


	<div class="container">
		<ul id="timeline" class="timeline">
			<li class="active">
				<div class="check">
					<b class="spring"></b>
					<s></s>
					<b class="line"></b>
				</div>
				<div class="thumb">
					<img src="image/top1.jpg" alt="">
					<span>10:00</span>
				</div>
				<div class="content">
					<b></b>
					<h3>堆栈空间不足解决办法？</h3>
					<p>人asp.net调试中报“堆栈空间不足，无法继续安全地执行程序。调用堆栈上的函数过多或堆栈上的函数使用过多的堆栈空间时，会发生这种情况”原因是什么？</p>
				</div>
			</li>
			<li>
				<div class="check">
					<b class="spring"></b>
					<s></s>
					<b class="line"></b>
				</div>
				<div class="thumb">
					<img src="image/top4.jpg" />
					<span>7:30</span>
				</div>
				<div class="content">
					<b></b>
					<h3>oracle order by 求帮优化</h3>
					<p>select A.aId, (select count(1) from B where B.aId = a.aId) c from A
order by c
表A有30W+数据
表B有18W+数据
用上面sql查要10分钟，如果去掉order by则在2秒内，求高手指导怎么优化；</p>
				</div>
			</li>
			
		</ul>
	</div>
    
    
<div class="container" >    

<a href="#" data-toggle="modal" class="btn btn-primary">发布资讯</a>

<div class="modal hide" id="SubmitCompetition">
<a href="#" class="close" data-dismiss="modal">×</a>
<div class="page-header">
<div class="span4">
<h4 class="pull-left">发布资讯</h4>
</div>
</div>
<div class="modal-body">
<form class="form-horizontal">
<div>
<div class="control-group">
<label class="control-label">资讯标题</label>
<div class="controls">
<input type="text" placeholder="输入您的标题名" class="span3">
</div>
</div>
</div>
<div>
<div class="control-group">
<label class="control-label">资讯内容</label>
<div class="controls">
 <textarea class="form-horizontal" rows="8" cols="20"></textarea>
</div>
</div>
</div>


</form>
</div>
<div class="modal-footer">
<form class="form-horizontal">
<div class="span4">
<div class="control-group">
<label class="control-label">名称</label>
<div class="controls">
<input type="text" placeholder="输入您的文件名" class="span3">
</div>
</div>
</div>

<button type="button" class="btn btn-primary">发表</button>
<div class="span4">
<div class="control-group">
<label class="control-label">文件传输</label>
<div class="controls">
<input type="file" id="inputfile" >
</div>
</div>
</div>
</div>

</form>
</div>


</div>
</div>


</div>


</div>
</div>
</div>
    
    
    
    <script src="bootstrap/js/bootstrap.js"></script>
<script src="bootstrap/js/jquery-2.1.1.min.js"></script>

    
</body>
</html>
