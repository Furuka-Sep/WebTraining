<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common.jsp"%>
<%
Date date=new Date();
SimpleDateFormat sdf=new SimpleDateFormat("MM月dd日");
String today=sdf.format(date);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>includeDirectiveSample</title>
</head>
<body>
<p>ケッハモルタァ　ケッハモヌラタァ・・・キェェェェェ！！</p>
<%= name %>さんの<%= today %>の運勢は・・・間違いなく大凶です。。。
</body>
</html>