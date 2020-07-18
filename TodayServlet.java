package aboutme;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TodayServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");

		Date now=new Date();
		
		PrintWriter writer=response.getWriter();
		writer.println("<html>");
		writer.println("<head><title>현재 시간</title></head>");
		writer.println("<body style='position:absolute;left:50%;top:50%;transform: translate(-50%, -50%);'>");
		writer.println("현재 시간 : ");
		writer.println(now.toString());
		writer.println("</body>");
		writer.println("</html>");
		
		writer.close();
	}


}
