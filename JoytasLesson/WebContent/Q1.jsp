<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*"%>
    <%String[] name={"足立","石川","宇佐美","大野"};%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Q1</title>
</head>
<body>
<ol>
	<% for(String s:name){%>
	<li><%= s%></li>
	<%}%>
</ol>
</body>
</html>