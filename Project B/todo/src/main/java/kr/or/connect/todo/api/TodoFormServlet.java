package kr.or.connect.todo.api;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newtodo")
public class TodoFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TodoFormServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
//		PrintWriter out = response.getWriter();
//		out.println("TodoFormServlet.java");

//		int diceValue = (int) (Math.random() * 6) + 1;
//		request.setAttribute("dice", diceValue); // 세탁소에 옷 맡길 때 말하는 동과 호수, 실제 넘겨줄 값

		String nextJSP = "/todoForm.jsp";
//		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextJSP);
		dispatcher.forward(request, response);
	}

}
