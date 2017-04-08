package action;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoHostel;
import dao.MysqlConnect;

/**
 * Servlet implementation class HostelDeleteOperation
 */
public class HostelDeleteOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HostelDeleteOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		boolean result = false;
		
		response.setContentType("text/html");
		
		String hostel=request.getParameter("hostel");
		
		DaoHostel dao=new DaoHostel();
		
		if(hostel.equalsIgnoreCase("shivneri"))
		{
			String on=request.getParameter("on");
			
			if(on.equalsIgnoreCase("room"))
			{
			int id=Integer.parseInt(request.getParameter("id"));
			
			try 
			{
			
				result=dao.shivneriRoomDelete(id);
			
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
			
			RequestDispatcher rd=request.getRequestDispatcher("HostelFetchOperation?hostel&want=roomdetails");
			
			rd.forward(request, response);
			
			}
			
			else
				
			{
			
				RequestDispatcher rd=request.getRequestDispatcher("shivneriFailure.jsp");
				
				rd.forward(request, response);
				
				
			}

		}
			else if(on.equalsIgnoreCase("staff"))
			{
				
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.shivneriStaffDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("HostelFetchOperation?hostel=shivneri&want=staff");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("shivneriFailure.jsp");
					
					rd.forward(request, response);
					
					
				}

			}
			
			else if(on.equalsIgnoreCase("contact"))
			{
				
				int id=Integer.parseInt(request.getParameter("id1"));
				
				try 
				{
				
					result=dao.shivneriContactDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("HostelFetchOperation?hostel=shivneri&want=contact");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("shivneriFailure.jsp");
					
					rd.forward(request, response);
					
					
				}

			}
	}		
		
		else if(hostel.equalsIgnoreCase("sahyadri"))
		{
			
			String on=request.getParameter("on");
			
			if(on.equalsIgnoreCase("room"))
			{
				
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.sahyadriRoomDelete(id);
				
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
			
			else if(on.equalsIgnoreCase("staff"))
			{
				
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.sahyadriStaffDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("HostelFetchOperation?hostel=sahyadri&want=staff");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("sahyadriFailure.jsp");
					
					rd.forward(request, response);
					
					
				}



				
			}
			
			else if(on.equalsIgnoreCase("contact"))
			{
					
				int id=Integer.parseInt(request.getParameter("id1"));
				
				try 
				{
				
					result=dao.sahyadriContactDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("HostelFetchOperation?hostel=sahyadri&want=contact");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("sahyadriFailure.jsp");
					
					rd.forward(request, response);
					
					
				}
				
			}
		}
		
		else if (hostel.equalsIgnoreCase("devgiri"))
		{
			
			String on=request.getParameter("on");
			
			if(on.equalsIgnoreCase("room"))
			{
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.devgiriRoomDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("HostelFetchOperation?hostel=devgiri&want=roomdetails");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("devgiriFailure.jsp");
					
					rd.forward(request, response);
					
					
				}

				
			}
			
			else if(on.equalsIgnoreCase("staff"))
			{
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.devgiriStaffDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("HostelFetchOperation?hostel=devgiri&want=staff");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("devgiriFailure.jsp");
					
					rd.forward(request, response);
					
					
				}


					
			}
			
			else if(on.equalsIgnoreCase("contact"))
			{
				int id=Integer.parseInt(request.getParameter("id1"));
				
				try 
				{
				
					result=dao.devgiriContactDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("HostelFetchOperation?hostel=devgiri&want=contact");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("devgiriFailure.jsp");
					
					rd.forward(request, response);
					
					
				}
				
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
