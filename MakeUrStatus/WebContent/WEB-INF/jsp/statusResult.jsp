<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Data" %>
    <% Data data=(Data) request.getAttribute("data"); %>
    <% String[] para= {"体力","魔力","筋力","器用","敏捷"}; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>あなたのステータス</title>
</head>
<body>
<form action="/MakeUrStatus/StatusEdit" method="post">
<%= data.getJob()[data.getJobNum()]%>のボーナスが適用されました!<br>
[<% for(String nKey : data.getStatus().keySet()){
    System.out.print(data.getStatus().get(nKey));
    System.out.print(" ");
    }%>]<br>
***作成成功!***<br>
私は<%= data.getJob()[data.getJobNum()]%>の<%= data.getRace(data.getRaceNum()) %>、<%= data.getName() %>です。<br>
能力値(<%= data.getSum()%>)を高い順に並べると<br>
です。<br>
魔王倒します。<br>
</form>
</body>
</html>