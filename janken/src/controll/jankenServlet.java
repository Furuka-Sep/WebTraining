package controll;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/jankenServlet")
public class jankenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public jankenServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Random rand=new Random();
		String hand =request .getParameter("hand");
		int player=Integer.parseInt(hand);
		int cpu=rand.nextInt(3);
		String choise[]= {"gu","choki","pa"};
		int janken=(player-cpu+3)%3;
		String[] judge= {"あいこ","負け","勝ち"};
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<link rel=\"stylesheet\" href=\"css/main.css\">");
		out.println("<link href=\"https://fonts.googleapis.com/earlyaccess/nicomoji.css\" rel=\"stylesheet\">");
		out.println("<title>じゃんけんぽん</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<div>");
		if(hand!=null) {
		out.println("<img src=\"images/"+choise[player]+".png\">");
		out.println("<img src=\"images/"+choise[cpu]+".png\">");
		out.println("</div>");
		out.println("<p>"+judge[janken]+"</p>");
		out.print("<a href='index.jsp'>もういっかい</a>");
		out.println("</body>");
		out.println("</html>");
		}
	}
}
