package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.NumAppLogic;
import model.NumData;
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session=request.getSession();
		String[] strs=request.getParameter("strs").split(",",0);
		NumData numdata=new NumData();
		numdata.setStrs(strs);
		NumAppLogic nml=new NumAppLogic();
		nml.excute(numdata);
		session.setAttribute("numdata", numdata);
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/jsp/result.jsp");
		rd.forward(request, response);
	}
}
