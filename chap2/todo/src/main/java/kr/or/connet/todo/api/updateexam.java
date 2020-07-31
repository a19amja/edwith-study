package kr.or.connet.todo.api;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.connect.todo.dao.tododao;
import kr.or.connect.todo.dto.tododto;


@WebServlet("/update/*")
public class updateexam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public updateexam() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("application/json");
		
		String pathInfo = request.getPathInfo(); // /roles/{roleId}
		String[] pathParts = pathInfo.split("/");
		String idStr = pathParts[1];
		int id = Integer.parseInt(idStr);
		
		tododao dao = new tododao();
		tododto tmp = dao.gettodo(id);
		
		String nowtype = tmp.getType();
		String type;
		if(nowtype.equals("TODO")) {
			type="DOING";
		}else {         
		    type="DONE";
		}		
	
		tododto todo = new tododto(id,"young","young",1,type,"2020");
		
		int updateCount = dao.updateTodo(todo);
	
		
		response.sendRedirect("../main.jsp");
	}

}
