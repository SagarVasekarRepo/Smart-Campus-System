package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoMess;

/**
 * Servlet implementation class SahdevMessContactInsert
 */
public class SahdevMessContactInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SahdevMessContactInsert() {
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
		
		DaoMess dao=new DaoMess();
		
		
			try
			{
			
				result=dao.insertContactSahdev(name, address,email,contact,role);
				
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
			
			RequestDispatcher rd=request.getRequestDispatcher("MessFetchOperation?mess=sahdev&want=contact");
			
			rd.forward(request, response);
			
			}
			
			else
				
			{
			
				RequestDispatcher rd=request.getRequestDispatcher("sahdevMessFailure.jsp");
				
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
