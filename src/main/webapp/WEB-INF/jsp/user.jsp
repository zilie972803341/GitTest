<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户首页</title>
</head>
<body>
	<h1>Hi!${username}</h1>
	<ul>
		<c:forEach items="${info}" var="item" varStatus="status">
			<li>${status.first}:${item}</li>
		</c:forEach>
	</ul>
	<ul>
		<li><a href="http://www.baidu.com" target="view_frame">百度</a></li>
		<li><a href="http://www.youku.com" target="view_frame">优酷</a>
	</ul>
	<iframe name="view_frame" width="800px" height="400px">		
	</iframe>
</body>
</html>