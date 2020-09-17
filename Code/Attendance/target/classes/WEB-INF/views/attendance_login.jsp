<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC>
<html>
<head>
	<title>Simile</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/login.css"/>
</head>
<body bgcolor='#91A8d0'>
	<div class="inner_login">
		<div class="login_t">
			<form method="post" id="authForm">
				<input type="hidden" name="redirectUrl">
				<div class="box_login">
					<div class="inp_text">
						<label for="loginId" class="screen_out">ID</label>
`						<input type="email" id="loginId" name="loginId" placeholder="ID" >
					</div>
					<div class="inp_text">
						<label for="loginPw" class="screen_out">PassWord</label>
						<input type="password" id="loginPw" name="password" placeholder="Password" >
					</div>
				</div>
				<button type="submit" class="btn_login"  disabled>Login</button>
				<button type="submit" class="btn_new"  disabled>New</button>
`				<span class="txt_find">
					<a href="attendance_join" class="link_find">ID検索</a>
						/ 
					<a href="/member/find/password" class="link_find">PassWord検索</a>
				</span>
			</form>
		</div>
	</div>
</body>
</html>