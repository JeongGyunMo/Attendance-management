<%@ page language="java" contentType="text/html; charset="UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta charset="EUC-KR">
	<title>Simile</title>
</head>
<style>
body{
	text-align : center;
	background-color: #F5F6F7
}

table{
height: 100px;
margin: auto;
text-align: center;
}
button{
	background-color : #2db400;
	color : #ffffff;
}
</style>
<body>
	<table border="1" cellspacing="5" width ="500" height="300">
		<tr>
			<td colspan ="2"><strong>등록화면</td>
		</tr>
		<tr>
			<td><label for ="NAME"><strong>이름</label></td>
			<td><input id="NAME" type="text" size="30" value=""></td>
		</tr>
		<tr>
			<td><label for ="NUMBLE"><strong>사원번호</label></td>
			<td><input id="NUMBLE" type="text" size="30" value=""></td>
		</tr>
		<tr>
			<td><label for ="ID"><strong>아이디</label></td>
			<td><input id="ID" type="text" size="30" value=""></td>
		</tr>
		<tr>
			<td><label for ="PASSWORD"><strong>패스워드</label></td>
			<td><input id="PASSWORD" type="text" size="30" value=""></td>
		</tr>
		<tr>
			<td colspan="2"><button>ok</button><button>close</button></td>
		</tr>
		
	</table>
</body>
</html>