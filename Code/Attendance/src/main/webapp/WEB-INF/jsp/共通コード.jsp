<!DOCTYPE html>
<html lang="en">
<head>
  <title>공통코드</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="jumbotron text-center mb-0" >
		<h1>공통코드</h1>
		<p>Resize this responsive page to see the effect!</p> 
	</div>
	<nav class="navbar navbar-expand-sm bg-danger navbar-dark mb-5">
	  <ul class="navbar-nav">
		<li class="nav-item">
		  <a class="nav-link" href="1.html">휴일관리(월)</a>
		</li>
		<li class="nav-item active">
		  <a class="nav-link" href="2.html">공통코드</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="3.html">직원관리</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="4.html">직원근무조회</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="5.html">근무등록</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="6.html">개인연가신청</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="7.html">개인연가(대표)</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="8.html">사원업무지시</a>
		</li>
	  </ul>
	</nav>

	<div class="container text-center">
		<form>
			<div class="text-right mb-3">
			  <button type="button" class="btn btn-primary">추가</button>
			  <button type="button" class="btn btn-danger">삭제</button>
			  <button type="button" class="btn btn-success">저장</button>
			</div>

			<table class="table table-striped table-hover">
			<thead class="thead-dark">
			  <tr>
				<th>선택</th>
				<th>소코드</th>
				<th>소코드명</th>
				<th>비고</th>
				<th>&nbsp;</th>
			  </tr>
			</thead>
			<tbody>
			  <tr>
				<td>&nbsp;</td>
				<td>1001</td>
				<td>사장</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>
			  <tr>
				<td>&nbsp;</td>
				<td>1002</td>
				<td>부장</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>
			  <tr>
				<td>&nbsp;</td>
				<td>1003</td>
				<td>과장</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>
			</tbody>
			</table>
		</form>
	</div>

	<div class="jumbotron text-center mb-0 mt-5">
	  <p>Footer</p>
	</div>

</body>
</html>
