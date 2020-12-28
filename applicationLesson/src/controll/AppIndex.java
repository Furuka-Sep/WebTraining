package controll;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SiteEV;
import model.SiteEVLogic;
@WebServlet("/AppIndex")
public class AppIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext app=this.getServletContext();
		SiteEV siteEV=(SiteEV)app.getAttribute("siteEV");

		if(siteEV==null) {
			siteEV=new SiteEV();
		}
		request.setCharacterEncoding("UTF-8");
		String action=request.getParameter("action");

		SiteEVLogic sev=new SiteEVLogic();
		if(action != null && action.equals("like")) {
			sev.like(siteEV);
		}else if(action != null && action.equals("dislike")) {
			sev.dislike(siteEV);
		}

		app.setAttribute("siteEV", siteEV);

		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/appIndex.jsp");
		rd.forward(request, response);
	}
}
