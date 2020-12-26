package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardSampleServlet
 */
@WebServlet("/ForwardSampleServlet")
public class ForwardSampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ForwardSampleServlet() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String weather="晴れ";
		String fortune="大吉";
		int comfortableIndex=85;
		request.setAttribute("ft", fortune);
		request.setAttribute("wt",weather);
		request.setAttribute("ci",comfortableIndex);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/forwardSample.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
