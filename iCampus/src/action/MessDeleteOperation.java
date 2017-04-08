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
 * Servlet implementation class MessDeleteOperation
 */
public class MessDeleteOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessDeleteOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	boolean result = false;
		
		response.setContentType("text/html");
		
		String mess=request.getParameter("mess");
		
		DaoMess dao=new DaoMess();
		
		if(mess.equalsIgnoreCase("arjun"))
		{
			String on=request.getParameter("on");
			
			if(on.equalsIgnoreCase("menu"))
			{
			int id=Integer.parseInt(request.getParameter("id1"));
			
			try 
			{
			
				result=dao.sibacaMenuDelete(id);
			
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
			
			RequestDispatcher rd=request.getRequestDispatcher("MessFetchOperation?mess=arjun&want=menu");
			
			rd.forward(request, response);
			
			}
			
			else
				
			{
			
				RequestDispatcher rd=request.getRequestDispatcher("arjunMessFailure.jsp");
				
				rd.forward(request, response);
				
				
			}

		}
			else if(on.equalsIgnoreCase("staff"))
			{
				
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.arjunStaffDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("MessFetchOperation?mess=arjun&want=staff");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("arjunMessFailure.jsp");
					
					rd.forward(request, response);
					
					
				}

			}
			
			else if(on.equalsIgnoreCase("contact"))
			{
				
				int id=Integer.parseInt(request.getParameter("id1"));
				
				try 
				{
				
					result=dao.arjunContactDelete(id);
				
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
	}		
		
		else if(mess.equalsIgnoreCase("sahdev"))
		{
			
			String on=request.getParameter("on");
			
			if(on.equalsIgnoreCase("menu"))
			{
				
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.sitMenuDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("MessFetchOperation?mess=sahdev&want=menu");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("sahdevMessFailure.jsp");
					
					rd.forward(request, response);
					
					
				}


				

				
			}
			
			else if(on.equalsIgnoreCase("staff"))
			{
				
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.sahdevStaffDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("MessFetchOperation?mess=sahdev&want=staff");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("sahdevMessFailure.jsp");
					
					rd.forward(request, response);
					
					
				}



				
			}
			
			else if(on.equalsIgnoreCase("contact"))
			{
					
				int id=Integer.parseInt(request.getParameter("id1"));
				
				try 
				{
				
					result=dao.sahdevContactDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("MessFetchOperation?mess=sahdev&want=contact");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("sahdevMessFailure.jsp");
					
					rd.forward(request, response);
					
					
				}
				
			}
		}
		
		else if (mess.equalsIgnoreCase("kalyani"))
		{
			
			String on=request.getParameter("on");
			
			if(on.equalsIgnoreCase("menu"))
			{
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.stesMenuDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("messFetchOperation?mess=kalyani&want=menu");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("kalyaniMessFailure.jsp");
					
					rd.forward(request, response);
					
					
				}

				
			}
			
			else if(on.equalsIgnoreCase("staff"))
			{
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.kalyaniStaffDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("MessFetchOperation?mess=kalyani&want=staff");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("kalyaniMessFailure.jsp");
					
					rd.forward(request, response);
					
					
				}


					
			}
			
			else if(on.equalsIgnoreCase("contact"))
			{
				int id=Integer.parseInt(request.getParameter("id1"));
				
				try 
				{
				
					result=dao.kalyaniContactDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("MessFetchOperation?mess=kalyani&want=contact");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("kalyaniMessFailure.jsp");
					
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
