<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>勤務登録</title>
<meta charset="utf-8">
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
document.write('<st'+'yle>');
document.write('td {font-size:12px; font-family:굴림; text-decoration:none; }');
document.write('A:link,A:active,A:visited{text-decoration:none;font-size:12PX;color:#333333;}');
document.write('A:hover {text-decoration:none; color:ff9900}');
document.write('font { font-size: 9pt; }');
document.write('.cnj_input {position:relative;}');
document.write('.cnj_input2 {border-width:1; border-color:rgb(204,204,204); border-style:solid;}');
document.write('.cnj_input3 { border-width:1; border-style:solid; border-color:#000000; color:#0084D4; background-color:white;text-align:right;}');
document.write('.cnj_input4 { scrollbar-face-color: #FFCC33;scrollbar-shadow-color: #ffffff;scrollbar-highlight-color: #F3f3f3;scrollbar-3dlight-color: #ffffff;scrollbar-darkshadow-color: #F3f3f3;scrollbar-track-color: #ffffff;scrollbar-arrow-color: #f9f9f9; }');
document.write('</st'+'yle>');
 
var monthName=new Array("1月","2月","3月","4月","5月","6月","7月",
"8月","9月","10月","11月","12月")

var monthDays=new Array(31,28,31,30,31,30,31,31,30,31,30,31)
var now=new Date
var nowd=now.getDate()
var nowm=now.getMonth()
var nowy=now.getYear()
function showCalendar(day,month,year) {
if ((year%4==0||year%100==0)&&(year%400==0)) monthDays[1]=29; else monthDays[1]=28 //leap year test
var firstDay=new Date(year,month,1).getDay()
var cnj_str="<table border=0 cellpadding=5 cellspacing=1 align=center bgcolor=#CCCCCC>"
 
cnj_str+="<tr bgcolor=white><td colspan=7>"
cnj_str+="<table border=0 cellpadding=0 cellspacing=0 align=center width=100%>"
cnj_str+="<td><a href='javascript:;' onClick='nowm--; if (nowm<0) { nowy--; nowm=11; } showCalendar(nowd,nowm,nowy)' title='前月'> <<</a></td>"
cnj_str+="<td align=center>"+monthName[month].toUpperCase()+" "+(year+1900)+"年</td>"
cnj_str+="<td align=right><a href='javascript:;' onClick='nowm++; if (nowm>11) { nowy++; nowm=0; } showCalendar(nowd,nowm,nowy)' title='翌月'> >></a></td>"
cnj_str+="</tr></table>"
cnj_str+="</td></tr>"
cnj_str+="<tr align=center bgcolor='#FFFFB9'>"
cnj_str+="<th><font color='red'>日</font></th>"
cnj_str+="<th><font color='black'>月</font></th>"
cnj_str+="<th><font color='black'>火</font></th>"
cnj_str+="<th><font color='black'>水</font></th>"
cnj_str+="<th><font color='black'>木</font></th>"
cnj_str+="<th><font color='black'>金</font></th>"
cnj_str+="<th><font color='blue'>土</font></th>" 
cnj_str+="</tr>"
 
var dayCount=1
 
cnj_str+="<tr bgcolor=white>" //각 날짜별 기록을 보여주는 페이지 링크 추가하기
 
for (var i=0;i<firstDay;i++) cnj_str+="<td> " //공백
for (var i=0;i<monthDays[month];i++) {
if(dayCount==nowd) {
cnj_str+="<td align=center bgcolor='#FFFFB9'><b>" // 오늘 날짜일때 배경색 지정,글자 진하게
} else {
cnj_str+="<td align=center>" // 오늘 날짜가 아닐때 배경색 지정
}
 
cnj_str+="<a href=http://www.홈페이지.com/link"+dayCount+".html target=_blank>" // 링크설정
cnj_str+=dayCount++ // 날짜
cnj_str+="</a>"
 
if(dayCount==nowd) {
cnj_str+="</b>" // 오늘 날짜일때 글자 진하게
} else {
cnj_str+="" // 오늘 날짜가 글자 진하게 안함
}
 
if ((i+firstDay+1)%7==0&&(dayCount<monthDays[month]+1)) cnj_str+="<tr bgcolor=white>"
}
var totCells=firstDay+monthDays[month]
for (var i=0;i<(totCells>28?(totCells>35?42:35):28)-totCells;i++) cnj_str+="<td> "
cnj_str+="</table><BR>"
calendar.innerHTML=cnj_str
}
</script>
</head>
<body onLoad="showCalendar(nowd,nowm,nowy)" >

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
			<span id="calendar" class="cnj_input"style="width:35%"></span>

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

