package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoMess;
import dao.MysqlConnect;

/**
 * Servlet implementation class ArjunMessContactUpdate
 */
public class ArjunMessContactUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArjunMessContactUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
boolean result = false;
		
		response.setContentType("text/html");
		
		int id1=Integer.parseInt(request.getParameter("id"));
		
		String name=request.getParameter("name");
		
		String address=request.getParameter("address");
		
		String email=request.getParameter("email");
		
		String contact=request.getParameter("contact");
		
		String role=request.getParameter("role");
		
		DaoMess dao=new DaoMess();
		
		try 
		{
		
			result=dao.arjunContactpdate(id1, name, address, email, contact, role);
			
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
		
		RequestDispatcher rd=request.getRequestDispatcher("MessFetchOperation?mess=arjun&want=contact");
		
		rd.forward(request, response);
		
		}
		
		else
			
		{
		
			RequestDispatcher rd=request.getRequestDispatcher("arjunMessFailure.jsp");
			
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
