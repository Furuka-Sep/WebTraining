package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ConvertLogic;
import model.NumData;
@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/form.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num=request.getParameter("num");
		NumData numdata=new NumData();
		numdata.setNum(num);
		ConvertLogic cl=new ConvertLogic();
		cl.execute(numdata);
		request.setAttribute("numdata", numdata);
		RequestDispatcher rd=request.getRequestDispatcher("WEB-INF/view/result.jsp");
		rd.forward(request, response);
	}
}