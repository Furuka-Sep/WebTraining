package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Product;

@WebServlet("/main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd= request.getRequestDispatcher("/WEB-INF/view/main.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		List<Product> list=(List<Product>)session.getAttribute("list");
		if(list == null){
			list=new ArrayList<>();
		}
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String price=request.getParameter("price");
		if(name.isEmpty() || price.isEmpty()){
			request.setAttribute("err","未記入の項目があります！");
		}else{
			Product product=new Product(name,price,price);
			product.setTotal(price);
			list.add(0,product);
			session.setAttribute("list", list);
			request.setAttribute("msg","1件登録しました。");
		}
		doGet(request,response);
	}
}

