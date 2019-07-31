<!DOCTYPE=HTML>
<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<jsp:include page="../include/header.jsp" />
	<div class="container">
		<form class="form-horizantal" role="form" method="post"
			action="/board/createPost" enctype="multipart/form-data">
			<div class="form-group">
				<label for="writer" class="col-xs-2 col-lg-2 control-label">작성자</label>
				<div class="col-xs-10 col-lg-10">
					${login.id}
				</div>
			</div>
			<div class="form-group">
				<label for="title" class="col-xs-2 col-lg-2 control-label">제목</label>
				<div class="col-xs-10 col-lg-10">
					<input type="text" class="form-control" name="title" size="20">
				</div>
			</div>
			<div class="form-group">
				<label for="content" class="col-xs-2 col-lg-2 control-label">내용</label>
				<div class="col-xs-10 col-lg-10">
					<input type="text" class="form-control" name="content" size="20">
				</div>
			</div>
			<div class="form-group">
				<label for="uploadFile" class="col-xs-2 col-lg-2 control-label">첨부파일</label>
				<div class="col-xs-10 col-lg-10">
					<input type="file" class="form-control" name="uploadFile" multiple>
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