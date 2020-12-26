<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <link rel="stylesheet" href="css/main.css">
  <link href="https://fonts.googleapis.com/earlyaccess/nicomoji.css" rel="stylesheet">
  <title>じゃんけんぽん</title>
</head>
<body>
  <form action="/janken/jankenServlet" method="post">
    <input type="radio" name="hand" value="0">ぐー<br>
    <input type="radio" name="hand" value="1">ちょき<br>
    <input type="radio" name="hand" value="2">ぱー<br>
    <button type="submit" name="btn">ショウブ</button>
  </form>
</body>
</html>