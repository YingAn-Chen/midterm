<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mid form</title>
<style>
form {
	margin: 0 auto;
	width: 600px;
	border-radius: 15px;
}
thead{
border-top-left-radius:15px;
}
</style>
</head>

<body onload="javascript:document.insertMemberFormA.cId.focus();">
	<!-- 	<form name="insertMemberFormA" action="member.do" method="POST"> -->
	<form id="form1" method="get" action=update.do>
<input type="text" name='codeid' id='codeid'>
<input type=submit value="送出" ></form>
	<form name="updateFormA" action=update.do	method="GET">
		<table border="1">
			<thead>
				<tr bgcolor='blue' style ="border-top-left-radius:15px">
					<th height="60" colspan="2" align="center">資料新增</th>
				</tr>
			</thead>
			<tbody>
				<tr bgcolor='blue'>
					<td  width="120" height="40">公司編號:</td>
					<td width="600" height="40" align="left"><input id='cId'
						style="text-align: left" name="cId" value="${param.cId}"
						type="text" size="20">
						<div style="color: #FF0000; font-size: 60%; display: inline">${ErrorMsg.id}</div>
					</td>
				</tr>
				<tr bgcolor='blue'>
					<td width="120" height="40">完整名稱:</td>
					<td width="600" height="40" align="left"><input id='cfName'
						style="text-align: left" name="cfName" value="${param.cfName}"
						type="text" size="14">
						<div style="color: #FF0000; font-size: 60%; display: inline">${ErrorMsg.fullname}</div>
					</td>
				</tr>
				<tr bgcolor='blue'>
					<td width="120" height="40">公司簡稱:</td>
					<td width="600" height="40" align="left"><input name="scName"
						value="${param.scName}" type="text" size="20">
						<div style="color: #FF0000; font-size: 60%; display: inline">${ErrorMsg.shortname}</div>
					</td>
				</tr>
				<tr bgcolor='blue'>
					<td width="120" height="40">產業別:</td>
					<td width="600" height="40" align="left"><input name="cinName"
						value="${param.cinName}" type="text" size="20">
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.industry}</div>
					</td>
				</tr>
				<tr bgcolor='blue'>
					<td width="120" height="40">住址:</td>
					<td width="600" height="40" align="left"><input
						name="cAddress" value="${param.cAddress}" type="text" size="45">
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.address}</div>
					</td>
				</tr>

				<tr bgcolor='blue'>
					<td width="120" height="40">董事長:</td>
					<td width="600" height="40" align="left"><input name="cchName"
						value="${param.cchName}" type="text" size="20">
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.chairman}</div>
					</td>
				</tr>
				<tr bgcolor='blue'>
					<td width="120" height="40">總經理:</td>
					<td width="600" height="40" align="left"><input name="cmaName"
						value="${param.cmaName}" type="text" size="20">
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.manager}</div>
					</td>
				</tr>

				<tr bgcolor='blue'>
					<td width="120" height="40">發言人:</td>
					<td width="600" height="40" align="left"><input
						name="cspoName" value="${param.cspoName}" type="text" size="14">
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.spokersman}</div>
					</td>
				</tr>
				<tr bgcolor='blue'>
					<td width="120" height="40">電話:</td>
					<td width="600" height="40" align="left"><input
						name="cTelephone" value="${param.cTelephone}" type="text"
						size="14">
						<div style="color: #FF0000; font-size: x-small; display: inline">${ErrorMsg.telephone}</div>
					</td>
				</tr>

				<tr bgcolor='blue'>
					<td height="50" colspan="2" align="center">
					<input type="submit" value="修改"> 
					
					</td>
				</tr>
				
			</tbody>
		</table>
		<div style="color: #FF0000; display: inline">${ErrorMsg.exception}</div>
	</form>
	
</body>
</html>
