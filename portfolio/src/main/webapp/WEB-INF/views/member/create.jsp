<!DOCTYPE=HTML>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<script>
function idCheck(){
	var text = $("#id").val();
	
	var reqexp = regxp = /[0-9a-zA-Z]/;
	
	for(var i=0; i<text.length; i++){
		if(text.charAt(i) != "" && regexp.test(text.charAt(i)) == false){
			alert("한글이나 특수문자는 입력불가능 합니다.");
			return false;
		}
	}
	overlapCheck();
}

function overlapCheck() {
	var idChk = $("#id").val();
	
	if(idChk == '' || idChk == null){
		alert("아이디를 입력하세요.");
		$("#id").focus();
		return false;
	}
	
}
</script>
<body>
	<jsp:include page="../include/header.jsp" />
	<h1> 회원가입 </h1>
	<div class="container">
		<form class="form-horizantal" role="form" method="post">
			<div class="form-group">
				<label class="col-xs-2 col-lg-2 control-label">아이디</label>
				<div class="col-xs-10 col-lg-10">
					<input type="text" class="form-control" name="id" size="50">
				</div>
			</div>
			<div class="form-group">
				<label class="col-xs-2 col-lg-2 control-label">비밀번호</label>
				<div class="col-xs-10 col-lg-10">
					<input type="password" class="form-control" name="pwd" size="50">
				</div>
			</div>
			<div class="form-group">
				<label class="col-xs-2 col-lg-2 control-label">이름</label>
				<div class="col-xs-10 col-lg-10">
					<input type="text" class="form-control" name="name" size="10">
				</div>
			</div>
			<div class="form-group">
				<div class="col-xs-offset-2 col-xs-10 col-lg-offset-2 col-lg-10 ">
					<input type="submit" class="btn btn-default" value="확인">
				</div>
			</div>
		</form>
	</div>
</body>
</html>