<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>勤務登録</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <link rel="stylesheet" href="style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="jumbotron text-center mb-0" >
		<h1>勤務登録</h1>
		<p>Resize this responsive page to see the effect!</p> 
	</div>
	<nav class="navbar navbar-expand-sm bg-danger navbar-dark mb-5">
	  <ul class="navbar-nav">
		<li class="nav-item">
		  <a class="nav-link" href="1.html">休日管理(月)</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="2.html">共通コード</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="3.html">職員管理</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="4.html">職員勤務照会</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="5.html">勤務登録</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="6.html">個人休暇申請</a>
		</li>
		<li class="nav-item active">
		  <a class="nav-link" href="7.html">個人休暇(代表)</a>
		</li>
		<li class="nav-item">
		  <a class="nav-link" href="8.html">社員業務指示</a>
		</li>
	  </ul>
	</nav>

	<div class="container text-center">
		<div class="row">
			<div class="col-md-5 col-sm-12">
				<div class="month">      
				  <ul>
					<li class="prev">&#10094;</li>
					<li class="next">&#10095;</li>
					<li>
					  August<br>
					  <span style="font-size:18px">2020</span>
					</li>
				  </ul>
				</div>

				<ul class="weekdays">
				  <li>Mo</li>
				  <li>Tu</li>
				  <li>We</li>
				  <li>Th</li>
				  <li>Fr</li>
				  <li>Sa</li>
				  <li>Su</li>
				</ul>

				<ul class="days">  
				  <li>1</li>
				  <li>2</li>
				  <li>3</li>
				  <li>4</li>
				  <li>5</li>
				  <li>6</li>
				  <li>7</li>
				  <li>8</li>
				  <li>9</li>
				  <li><span class="active">10</span></li>
				  <li>11</li>
				  <li>12</li>
				  <li>13</li>
				  <li>14</li>
				  <li>15</li>
				  <li>16</li>
				  <li>17</li>
				  <li>18</li>
				  <li>19</li>
				  <li>20</li>
				  <li>21</li>
				  <li>22</li>
				  <li>23</li>
				  <li>24</li>
				  <li>25</li>
				  <li>26</li>
				  <li>27</li>
				  <li>28</li>
				  <li>29</li>
				  <li>30</li>
				  <li>31</li>
				</ul>
		</div>

		<div class="col-md-7 col-sm-12">
			<div class="text-right mb-3">
			  <button type="button" class="btn btn-primary">月別勤務照会</button>
			  <button type="button" class="btn btn-success">出勤</button>
			  <button type="button" class="btn btn-danger">退勤</button>
			</div>

			<table class="table table-striped table-hover mb-5">
			<colgroup>
				<col width="40%">
			</colgroup>
			<tbody class="table-striped2">
			  <tr>
				<th>出勤時間</th>
				<td>&nbsp;</td>
			  </tr>
			  <tr>
				<th>退勤時間</th>
				<td>&nbsp;</td>
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

