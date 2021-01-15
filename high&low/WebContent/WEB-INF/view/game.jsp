<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.PlayData" %>
<%
PlayData pd=(PlayData)session.getAttribute("pd");
String[] cards=pd.getCard();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>High&amp;Low</title>
</head>
<body>
<div id="card">
<img src="images/<%=pd.getCard()[pd.getCount()] %>.png" >
</div>
</body>
</html>