package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoHostel;
import dao.DaoMess;
import dao.DaoSecurity;

/**
 * Servlet implementation class DevgiriContactInsert
 */
public class DevgiriContactInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DevgiriContactInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("name");
		
		String address=request.getParameter("address");
		
		String email=request.getParameter("email");
		
		String contact=request.getParameter("contact");
		
		String role=request.getParameter("role");
		
		boolean result = false;
		
		DaoHostel dao=new DaoHostel();
		
		
			try
			{
			
				result=dao.insertContactDevgiri(name, address,email,contact,role);
				
			} 
			catch (SQLException e) 
			{
			
				e.printStackTrace();
			
			}
			catch (InstantiationException e) 
			{
			
				e.printStackTrace();
			
			}
			catch (IllegalAccessException e) 
			{
			
				e.printStackTrace();
			
			}
			
			if(result==true)
			{
			
			RequestDispatcher rd=request.getRequestDispatcher("HostelFetchOperation?hostel=devgiri&want=contact");
			
			rd.forward(request, response);
			
			}
			
			else
				
			{
			
				RequestDispatcher rd=request.getRequestDispatcher("devgiriFailure.jsp");
				
				rd.forward(request, response);
				
				
			}



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
