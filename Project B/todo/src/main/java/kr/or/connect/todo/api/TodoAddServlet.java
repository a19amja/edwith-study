package kr.or.connect.todo.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.connect.todo.dao.TodoDao;
import kr.or.connect.todo.dto.TodoDto;

@WebServlet("/TodoAddServlet")
public class TodoAddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TodoAddServlet() {
		super();

	}

//	protected void service(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.print("<h1>Hello Servlet</h1>");
//
//		String title = "플젝 끝내기";
//		String name = "정선아";
//		int sequence = 1;
//
//		TodoDto dto = new TodoDto(title, name, sequence);
//
//		TodoDao dao = new TodoDao();
//
//		int insertCount = dao.addTodo(dto);
//
//		System.out.println(insertCount);
//	}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//	}
//
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.println("TodoAddServlet.java");
//		TodoDao 이용해서 테이블에 저장 

		String title = request.getParameter("job");
		String name = request.getParameter("name");
		int sequence = Integer.parseInt(request.getParameter("priority"));

		TodoDto dto = new TodoDto(title, name, sequence);

		TodoDao dao = new TodoDao();

		int insertCount = dao.addTodo(dto);

		System.out.println(insertCount);

		response.sendRedirect("/todo/main");
	}

}
