// 영상 하단 소스코드 복붙
// function ajax(data) {
//   var oReq = new XMLHttpRequest();
//   oReq.addEventListener("load", function () {
//     console.log(this.responseText);
//   });
//   oReq.open("GET", "./json.txt"); //parameter를 붙여서 보낼수있음.
//   oReq.send();
// }

// 영상에 있는 소스코드


var oReq = new XMLHttpRequest();
oReq.addEventListener("load", function() {
	console.log(this.responseText);
});
oReq.open("GET", "./json.txt"); //parameter를 붙여서 보낼수있음.
oReq.send();


var p1 = 5;
var p2 = 7;


document.getElementById("myBtn").addEventListener("click", function() {
	ajax(id, type);
});


function ajac(id, type) {
	var result = a * b;
	document.getElementById("demo").innerHTML = result;
}



