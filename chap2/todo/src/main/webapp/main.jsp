<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="kr.or.connect.todo.dto.tododto" %>
<%@ page import="kr.or.connect.todo.dao.tododao" %>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<%
	tododao dao = new tododao();
	List<tododto> todolist = dao.getTodos();
	System.out.print(todolist);
	List<tododto> doinglist = dao.getDoings();
	System.out.print(todolist);
	List<tododto> donelist = dao.getDones();
	System.out.print(todolist);
%>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <title>TODO LIST</title>
    <style>
        body {
            background-color: #c5c2c9;
        }

        #content {
            background-color: white;
            width: 1200px;
            height: auto;
            margin: auto;
            position: relative;
            padding-bottom: 50px;
        }

        #content>h1 {
            transform: rotate(-35deg);
            padding-top: 80px;
            height: 50px;
            width: 300px;
            color: #0a4357;
            margin: 0;
            font-style: italic;
        }

        #todolist {
            margin: 0 50px 0 150px;
        }

        #newbtn {
            width: 200px;
            border: none;
            background-color: #31b0ea;
            color: white;
            position: absolute;
            top: 50px;
            right: 50px;
            text-align: center;
            padding: 10px 0 13px 0;
        }
        
        a{
        	text-decoration: none;
        }

        .todocolumn {
            width: 32%;
            display: inline-table;
            padding: 0 0 0 9px;
        }

        li {
            list-style: none;
        }

        .columntitle {
            background-color: #0a4357;
            height: 50px;
            font-size: 20px;
            padding: 15px 0 0 20px;
            color: white;
        }

        .card {
            padding: 20px;
            background-color: #c1d6e0;
            margin: 10px 0;
            position:relative;
        }

        .card>li {
            display: inline-block;
            font-size: 13px;
            color: #0a4357;
        }

        .card>h3{
            margin: 0 0 10px 0;
        }
        #upbtn{
            font-size: 12px;
            background-color: #f3ecd9;
            padding:5px 7px;
            border:1px solid #0000005e;
            position:absolute;
            right:15px;
            cursor:pointer;
            color:black;
        }
    </style>
</head>

<body>
    <div id="content">
        <h1>나의 해야할 일들</h1>
        <a id="newbtn" href="newtodo.html">새로운 TODO 등록</a>
        <div id="todolist">
            <ul class="todocolumn">
                <li class="columntitle">TODO</li>

				<% 
                for(tododto list:todolist){
                %>
                <ul class="card">
                    <h3><%= list.getTitle()%></h3>
                    <li>등록날짜:<%= list.getRegDate()%>,</li>
                    <li><%= list.getName()%>,</li>
                    <li>우선순위&nbsp;<%= list.getSequence()%></li>
                    <a href="http://localhost:8080/todo/update/<%= list.getId()%>"><i id="upbtn" class="fa">&#xf061;</i></a>
                </ul>
                <%
				}
			    %>

            </ul>
            <ul class="todocolumn">
                <li class="columntitle">DOING</li>

                <% 
                for(tododto list:doinglist){
                %>
                <ul class="card">
                    <h3><%= list.getTitle()%></h3>
                    <li>등록날짜:<%= list.getRegDate()%>,</li>
                    <li><%= list.getName()%>,</li>
                    <li>우선순위&nbsp;<%= list.getSequence()%></li>
                    <a href="http://localhost:8080/todo/update/<%= list.getId()%>"><i id="upbtn" class="fa">&#xf061;</i></a>
                </ul>
                <%
				}
                %>
                
            </ul>
            <ul class="todocolumn">
                <li class="columntitle">DONE</li>

                <% 
                for(tododto list:donelist){
                %>
                <ul class="card">
                    <h3><%= list.getTitle()%></h3>
                    <li>등록날짜:<%= list.getRegDate()%>,</li>
                    <li><%= list.getName()%>,</li>
                    <li>우선순위&nbsp;<%= list.getSequence()%></li>
                </ul>
                <%
				}
                %>
                
            </ul>
        </div>

    </div>
</body>

</html>