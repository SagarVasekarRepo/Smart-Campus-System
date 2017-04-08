package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoHostel;

/**
 * Servlet implementation class SahyadriRoomUpdate
 */
public class SahyadriRoomUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SahyadriRoomUpdate() {
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
		
		String room=request.getParameter("room");
		
		
		DaoHostel dao=new DaoHostel();
		
		try 
		{
		
			result=dao.sahyadriRoomUpdate(id1, name, room);
			
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
		
		RequestDispatcher rd=request.getRequestDispatcher("HostelFetchOperation?hostel=sahyadri&want=roomdetails");
		
		rd.forward(request, response);
		
		}
		
		else
			
		{
		
			RequestDispatcher rd=request.getRequestDispatcher("sahyadriFailure.jsp");
			
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
