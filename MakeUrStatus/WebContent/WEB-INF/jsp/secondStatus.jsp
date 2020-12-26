<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Data" %>
    <% Data data=(Data) request.getAttribute("data"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>あなたのステータス</title>
</head>
<body>
<form action="/MakeUrStatus/StatusEdit" method="post">
初期ステータスが決定しました<br>
[<% for(String nKey : data.getStatus().keySet()){
    System.out.print(data.getStatus().get(nKey));
    System.out.print(" ");
	}%>]<br>
種族を選んでください<br>
人間<input type="radio" name="race" value="0">
エルフ<input type="radio" name="race" value="1">
オーガ<input type="radio" name="race" value="2">
プクリポ<input type="radio" name="race" value="3">
<input type="submit" value="決定">;
</form>
</body>
</html>