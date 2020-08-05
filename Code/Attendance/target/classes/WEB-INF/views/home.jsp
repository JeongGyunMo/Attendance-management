<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
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
<table border="0" cellspacing="5">
	<thead cellspacing="30">
		<tr>
			<td><label><strong>Simile</label></td>
		</tr>
		<tr>
			<td><label>Attendance</label></td>
		</tr>	
	</thead>
	<tbody>
		<tr>
			<td><label for ="ID"><strong>ID</label></td>
		</tr>
		<tr>
			<td><input id="pass" type="text" size="30" value=""></td>
		</tr>
		<tr>
			<td><label for ="pass"><strong>Password</label></td>
		</tr>
		<tr>
			<td><input id="pass" type="password" size="30" value=""></td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<td><button>ok</button></td>
		</tr>
		<tr>
			<td><button>new</button></td>
		</tr>
	</tfoot>
</body>
</html>
