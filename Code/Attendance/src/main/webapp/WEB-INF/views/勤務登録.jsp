<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<title>勤務登録</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="style.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<script>
	function attClock() {
		var currentDate = new Date();
		var attClock = document.getElementById('attClock');

		var msg = currentDate.getFullYear() + "-"
		msg += (currentDate.getMonth() + 1) + "-";
		msg += currentDate.getDate() + " ";
		msg += currentDate.getHours() + ":";
		msg += currentDate.getMinutes() + ":";
		msg += currentDate.getSeconds();
		attClock.innerText = msg;
		
		$.ajax({
			url: "Clock.att",
			data: "Clock=" + attClock.textContent,
			type: "POST",
			success : function(data){
				alert("성공")
			},
			error : function(){
				alert("에러")		
			}
		});
	}
	function leaClock() {
		var currentDate = new Date();
		var leaClock = document.getElementById("leaClock");

		var msg = currentDate.getFullYear() + "-"
		msg += (currentDate.getMonth() + 1) + "-";
		msg += currentDate.getDate() + " ";
		msg += currentDate.getHours() + ":";
		msg += currentDate.getMinutes() + ":";
		msg += currentDate.getSeconds();

		leaClock.innerText = msg;
		
		$.ajax({
			url: "Clock.lea",
			data: "Clock=" + leaClock.textContent,
			type: "POST",
			success : function(data){
				alert("성공")
			},
			error : function(){
				alert("에러")		
			}
		});
	}
</script>
<script>
window.onload = function () {
	kCalendar('kCalendar');
	};
function kCalendar(id, date) {
	var kCalendar = document.getElementById(id);
	
	if( typeof( date ) !== 'undefined' ) {
		date = date.split('-');
		date[1] = date[1] - 1;
		date = new Date(date[0], date[1], date[2]);
	} else {
		var date = new Date();
	}
	var currentYear = date.getFullYear();
	//년도를 구함
	
	var currentMonth = date.getMonth() + 1;
	//연을 구함. 월은 0부터 시작하므로 +1, 12월은 11을 출력
	
	var currentDate = date.getDate();
	//오늘 일자.
	
	date.setDate(1);
	var currentDay = date.getDay();
	//이번달 1일의 요일은 출력. 0은 일요일 6은 토요일
	
	var dateString = new Array('sun', 'mon', 'tue', 'wed', 'thu', 'fri', 'sat');
	var lastDate = new Array(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
	if( (currentYear % 4 === 0 && currentYear % 100 !== 0) || currentYear % 400 === 0 )
		lastDate[1] = 29;
	//각 달의 마지막 일을 계산, 윤년의 경우 년도가 4의 배수이고 100의 배수가 아닐 때 혹은 400의 배수일 때 2월달이 29일 임.
	
	var currentLastDate = lastDate[currentMonth-1];
	var week = Math.ceil( ( currentDay + currentLastDate ) / 7 );
	//총 몇 주인지 구함.
	
	if(currentMonth != 1)
		var prevDate = currentYear + '-' + ( currentMonth - 1 ) + '-' + currentDate;
	else
		var prevDate = ( currentYear - 1 ) + '-' + 12 + '-' + currentDate;
	//만약 이번달이 1월이라면 1년 전 12월로 출력.
	
	if(currentMonth != 12) 
		var nextDate = currentYear + '-' + ( currentMonth + 1 ) + '-' + currentDate;
	else
		var nextDate = ( currentYear + 1 ) + '-' + 1 + '-' + currentDate;
	//만약 이번달이 12월이라면 1년 후 1월로 출력.

	
	if( currentMonth < 10 )
		var currentMonth = '0' + currentMonth;
	//10월 이하라면 앞에 0을 붙여준다.
	
	var calendar = '';
	
	calendar += '<div id="header">';
	calendar += '			<span><a href="#" class="button left" onclick="kCalendar(\'' +  id + '\', \'' + prevDate + '\')"><</a></span>';
	calendar += '			<span id="date">' + currentYear + '년 ' + currentMonth + '월</span>';
	calendar += '			<span><a href="#" class="button right" onclick="kCalendar(\'' + id + '\', \'' + nextDate + '\')">></a></span>';
	calendar += '		</div>';
	calendar += '		<table border="0" cellspacing="0" cellpadding="0">';
	calendar += '			<caption>' + currentYear + '년 ' + currentMonth + '월 달력</caption>';
	calendar += '			<thead>';
	calendar += '				<tr>';
	calendar += '				  <th class="sun" scope="row">일</th>';
	calendar += '				  <th class="mon" scope="row">월</th>';
	calendar += '				  <th class="tue" scope="row">화</th>';
	calendar += '				  <th class="wed" scope="row">수</th>';
	calendar += '				  <th class="thu" scope="row">목</th>';
	calendar += '				  <th class="fri" scope="row">금</th>';
	calendar += '				  <th class="sat" scope="row">토</th>';
	calendar += '				</tr>';
	calendar += '			</thead>';
	calendar += '			<tbody>';
	
	var dateNum = 1 - currentDay;
	
	for(var i = 0; i < week; i++) {
		calendar += '			<tr>';
		for(var j = 0; j < 7; j++, dateNum++) {
			if( dateNum < 1 || dateNum > currentLastDate ) {
				calendar += '				<td class="' + dateString[j] + '"> </td>';
				continue;
			}
			calendar += '				<td class="' + dateString[j] + '">' + dateNum + '</td>';
		}
		calendar += '			</tr>';
	}
	
	calendar += '			</tbody>';
	calendar += '		</table>';
	
	kCalendar.innerHTML = calendar;
}
</script>
</head>
<body>
	<div class="jumbotron text-center mb-0">
		<h1>勤務登録</h1>
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
		<div class="row">
			<span id="kCalendar" class="cnj_input" style="width:35%"></span>
			<div class="col-md-7 col-sm-12">
				<div class="text-right mb-3">
					<button type="button" class="btn btn-primary"
						onClick="location.href='/職員勤務照'">月別勤務照会</button>
					<button type="button" class="btn btn-success" onClick="attClock()">出勤</button>
					<button type="button" class="btn btn-danger" onClick="leaClock()">退勤</button>
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
	<div class="jumbotron text-center mb-0 mt-5">
		<p>Footer</p>
	</div>

</body>
</html>

