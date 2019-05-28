<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首頁</title>

<style>
form {
	margin: 0 auto;
	width: 400px;
}
</style>
</head>
<body>
	<form name="insertHighwayData" action="#" method="POST">
			<span style="font-family:微軟正黑體;font-size:1em;">${SearchInfo}</span>
			<br>
		<div style="color: #FF0000; display: inline">${ErrorMsg.exception}</div>
	</form>
</body>
</html>