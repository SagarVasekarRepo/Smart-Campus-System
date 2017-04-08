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
 * Servlet implementation class CanteenDeleteOperation
 */
public class CanteenDeleteOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CanteenDeleteOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		boolean result = false;
		
		response.setContentType("text/html");
		
		String canteen=request.getParameter("canteen");
		
		MysqlConnect dao=new MysqlConnect();
		
		if(canteen.equalsIgnoreCase("sibaca"))
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
			
			RequestDispatcher rd=request.getRequestDispatcher("CanteenFetchOperation?canteen=sibaca&want=menu");
			
			rd.forward(request, response);
			
			}
			
			else
				
			{
			
				RequestDispatcher rd=request.getRequestDispatcher("sibacaCanteenFailure.jsp");
				
				rd.forward(request, response);
				
				
			}

		}
			else if(on.equalsIgnoreCase("staff"))
			{
				
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.sibacaStaffDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("CanteenFetchOperation?canteen=sibaca&want=staff");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("sibacaCanteenFailure.jsp");
					
					rd.forward(request, response);
					
					
				}

			}
			
			else if(on.equalsIgnoreCase("contact"))
			{
				
				int id=Integer.parseInt(request.getParameter("id1"));
				
				try 
				{
				
					result=dao.sibacaContactDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("CanteenFetchOperation?canteen=sibaca&want=contact");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("sibacaCanteenFailure.jsp");
					
					rd.forward(request, response);
					
					
				}

			}
	}		
		
		else if(canteen.equalsIgnoreCase("sit"))
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
				
				RequestDispatcher rd=request.getRequestDispatcher("CanteenFetchOperation?canteen=sit&want=menu");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("sitCanteenFailure.jsp");
					
					rd.forward(request, response);
					
					
				}


				

				
			}
			
			else if(on.equalsIgnoreCase("staff"))
			{
				
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.sitStaffDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("CanteenFetchOperation?canteen=sit&want=staff");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("sitCanteenFailure.jsp");
					
					rd.forward(request, response);
					
					
				}



				
			}
			
			else if(on.equalsIgnoreCase("contact"))
			{
					
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.sitContactDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("CanteenFetchOperation?canteen=sit&want=contact");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("sitCanteenFailure.jsp");
					
					rd.forward(request, response);
					
					
				}
				
			}
		}
		
		else if (canteen.equalsIgnoreCase("stes"))
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
				
				RequestDispatcher rd=request.getRequestDispatcher("CanteenFetchOperation?canteen=stes&want=menu");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("stesCanteenFailure.jsp");
					
					rd.forward(request, response);
					
					
				}

				
			}
			
			else if(on.equalsIgnoreCase("staff"))
			{
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.stesStaffDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("CanteenFetchOperation?canteen=stes&want=staff");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("stesCanteenFailure.jsp");
					
					rd.forward(request, response);
					
					
				}


					
			}
			
			else if(on.equalsIgnoreCase("contact"))
			{
				int id=Integer.parseInt(request.getParameter("id"));
				
				try 
				{
				
					result=dao.stesContactDelete(id);
				
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
				
				RequestDispatcher rd=request.getRequestDispatcher("CanteenFetchOperation?canteen=stes&want=contact");
				
				rd.forward(request, response);
				
				}
				
				else
					
				{
				
					RequestDispatcher rd=request.getRequestDispatcher("stesCanteenFailure.jsp");
					
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
