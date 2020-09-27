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
    	<form role="form" action="join" method="post">
				<input type="hidden" name="redirectUrl">
				<table border="0">
					<tr>	
						<td>
			 				<label >名前</label>
			 			</td>
						<td>
		            		<div class="box_login">
		                		<div class="inp_text">
		                			<label for="loginId" class="screen_out">Name</label>
		                			<input type="text" id="EMPLOYEE_NM" name="EMPLOYEE_NM" placeholder="Name" >
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
		                			<input type="text" id="EMPLOYEE_NUMBER" name="EMPLOYEE_NUMBER" placeholder="Number" >
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
		               				<input type="email" id="EMPLOYEE_ID" name="EMPLOYEE_ID" placeholder="ID" >
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
                    				<input type="password" id="PASSWORD" name="PASSWORD" placeholder="PassWord" >
		            			</div>
							</div>
						</td>
					</tr>
				</table>
				<button type="submit" class="btn_login">会員加入</button>
	    	</form>
    	</div>
	</div>
</body>
</html>