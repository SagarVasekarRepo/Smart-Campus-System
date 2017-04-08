package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MysqlConnect;

/**
 * Servlet implementation class Sit_staff_insert
 */
public class SitStaffInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SitStaffInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name=request.getParameter("name");
		
		boolean result = false;
		
		String role=request.getParameter("role");
		
		
		String contact=request.getParameter("contact");
		
		
		MysqlConnect dao=new MysqlConnect();
		
		
			try
			{
			
				result=dao.insertStaffSit(name, role,contact);
				
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
			
			RequestDispatcher rd=request.getRequestDispatcher("CanteenFetchOperation?canteen=sit&want=staff");
			
			rd.forward(request, response);
			
			}
			
			else
				
			{
			
				RequestDispatcher rd=request.getRequestDispatcher("sitCanteenFailure.jsp");
				
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
