<%@ page language="java" pageEncoding="utf-8"%>
<%@ page isErrorPage="true" contentType="text/html";%>

<html>

<head>
</head>

<body>

	请求地址：${pageContext.errorData.requestURI}
	<br> 状态码： ${pageContext.errorData.statusCode}
	<br> 异常： ${pageContext.errorData.throwable}
	<br>

</body>

</html>
