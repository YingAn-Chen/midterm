<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <jsp:useBean id="memberService" class="ch05_09.MemberService" /> --%>
<c:set var="subTitle" value="查詢會員資料(Lab07_02)" />
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- <c:if test="${empty LoginOK}">  --%>
<%--    <c:set var="target" value="${pageContext.request.servletPath}" scope="session" /> --%>
<%--    <c:redirect url="/ch06_01/login.jsp" /> --%>
<%-- </c:if> 	 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${subTitle}</title>
</head>
<body>
	<c:choose>
		<c:when test="${empty contextMemberBean}">
   			目前尚未有資料<br>
		</c:when>
		<c:otherwise>
                               公司資料如下：<br>
			<table border='1'>
				<tr>
					<th width='120'>公司編號</th>
					<th width='120'>完整名稱</th>
					<th width='140'>公司簡稱</th>
					<th width='150'>工業類別</th>
					<th width='130'>住址</th>
					<th width='150'>董事長</th>
					<th width='150'>總經理</th>
					<th width='150'>發言人</th>
					<th width='150'>電話</th>
					</tr>
				<c:forEach var="aBean" items="${contextMemberBean}">
					<tr>
						<td>${aBean.id}</td>
						<td>${aBean.fullname}</td>
						<td>${aBean.shortname}</td>
						<td>${aBean.industry}</td>
						<td>${aBean.adress}</td>
						<td>${aBean.chairman}</td>
						<td>${aBean.manager}</td>
						<td>${aBean.spokersman}</td>
						<td>${aBean.telephone}</td>
					</tr>
				</c:forEach>
			</table>

		</c:otherwise>
	</c:choose>
       <br>
<!--        <a href="../index.jsp">回首頁</a> -->
       <a href="<c:url value='InsertMemberForm.jsp' />">InSert</a>

</body>
</html>