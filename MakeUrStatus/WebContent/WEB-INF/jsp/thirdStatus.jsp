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
<%= data.getRace(data.getRaceNum())%>のボーナスが適用されました！<br>
[<% for(String nKey : data.getStatus().keySet()){
    System.out.print(data.getStatus().get(nKey));
    System.out.print(" ");
    }%>]<br>
職業を選んでください<br>
戦士<input type="radio" name="job" value="0">
盗賊<input type="radio" name="job" value="1">
僧侶<input type="radio" name="job" value="2">
魔術師<input type="radio" name="job" value="3">
<input type="submit" value="決定">;
</form>
</body>
</html>