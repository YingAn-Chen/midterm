<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>查詢</title>

<style>
form {
	margin: 0 auto;
	width: 400px;
}
</style>
</head>


<body>
	<form name="insertHighwayData" action="Search.do" method="POST">
		<table border='1'>
			<thead>
				<tr bgcolor='blue'>
					<th height="60" colspan="2" align="center">查詢</th>
				</tr>
			</thead>
			<tbody>
				<tr bgcolor='blue'>
					<td width="120" height="40">ID:</td>
					<td width="600" height="40" align="left"><input id='num'
						style="text-align: left" name="mId" value="${param.mId}"
						type="text" size="14">
						<div style="color: #FF0000; font-size: 60%; display: inline">${ErrorMsg.id}</div>
					</td>
				</tr>
				<tr bgcolor='blue'>
					<td height="50" colspan="2" align="center"><input
						type="submit" value="送出"></td>
				</tr>
				<tr bgcolor='blue'>
					<td height="50" colspan="2" align="center"><input
						type="button" value="返回" onclick="javascript:location.href='/jspExercise/ch07_01/InsertMemberForm.jsp'"></td>
				</tr>
			</tbody>
		</table>
		<div style="color: #FF0000; display: inline">${ErrorMsg.exception}</div>
	</form>
</body>
</html>