<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.NumData" %>
<%
	NumData numdata=(NumData)request.getAttribute("numdata");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<p><%= numdata.getInch() %>inchは<%= numdata.getCm() %>cmです</p>
<a href="/InchConverter/Main">戻る</a>
</body>
</html>