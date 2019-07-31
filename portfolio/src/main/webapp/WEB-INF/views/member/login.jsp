<!DOCTYPE=HTML>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<jsp:include page="../include/header.jsp" />
	<h1> 회원가입 </h1>
	<div class="container">
		<form class="form-horizantal" role="form" method="post" action="/member/loginPost">
			<div class="form-group">
				<label for="id" class="col-xs-2 col-lg-2 control-label">아이디</label>
				<div class="col-xs-10 col-lg-10">
					<input type="text" class="form-control" name="id" size="50">
				</div>
			</div>
			<div class="form-group">
				<label for="pwd" class="col-xs-2 col-lg-2 control-label">비밀번호</label>
				<div class="col-xs-10 col-lg-10">
					<input type="password" class="form-control" name="pwd" size="50">
				</div>
			</div>
			<div class="form-group">
				<div class="col-xs-offset-2 col-xs-10 col-lg-offset-2 col-lg-10 ">
					<input type="submit" class="btn btn-default" value="확인">
					<input type=button class="btn btn-default" onclick="location.href='/member/create'" value="회원가입" >
				</div>
			</div>
		</form>
	</div>
</body>
</html>