<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>main</title>
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
	padding: 30px 10px 30px 100px;
	overflow: hidden;
	/* 가로 정렬 1 */
	width: 75%;
	/* height: 80%; */
	margin: auto;
	/* 가로 정렬하면서 newtodo 하얀 부분 너비 동일하게 하기 */
	/* margin: 0px 10%; */
	/* 가로 정렬 2 */
	/* display: inline-block; */
	/* 부모에 준 text-align 속성을 적용하게 위해 block을 inline-block으로 변경 */
	/* width: 75%; */
	box-sizing: border-box;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
}

main .page-title {
	position: absolute;
	color: rgb(36, 58, 77);
	/* text-align: left; */
	transform: rotate(-35deg);
	margin-left: -80px;
	/* transform: scale(2); */
	/* transform: translate(100px); */
}

main .insert {
	text-align: right;
	padding: 5px;
	margin-bottom: 20px;
}

main .insert button {
	background-color: rgb(52, 192, 235);
	color: white;
	padding: 10px 30px;
	font-size: 13px;
	border: none;
}

main section {
	float: left;
	margin: 5px;
}

section ul li {
	list-style: none;
}

main section .card.class {
	background-color: rgb(36, 58, 77);
	color: white;
	font-weight: bold;
}

main section .card {
	background-color: rgb(211, 231, 240);
	/* border: 1px solid gray; */
	padding: 20px 50px 20px 20px;
	/* text-align: left; */
	margin: 10px 0px;
	position: relative;
}

.card .title {
	font-weight: bold;
}

.card .info {
	color: rgb(36, 58, 77);
	font-size: 11px;
	margin-top: 5px;
}

.card button {
	position: absolute;
	bottom: 0;
	right: 0;
	margin: 10px;
	padding: 5px 7px;
	font-size: 10px;
	border: lightgray 1px solid;
	/* border-radius: 0%; */
}
</style>
</head>

<body>
	<main>
		<h2 class="page-title">나의 해야 할 일들</h2>
		<div class="insert">
			<button>새로운 TO DO 등록</button>
		</div>
		<section>
			<ul class="card class">
				<li>TO DO</li>
			</ul>
			<ul class="card">
				<li class="title">Project B 완성하기</li>
				<li class="info">등록날짜: 2020.08.01, 정선아, 우선순위 1</li>
				<button>&#8594;</button>
				<!-- <button> → </button> -->
			</ul>
			<ul class="card">
				<li class="title">Project B 완성하기</li>
				<li class="info">등록날짜: 2020.08.01, 정선아, 우선순위 1</li>
				<button>&#8594;</button>
			</ul>
			<ul class="card">
				<li class="title">Project B 완성하기</li>
				<li class="info">등록날짜: 2020.08.01, 정선아, 우선순위 1</li>
				<button>&#8594;</button>
			</ul>
		</section>
		<section>
			<ul class="card class">
			<li>DOING</li>
			</ul>
			<ul class="card">
				<li class="title">Project B 작성</li>
				<li class="info">등록날짜: 2020.08.01, 정선아, 우선순위 1</li>
				<button>&#8594;</button>
			</ul>
			<ul class="card">
				<li class="title">Project B 작성</li>
				<li class="info">등록날짜: 2020.08.01, 정선아, 우선순위 1</li>
				<button>&#8594;</button>
			</ul>
			<ul class="card">
				<li class="title">Project B 작성</li>
				<li class="info">등록날짜: 2020.08.01, 정선아, 우선순위 1</li>
				<button>&#8594;</button>
			</ul>
		</section>
		<section>
			<ul class="card class">
			<li>DONE</li>
			</ul>
			<ul class="card">
				<li class="title">Project B 끝내자</li>
				<li class="info">등록날짜: 2020.08.01, 정선아, 우선순위 1</li>
				<button>&#8594;</button>
			</ul>
			<ul class="card">
				<li class="title">Project B 끝내자</li>
				<li class="info">등록날짜: 2020.08.01, 정선아, 우선순위 1</li>
				<button>&#8594;</button>
			</ul>
			<ul class="card">
				<li class="title">Project B 끝내자</li>
				<li class="info">등록날짜: 2020.08.01, 정선아, 우선순위 1</li>
				<button>&#8594;</button>
			</ul>
		</section>
	</main>
</body>
</html>
