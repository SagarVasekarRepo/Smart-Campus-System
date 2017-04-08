package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoSecurity;

/**
 * Servlet implementation class SecurityDeleteOperation
 */
public class SecurityDeleteOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecurityDeleteOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		boolean result=false;
		
		response.setContentType("text/html");
		
		DaoSecurity dao=new DaoSecurity();
		
		String on=request.getParameter("on");
		
		if(on.equalsIgnoreCase("staff"))
		{
			
			int id=Integer.parseInt(request.getParameter("id"));
			
			try 
			{
			
				result=dao.securityStaffDelete(id);
			
			}
			catch (InstantiationException e) 
			{
			
				e.printStackTrace();
			
			}
			catch (IllegalAccessException e) 
			{
			
				e.printStackTrace();
			
			}
			catch (SQLException e) 
			{
			
				e.printStackTrace();
			
			}
			
			if(result==true)
			{
			
			RequestDispatcher rd=request.getRequestDispatcher("SecurityFetchOperation?want=staff");
			
			rd.forward(request, response);
			
			}
			
			else
				
			{
			
				RequestDispatcher rd=request.getRequestDispatcher("securityFailure.jsp");
				
				rd.forward(request, response);
				
				
			}

		}
		
		else if(on.equalsIgnoreCase("contact"))
		{
			
			int id=Integer.parseInt(request.getParameter("id"));
			
			try 
			{
			
				result=dao.securityContactDelete(id);
			
			}
			catch (InstantiationException e) 
			{
			
				e.printStackTrace();
			
			}
			catch (IllegalAccessException e) 
			{
			
				e.printStackTrace();
			
			}
			catch (SQLException e) 
			{
			
				e.printStackTrace();
			
			}
			
			if(result==true)
			{
			
			RequestDispatcher rd=request.getRequestDispatcher("SecurityFetchOperation?want=contact");
			
			rd.forward(request, response);
			
			}
			
			else
				
			{
			
				RequestDispatcher rd=request.getRequestDispatcher("SecurityFailure.jsp");
				
				rd.forward(request, response);
				
				
			}
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
