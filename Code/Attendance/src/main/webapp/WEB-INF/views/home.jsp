<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC>
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
<table border="1" cellspacing="5">
		<tr>
			<td rowspan="8"width ="500" height="300"></td>
			<td><label><strong>Simile</label></td>
		</tr>
		<tr>
			<td><label>Attendance</label></td>
		</tr>	
		<tr>
			<td><label for ="ID"><strong>ID</label></td>
		</tr>
		<tr>
			<td><input id="ID" type="text" size="30" value=""></td>
		</tr>
		<tr>
			<td><label for ="pass"><strong>Password</label></td>
		</tr>
		<tr>
			<td><input id="pass" type="password" size="30" value=""></td>
		</tr>
		<tr>
			<td><button>ok</button><button onclick="showpopup();" >new</button></td>
		</tr>
</table>
</body>
<script type="text/javascript">
	function showpopup() {
		var url ="";
  		window.open("/WEB-INF/views/subscription.jsp/", "NEW", "width=300, height=360");
	}
</script>
</html>
