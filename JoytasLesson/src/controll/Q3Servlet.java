package controll;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Q3Servlet")
public class Q3Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Q3Servlet() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String ans= request.getParameter("ans");
		String msg="";
		if(ans.equals("0")) {msg="正解";}
		else{msg="不正解!!!!!!!!!";}
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out =response.getWriter();
		out.println("<!DOCTYPE>");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>"+msg+"<p>");
		out.println("</body>");
		out.println("</html>");
	}
}
