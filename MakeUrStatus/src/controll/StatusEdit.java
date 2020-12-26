package controll;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AllLogic;
import model.Data;

@WebServlet("/StatusEdit")
public class StatusEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/firstStatus.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		Data data=new Data();
		data.setName(name);
		AllLogic al=new AllLogic();
		al.nameStatus(data);
		request.setAttribute("data", data);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/secondStatus.jsp");
		rd.forward(request, response);
		String race=request.getParameter("race");
		data.setRaceNum(Integer.parseInt(race));
		request.setAttribute("data", data);
		RequestDispatcher rd2=request.getRequestDispatcher("/WEB-INF/jsp/thirdStatus.jsp");
		rd2.forward(request, response);
		String job=request.getParameter("job");
		data.setJobNum(Integer.parseInt(job));
		request.setAttribute("data", data);
		RequestDispatcher rd3=request.getRequestDispatcher("/WEB-INF/jsp/statusResult.jsp");
		rd3.forward(request, response);
	}
}
