<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="model.NumData" %>
 <%
 NumData numdata=(NumData) request.getAttribute("numdata");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>結果</title>
</head>
<body>
元の文字列:<%for(String s:numdata.getStrs()){ %>
<% if(s==numdata.getStrs()[numdata.getStrs().length]){ %>
<%=s %>
<% }else{ %>
<%=s %>,
<%	} %>
<%} %><br>
要素数:<%= numdata.getIndex() %><br>
最大値:<%= numdata.getSum() %>
最小値:<%= numdata.getMin() %>
合計:<%= numdata.getSum() %>
<a href="/numapp/Main">戻る</a>

</body>
</html>