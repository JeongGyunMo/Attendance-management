<%@ page language="java" contentType="text/html; charset="UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta charset="EUC-KR">
	<title>Simile</title>
</head>
<style>
a {
    color: #333;
    text-decoration: none;
}
table{
        width: 320px;
        margin: 0 auto;
}
input {
    -webkit-writing-mode: horizontal-tb !important;
    text-rendering: auto;
    color: initial;
    letter-spacing: normal;
    word-spacing: normal;
    text-transform: none;
    text-indent: 0px;
    text-shadow: none;
    display: inline-block;
    text-align: start;
    -webkit-appearance: textfield;
    background-color: white;
    -webkit-rtl-ordering: logical;
    cursor: text;
    margin: 0em;
    font: 400 13.3333px Arial;
    padding: 1px 0px;
    border-width: 2px;
    border-style: inset;
    border-color: initial;
    border-image: initial;
}
.inner_login {
    position: absolute;
    left: 50%;
    top: 50%;
    margin: -145px 0 0 -160px;
}
.login_t{
        position: relative;
        width: 320px;
        margin: 0 auto;
    }
.screen_out {
    position: absolute;
    width: 0;
    height: 0;
    overflow: hidden;
    line-height: 0;
    text-indent: -9999px;    
}
body, button, input, select, td, textarea, th {
    font-size: 13px;
    line-height: 1.5;
    -webkit-font-smoothing: antialiased;
}    
fieldset, img {
    border: 0;
}
.login_t .box_login {
    margin: 10px 10 10;
    border: 1px solid #ddd;
    border-radius: 3px;
    background-color: #fff;
    box-sizing: border-box;
}
.login_t .inp_text {
    position: relative;
    width: 100%;
    margin: 0;
    padding: 18px 19px 19px;
    box-sizing: border-box;
}
.login_t .inp_text+.inp_text {
    border-top: 1px solid #ddd;
}
.inp_text input {
    display: block;
    width: 100%;
    height: 100%;
    font-size: 13px;
    color: #000;
    border: none;
    outline: 0;
    -webkit-appearance: none;
    background-color: transparent;
}
.btn_login {
    margin: 20px 0 0;
    width: 100%;
    height: 48px;
    border-radius: 3px;
    font-size: 16px;
    color: #fff;
    background-color: #000;
}

.btn_new {
    margin: 20px 0 0;
    width: 25%;
    height: 24px;
    border-radius: 3px;
    font-size: 10px;
    color: #fff;
    background-color: #000;
}
</style>
<body bgcolor='#91A8d0';>
<div class="inner_login">
    <div class="login_t">
        <form method="post" id="authForm">
            <input type="hidden" name="redirectUrl">

            <fieldset>
<table border="0">
<tr>	
	<td>
	 <label >名前</label>
	</td>
	<td>
            <div class="box_login">
                <div class="inp_text">
                <label for="loginId" class="screen_out">ID</label>
                <input type="email" id="loginId" name="loginId" placeholder="Name" >
                </div>
	</div>
	</td>
</tr>
<tr>
	<td>
		 <label >社員番号</label>
	</td>
	<td>
            <div class="box_login">
                <div class="inp_text">
                <label for="loginId" class="screen_out">ID</label>
                <input type="email" id="loginId" name="loginId" placeholder="Number" >
                </div>
	</div>
	</td>
</tr>
<tr>
	<td>
		 <label >ID</label>
	</td>
	<td>
            <div class="box_login">
                <div class="inp_text">
                <label for="loginId" class="screen_out">ID</label>
                <input type="email" id="loginId" name="loginId" placeholder="ID" >
                </div>
	</div>
	</td>
</tr>
<tr>
	<td>
		 <label >PassWord</label>
	</td>
	<td>
            <div class="box_login">
                <div class="inp_text">
                <label for="loginId" class="screen_out">ID</label>
                <input type="email" id="loginId" name="loginId" placeholder="PassWord" >
                </div>
	</div>
	</td>
</tr>
</table>
            <button type="submit" class="btn_login"  disabled>会員加入</button>
            </div>
            
            </fieldset>
        </form>
 
    </div>
</div>
</body>
</html>