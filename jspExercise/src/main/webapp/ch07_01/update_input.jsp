<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mid success</title>
</head>
<body>
<h1>公司編號 ${ member.id } 的資料新增成功</h1>
完整名稱: ${ member.fullname }<br>
公司簡稱: ${ member.shortname }<br>
工業類別: ${ member.industry }<br>
住址: ${ member.adress }<br>
董事長: ${ member.chairman }<br>
總經理: ${ member.manager }<br>
發言人: ${ member.spokersman }<br>
電話: ${ member.telephone }<br>
</body>
</html>
<%-- 會員 ${ memberBean.name } 的資料新增成功</h1> --%>
<%-- 編號: ${ memberBean.memberId }<br> --%>
<%-- 地址: ${ memberBean.address }<br> --%>
<%-- 生日: ${ memberBean.birthday }<br> --%>
<%-- 註冊時間: ${ memberBean.registerDate }<br> --%>
<%-- 體重: ${ memberBean.weight }<br> --%>