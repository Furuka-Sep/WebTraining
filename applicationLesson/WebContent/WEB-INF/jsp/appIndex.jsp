<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.SiteEV" %>
<%
SiteEV siteEV=(SiteEV) application.getAttribute("siteEV");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Botちゃんねる</title>
</head>
<body>
<h1>BotちゃんねるにINしました :)</h1>
<p>
<a href="/applicationLesson/AppIndex?action=like">すき</a>:
<%= siteEV.getLike() %>人
<a href="/applicationLesson/AppIndex?action=dislike">無理</a>:
<%= siteEV.getDislike() %>人
</p>
<h2>Botちゃんって何？</h2>
<p>Botちゃんとは偉大な存在である</p>
</body>
</html>