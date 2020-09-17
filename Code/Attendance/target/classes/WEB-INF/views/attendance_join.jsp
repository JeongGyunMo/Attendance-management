<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC>
<html>
<head>
	<title>Simile</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/join.css"/>
</head>
<body bgcolor='#91A8d0';>
	<div class="inner_login">
    	<div class="login_t">
    	<form:form role="form" commandName="JoinRequest" action="되돌아가기" method="post">
				<input type="hidden" name="redirectUrl">
				<table border="0">
					<tr>	
						<td>
			 				<label >名前</label>
			 			</td>
						<td>
		            		<div class="box_login">
		                		<div class="inp_text">
		                			<label for="loginId" class="screen_out">NM</label>
		                			<form:input type="text" class="form-control" placeholder="NAME" path="name"/>
                   					<form:errors path="name"/>
		                		</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>
				 			<label >社員番号</label>
					</td>
					<td>
		          		<div class="box_login">
		                	<div class="inp_text">
		                		<label for="loginId" class="screen_out">Number</label>
		                			<form:input type="number" class="form-control" placeholder="NUMBER" path="number"/>
                   					<form:errors path="number"/>
		                	</div>
						</div>
					</td>
					</tr>
					<tr>
						<td>
							<label >ID</label>
						</td>
						<td>
		    		        <div class="box_login">
								<div class="inp_text">
									<label for="loginId" class="screen_out">ID</label>
		               				<form:input type="text" class="form-control" placeholder="ID" path="id"/>
                    				<form:errors path="id"/>
		                		</div>
							</div>
						</td>
					</tr>
					<tr>
						<td>
							<label >PassWord</label>
						</td>
						<td>
							<div class="box_login">
		        				<div class="inp_text">
		             				<label for="loginId" class="screen_out">PassWord</label>
                    				<form:password class="form-control" placeholder="Password" path="password"/>
                   					<form:errors path="password"/>
		            			</div>
							</div>
						</td>
					</tr>
										<tr>
						<td>
							<label >CheckPassWord</label>
						</td>
						<td>
							<div class="box_login">
		        				<div class="inp_text">
		             				<label for="loginId" class="screen_out">CheckPassWord</label>
                    				<form:password class="form-control" placeholder="Password" path="checkPw"/>
                   					<form:errors path="checkPw"/>
		            			</div>
							</div>
						</td>
					</tr>
				</table>
				<button type="submit" class="btn_login"  disabled>会員加入</button>
	    	</form:form>
    	</div>
	</div>
</body>
</html>