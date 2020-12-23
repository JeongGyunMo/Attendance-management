function attTime() {
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
			url: "time.att",
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
	function leaTime() {
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
			url: "time.lea",
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