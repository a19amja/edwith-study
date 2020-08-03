<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>newtodo</title>
<style>
html, body {
	width: 100%;
	height: 100%;
	margin: 0;
}

body {
	position: relative;
	background-color: lightgray;
	/* text-align: center; */
	/* 가로 정렬 2와 연관 */
}

main {
	background-color: white;
	/* padding: 30px 10px 30px 100px; */
	/* overflow: hidden; */
	/* 가로 정렬 1 */
	width: 75%;
	/* height: 80%; */
	margin: auto;
	/* 가로 정렬하면서 main과 하얀 부분 너비 동일하게 하기 */
	/* margin: 0px 10%; */
	/* 가로 정렬 2 */
	/* display: inline-block; */
	/* 부모에 준 text-align 속성을 적용하게 위해 block을 inline-block으로 변경 */
	/* width: 75%; */
	box-sizing: border-box;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
}

section {
	text-align: left;
	position: relative;
	width: 45%;
	margin: auto;
	color: rgb(88, 87, 87);
	padding: 50px;
}

main section h1 {
	color: black;
	text-align: center;
	font-size: 2em;
	margin-top: 0px;
	/* margin-bottom: 70px; */
}

main section .input-title {
	margin-bottom: 5px;
}

main section input {
	padding: 10px;
	font-size: 17px;
	border: lightgray solid 1px;
	margin-bottom: 30px;
}

main section input.job {
	box-sizing: border-box;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
	width: 100%;
}

main section input.name {
	width: 40%;
}

main section .priority {
	color: black;
	font-size: 14px;
	vertical-align: text-top;
}

main section .btn {
	overflow: hidden;
}

main section .btn .btn-left {
	float: left;
}

main section .btn .btn-right {
	float: right;
}

button {
	font-size: 16px;
	border: lightgray 1px solid;
	padding: 7px 25px;
}

button[type="submit"], [type="reset"] {
	background-color: rgb(52, 192, 235);
	color: white;
	margin-left: 10px;
}
</style>
</head>

<body>
	<main>
		<section>
			<form method="POST" action="/todo/TodoAddServlet">
				<h1>할 일 등록</h1>

				<div class="input-title">어떤 일인가요?</div>
				<input class="job" type="text" name="job" placeholder="웹 프로그래밍 공부하기 (24자까지)" maxlength="24"/>

				<div class="input-title">누가 할 일인가요?</div>
				<input class="name" type="text" name="name" placeholder="홍길동" />

				<div class="input-title">우선 순위를 선택하세요.</div>
				<input type="radio" name="priority" value="1" /> <span class="priority">1순위</span>
				<input type="radio" name="priority" value="2" /> <span class="priority">2순위</span>
				<input type="radio" name="priority" value="3" /> <span class="priority">3순위</span>

				<div class="btn">
					<span class="btn-left">
						<button>&lt; 이전</button>
					</span> <span class="btn-right">
						<button type="submit">제출</button>
						<button type="reset">내용 지우기</button>
					</span>
				</div>
			</form>
		</section>
	</main>
</body>
</html>
