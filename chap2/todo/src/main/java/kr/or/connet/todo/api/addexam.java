package kr.or.connet.todo.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import kr.or.connect.todo.dao.tododao;
import kr.or.connect.todo.dto.tododto;

@WebServlet("/addexam")
public class addexam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public addexam() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		String title = request.getParameter("what");
		String name = request.getParameter("who");
		String priority=request.getParameter("priority");
		Integer sequence;
		if(priority=="first") {
			sequence=1;
		}else if(priority=="second") {
		    sequence=2;
		}else {         
		    sequence=3;
		}		
		
		tododto todo = new tododto(100,title,name,sequence,"TODO","2020");
		tododao dao = new tododao();
		int insertCount = dao.addTodo(todo);
	
		
		response.sendRedirect("main.jsp");

	}

}
