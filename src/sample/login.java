package sample;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		loginDao logdao=new loginDao();
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String name =request.getParameter("userName");
		String pass =request.getParameter("userPass");
	
		if(logdao.getadminConnection(name, pass)||(name.equals("hr") &&(pass.equals("hr"))) ) {
			
			HttpSession session=request.getSession();
			session.setAttribute("username", name);
			
			
			response.sendRedirect("Index.jsp");
		}
		/*
		 * if(name.equals("sap") &&(pass.equals("sap"))) {
		 * 
		 * HttpSession session=request.getSession(); session.setAttribute("username",
		 * name);
		 * 
		 * 
		 * response.sendRedirect("Index.jsp"); }
		 */
		else {
			response.sendRedirect("login.jsp");
		}
		
		
	}

}
