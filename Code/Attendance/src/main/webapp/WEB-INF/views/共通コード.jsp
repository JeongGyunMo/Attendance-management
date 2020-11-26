<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="en">
<head>
<title>共通コード</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="./style.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="jumbotron text-center mb-0">
		<h1>共通コード</h1>
		<p>Resize this responsive page to see the effect!</p>
	</div>
	<nav class="navbar navbar-expand-sm bg-danger navbar-dark mb-5">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/休日管理(月)">休日管理(月)</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/共通コード">共通コード</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/職員管理">職員管理</a></li>
			<li class="nav-item"><a class="nav-link" href="/職員勤務照">職員勤務照会</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/勤務">勤務登録</a></li>
			<li class="nav-item"><a class="nav-link" href="/個人休暇申請">個人休暇申請</a>
			</li>
			<li class="nav-item active"><a class="nav-link" href="/個人休暇(代表)">個人休暇(代表)</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="/社員業務指示">社員業務指示</a>
			</li>
		</ul>
	</nav>

	<div class="container text-center">
		<form>
			<div class="text-right mb-3">
				<button type="button" class="btn btn-primary">追加</button>
				<button type="button" class="btn btn-danger">削除</button>
				<button type="button" class="btn btn-success">貯蔵</button>
			</div>

			<table class="table table-striped table-hover">
				<thead class="thead-dark">
					<tr>
						<th>選択</th>
						<th>小コード</th>
						<th>小コード名</th>
						<th>備考</th>
						<th>&nbsp;</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>&nbsp;</td>
						<td>1001</td>
						<td>社長</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>1002</td>
						<td>部長</td>
						<td>&nbsp;</td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td>&nbsp;</td>
						<td>1003</td>
						<td>課長</td>
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
