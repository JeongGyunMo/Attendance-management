<%@ page language="java" contentType="text/html; charset="UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta charset="EUC-KR">
	<title>Simile</title>
	<link rel="stylesheet" type="text/css" href="/resources/css/subscription.css"/>
</head>
<body bgcolor='#91A8d0';>
	<div class="inner_login">
    	<div class="login_t">
	   		<form method="post" id="authForm">
				<input type="hidden" name="redirectUrl">
				<table border="0">
					<tr>	
						<td>
			 				<label >名前</label>
			 			</td>
						<td>
		            		<div class="box_login">
		                		<div class="inp_text">
		                			<label for="loginId" class="screen_out">ID</label>
		                			<input type="email" id="loginId" name="loginId" placeholder="Name" >
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
		                		<label for="loginId" class="screen_out">ID</label>
		                		<input type="email" id="loginId" name="loginId" placeholder="Number" >
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
		               				<input type="email" id="loginId" name="loginId" placeholder="ID" >
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
		             				<label for="loginId" class="screen_out">ID</label>
		                			<input type="email" id="loginId" name="loginId" placeholder="PassWord" >
		            			</div>
							</div>
						</td>
					</tr>
				</table>
				<button type="submit" class="btn_login"  disabled>会員加入</button>
	    	</form>
    	</div>
	</div>
</body>
</html>