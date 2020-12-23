<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<title>勤務登録</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="/static/css/style.css">
<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/static/js/Time.js"></script>
<script type="text/javascript" src="/static/js/Calendar.js"></script>
</head>
<body>
	<!--▼▼▼ヘッダ▼▼▼-->
	<div class="jumbotron text-center mb-0">
		<h1>勤務登録</h1>
		<p>Resize this responsive page to see the effect!</p>
	</div>
	<!--▲▲▲ヘッダ▲▲▲-->

	<!--▼▼▼ボディ▼▼▼-->
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
	<!--▼▼▼ボタンはこの行に記述してください。▼▼▼-->
	<div class="container text-center">
		<div class="row">
			<span id="kCalendar" class="cnj_input" style="width: 35%"></span>
			<div class="col-md-7 col-sm-12">
				<div class="text-right mb-3">
					<button type="button" class="btn btn-primary"
						onClick="location.href='/職員勤務照'">月別勤務照会</button>
					<button type="button" class="btn btn-success" onClick="attTime()">出勤</button>
					<button type="button" class="btn btn-danger" onClick="leaTime()">退勤</button>
				</div>
				<table class="table table-striped table-hover mb-5">
					<colgroup>
						<col width="40%">
					</colgroup>
					<tbody class="table-striped2">
						<tr>
							<th>出勤時間</th>
							<td>
								<div id="attClock" class="clock"></div>
							</td>
						</tr>
						<tr>
							<th>退勤時間</th>
							<td><div id="leaClock" class="clock"></div></td>
						</tr>
						<tr>
							<th>業務内容</th>
							<td>&nbsp;</td>
						</tr>
					</tbody>
				</table>

				<button type="button" class="btn btn-primary btn-block btn-lg mb-5">초과근무추가</button>

				<table class="table table-striped table-hover mb-5">
					<colgroup>
						<col width="40%">
					</colgroup>
					<tbody class="table-striped2">
						<tr>
							<th>開始時間</th>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<th>終了時間</th>
							<td>&nbsp;</td>
						</tr>
						<tr>
							<th>業務内容</th>
							<td>&nbsp;</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<!--▲▲▲ボディ▲▲▲-->
	<div class="jumbotron text-center mb-0 mt-5">
		<p>Footer</p>
	</div>
</body>
</html>

