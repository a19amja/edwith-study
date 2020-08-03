package kr.or.connect.todo.api;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.connect.todo.dao.TodoDao;
import kr.or.connect.todo.dto.TodoDto;

@WebServlet("/TodoTypeServlet")
public class TodoTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TodoTypeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

//	protected void service(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//	}

//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.println("TodoAddServlet.java");
//		TodoDao 이용해서 타입 업데이트 

		Long id = Long.parseLong(request.getParameter("id"));
//		System.out.println(id);

		TodoDao dao = new TodoDao();
		TodoDto dto = dao.getTodo(id);

		int updateCount = dao.updateTodo(dto);

		System.out.println(updateCount);

		response.sendRedirect("/todo/main");
	}

}
