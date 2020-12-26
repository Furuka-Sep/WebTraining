<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>あなたのステータス</title>
</head>
<body>
<h1>あなたのステータスを作成します</h1>
<form action="/MakeUrStatus/StatusEdit" method="post">
あなたの名前を教えてください。<br>
<input type="text" name="name">
<input type="submit" value="決定">;
<br>
</form>
</body>
</html>