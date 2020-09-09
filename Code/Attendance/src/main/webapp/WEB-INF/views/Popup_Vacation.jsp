<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>休暇の申し込み</title>
</head>
<style>
	table{
        width: 95%;
	    height: 85%;
        margin: 0 auto;
	}
</style>
<body bgcolor='#91A8d0';>
	<table border="1">
		<tr align ="center" height = "10%">
			<td style = "background : #B7DEE8;">
				申請入力
			</td>
			<td style = " background : #B7DEE8;" colspan = "3">
				
			</td>
		</tr>
		<tr>
			<td align ="center" style = "background : #B7DEE8;">
				種別
			</td>
			<td colspan = "3">
			選択
			</td>
		</tr>
		<tr>
			<td align ="center" style = "background : #B7DEE8;">
				休暇開始日
			</td>
			<td>
			日付選択
			</td>
			<td style = "background : #B7DEE8;" align ="center">
			休暇終了日
			</td>
			<td>
			日付選択
			</td>
		</tr>
		<tr>
			<td align ="center" style = "background : #B7DEE8;">
			 休息理由
			</td>
			<td colspan = "3">
			</td>
		</tr>
		<tr>
			<td align ="center" style = "background : #B7DEE8;">
			参考
			</td>
			<td colspan = "3">
			</td>
		</tr>

	</table>
	<div style="position: fixed; right: 50px; bottom:20px;">
			<button type="submit" style = " background : #E4DCF0;width: 300px;height: 80px;">申請登録</button>
			<button type="submit" style = " background : #E4DCF0;width: 300px;height: 80px;">閉口</button>
	</div>

</body>
</html>