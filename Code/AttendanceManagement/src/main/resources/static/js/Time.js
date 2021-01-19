var st_date = new Date().toISOString().substr(0, 10).replace('T', ' ');

function getTimeStamp() {
  var d = new Date();

  var s =
    leadingZeros(d.getFullYear(), 4) + '-' +
    leadingZeros(d.getMonth() + 1, 2) + '-' +
    leadingZeros(d.getDate(), 2) + ' ' +

    leadingZeros(d.getHours(), 2) + ':' +
    leadingZeros(d.getMinutes(), 2) + ':' +
    leadingZeros(d.getSeconds(), 2);

  return s;
}

function attTime() {
	var currentDate = new Date();
	var attClock = document.getElementById("attClock");

	var msg = currentDate.getFullYear() + "-"
	msg += (currentDate.getMonth() + 1) + "-";
	msg += currentDate.getDate() + " ";
	msg += currentDate.getHours() + ":";
	msg += currentDate.getMinutes() + ":";
	msg += currentDate.getSeconds();
	attClock.innerText = msg;

	$.ajax({
		url : "time.att",
		data : "clock=" + attClock.textContent,
		type : "POST",
		success : function(data) {
			alert("성공")
		},
		error : function() {
			alert("에러")
		}
	});
	msg = currentDate.getHours() + ":"
	msg += currentDate.getMinutes() + ":";
	msg += currentDate.getSeconds();
	attClock.innerText = msg;
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
		url : "time.lea",
		data : "clock=" + leaClock.textContent,
		type : "POST",
		success : function(data) {
			alert("성공")
		},
		error : function() {
			alert("에러")
		}
	});
	msg = currentDate.getHours() + ":"
	msg += currentDate.getMinutes() + ":";
	msg += currentDate.getSeconds();
	leaClock.innerText = msg;
}
function submit() {
	var value = $("#content").val();

	$.ajax({
		type : "POST",
		url : "work.details",
		data : "submit=" + value,
	});
}
function overTime() {
	var start = $("#start").val();
	var end = $("#end").val();
	var overclass = $("#overclass").val();
	const str1 = [ start, end, overclass ].join();
	$.ajax({
		type : "POST",
		url : "overWork.details",
		data : "data=" + str1,
	});
}

