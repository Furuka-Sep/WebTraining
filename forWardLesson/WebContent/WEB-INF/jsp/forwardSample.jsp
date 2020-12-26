<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String fortune=(String)request.getAttribute("ft");
    String weather=(String)request.getAttribute("wt");
    Integer comfortableIndex=(Integer)request.getAttribute("ci");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フォワードのサンプル</title>
</head>
<body>
<h1>フォワードのサンプル</h1>
<p><%=fortune %></p>
<p><%=weather %></p>
<p>あなたの快適度指数:<%=comfortableIndex %></p>
</body>
</html>