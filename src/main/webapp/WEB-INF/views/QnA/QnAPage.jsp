<%@ page language="java" contentType="text/html; charset=UTF-8"
	trimDirectiveWhitespaces="true" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/9af1085f00.js"
	crossorigin="anonymous"></script>
</head>
<style>
.container{
	margin-top: 50px;
}
table{
	width : 500px;
	height: 100px;
	font-size: 15px;
}
</style>
<body>
<%@ include file="../home_top.jsp" %>
	<div class="container">
		<table style="text-align: center; border: 1px solid #dddddd">
			<thead>
				<tr>

					<th style="background-color: #eeeeee; text-align: center;"><b>번호</b></th>
					<th style="background-color: #eeeeee; text-align: center;"><b>카테고리</b></th>
					<th style="background-color: #eeeeee; text-align: center;"><b>제목</b></th>
					<th style="background-color: #eeeeee; text-align: center;"><b>작성자</b></th>
				

				</tr>
			</thead>
			<tbody>
					<tr>
						<td>${qnavo.qnaNum}</td>
						<td>${qnavo.qnaCat}</td>
						<td>${qnavo.brdTitle}</td>
						<td>${qnavo.memId}</td>
						
						</tr>
						<tr>
						<td colspan="4" style="background-color: #eeeeee; "><b>작성내용</b></td>
						</tr>
						<tr>
						<td colspan="4" style="height : 500px;">${qnavo.brdCntxt}</td>
						</tr>
			</tbody>
		</table>
		
	
	
	
	<c:if test="${userInfo.memId eq qnavo.memId}">
		<a href="/QnA/QnA_deleteProc?qnaNum=${qnavo.qnaNum}">삭제</a>
		<a href="/QnA/QnA_Update">수정</a>
	</c:if>

	<a href="/QnA/QnABoard">목록보기</a>

</div>

</body>
</html>