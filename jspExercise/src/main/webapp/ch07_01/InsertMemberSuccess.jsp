<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mid success</title>
</head>
<body>
<h1>公司編號 ${ memberBean.id } 的資料新增成功</h1>
完整名稱: ${ memberBean.fullname }<br>
公司簡稱: ${ memberBean.shortname }<br>
工業類別: ${ memberBean.industry }<br>
住址: ${ memberBean.adress }<br>
董事長: ${ memberBean.chairman }<br>
總經理: ${ memberBean.manager }<br>
發言人: ${ memberBean.spokersman }<br>
電話: ${ memberBean.telephone }<br>
</body>
</html>
<%-- 會員 ${ memberBean.name } 的資料新增成功</h1> --%>
<%-- 編號: ${ memberBean.memberId }<br> --%>
<%-- 地址: ${ memberBean.address }<br> --%>
<%-- 生日: ${ memberBean.birthday }<br> --%>
<%-- 註冊時間: ${ memberBean.registerDate }<br> --%>
<%-- 體重: ${ memberBean.weight }<br> --%>