<!DOCTYPE html>
<html lang="en">
<head>
  <title>개인연가신청</title>
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
		<h1>개인연가신청</h1>
		<p>Resize this responsive page to see the effect!</p> 
	</div>
	<nav class="navbar navbar-expand-sm bg-danger navbar-dark mb-5">
	  <ul class="navbar-nav">
		<li class="nav-item">
		  <a class="nav-link" href="1.html">휴일관리(월)</a>
		</li>
		<li class="nav-item">
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
		<li class="nav-item active">
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
			<div class="row">
				<div class="col-sm-4 text-left">
					<select name="month" class="custom-select">
						<option selected>year</option>
						<option value="2002">2020</option>
						<option value="2019">2019</option>
						<option value="2018">2018</option>
					</select>
				</div>
				<div class="col-sm-8 text-right mb-3">
				  <button type="button" class="btn btn-primary">추가</button>
				  <button type="button" class="btn btn-danger">삭제</button>
				  <button type="button" class="btn btn-success">저장</button>
				</div>
			</div>

			<table class="table table-striped table-hover">
			<thead class="thead-dark">
			  <tr>
				<th>일련번호</th>
				<th>이름</th>
				<th>연가종류</th>
				<th>시작일</th>
				<th>종료일</th>
				<th>사유</th>
				<th>일수</th>
				<th>승인구분</th>
			  </tr>
			</thead>
			<tbody>
			  <tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>
			  <tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>			  
			  <tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
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
