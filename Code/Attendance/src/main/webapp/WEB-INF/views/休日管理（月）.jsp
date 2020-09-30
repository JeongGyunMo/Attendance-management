<!DOCTYPE html>
<html lang="en">
<head>
  <title>휴일관리(월)</title>
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
		<h1>휴일관리(월)</h1>
		<p>Resize this responsive page to see the effect!</p> 
	</div>
	<nav class="navbar navbar-expand-sm bg-danger navbar-dark mb-5">
	  <ul class="navbar-nav">
		<li class="nav-item active">
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
			<div class="input-group mb-3">
				<input type="text" class="form-control" placeholder="Year">

				<select name="month" class="custom-select">
					<option selected>Month</option>
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
				</select>

				<div class="input-group-append">
					<button class="btn btn-primary" type="submit">검색</button>
				</div>
			</div>

			<table class="table table-striped table-hover">
			<thead class="thead-dark">
			  <tr>
				<th>일시</th>
				<th>휴일</th>
				<th>비고</th>
			  </tr>
			</thead>
			<tbody>
			  <tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>
			  <tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>
			  <tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>
			  <tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>
			  <tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>
			</tbody>
			</table>

			<div class="input-group mb-3">
			<button type="button" class="btn btn-primary btn-block mt-5">저장</button>
			</div>
		</form>
	</div>

	<div class="jumbotron text-center mb-0 mt-5">
	  <p>Footer</p>
	</div>

</body>
</html>
