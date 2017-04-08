package action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MysqlConnect;
import dto.Contacts;
import dto.Menu;
import dto.Staff;

/**
 * Servlet implementation class CanteenFetchOperation
 */
public class CanteenFetchOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CanteenFetchOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean result = false;
		
		response.setContentType("text/html");
		
		String canteen=request.getParameter("canteen");
		
		MysqlConnect dao=new MysqlConnect();
		
		if(canteen.equalsIgnoreCase("sibaca"))
		{
			String want=request.getParameter("want");
			
			if(want.equalsIgnoreCase("menu"))
			{
				try
				{
				
					
				
				int row=dao.menuCountSibaca();
				
					
				Menu menus[]=(Menu[])null;
				
				
				menus=new Menu[row];
				
				
				
				menus=dao.getMenusSibaca();
				
				request.setAttribute("result", menus);
				
				RequestDispatcher rd=request.getRequestDispatcher("sibacaMenus.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}
	
				
			}
			
			else if(want.equalsIgnoreCase("staff"))
			{
				
				try
				{
				
					
				
				int row=dao.staffCountSibaca();
				
					
				Staff staff[]=(Staff[])null;
				
				staff=new Staff[row];
				
				staff=dao.getStaffSibaca();
				
				request.setAttribute("result", staff);
				
				RequestDispatcher rd=request.getRequestDispatcher("sibacaCanteenStaff.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}

			}
			
			else if(want.equalsIgnoreCase("contact"))
			{
				
				try
				{
				
					
				
				int row=dao.countSibacaContacts();
				
					
				Contacts contacts[]=(Contacts[])null;
				
				contacts=new Contacts[row];
				
				contacts=dao.getContactsSibaca();
				
				request.setAttribute("result", contacts);
				
				RequestDispatcher rd=request.getRequestDispatcher("sibacaContacts.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}
				
			}
		}
		
		else if(canteen.equalsIgnoreCase("sit"))
		{
			String want=request.getParameter("want");
			
			if(want.equalsIgnoreCase("menu"))
			{
				try
				{
				
					
				
				int row=dao.menuCountSit();
				
					
				Menu menus[]=(Menu[])null;
				
				menus=new Menu[row];
				
				menus=dao.getMenusSit();
				
				request.setAttribute("result", menus);
				
				RequestDispatcher rd=request.getRequestDispatcher("sitMenus.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}

				
			}
			
			else if(want.equalsIgnoreCase("staff"))
			{
				
				try
				{
				
					
				
				int row=dao.staffCountSit();
				
					
				Staff staff[]=(Staff[])null;
				
				staff=new Staff[row];
				
				staff=dao.getStaffSit();
				
				request.setAttribute("result", staff);
				
				RequestDispatcher rd=request.getRequestDispatcher("sitCanteenStaff.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}

			}
			
			else if(want.equalsIgnoreCase("contact"))
			{
				try
				{
				
					
				
				int row=dao.countSitContacts();
				
					
				Contacts contacts[]=(Contacts[])null;
				
				contacts=new Contacts[row];
				
				contacts=dao.getContactsSit();
				
				request.setAttribute("result", contacts);
				
				RequestDispatcher rd=request.getRequestDispatcher("sitContacts.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}
				

				
			}
		}
		
		else if(canteen.equalsIgnoreCase("stes"))
		{
			
			String want=request.getParameter("want");
			
			if(want.equalsIgnoreCase("menu"))
			{
				try
				{
				
					
				
				int row=dao.menuCountStes();
				
					
				Menu menus[]=(Menu[])null;
				
				menus=new Menu[row];
				
				menus=dao.getMenusStes();
				
				request.setAttribute("result", menus);
				
				RequestDispatcher rd=request.getRequestDispatcher("stesMenus.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}

					
			}
			
			else if(want.equalsIgnoreCase("staff"))
			{
				try
				{
				
					
				
				int row=dao.staffCountStes();
				
					
				Staff staff[]=(Staff[])null;
				
				staff=new Staff[row];
				
				staff=dao.getStaffStes();
				
				request.setAttribute("result", staff);
				
				RequestDispatcher rd=request.getRequestDispatcher("stesCanteenStaff.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}

				
			}
			
			else if(want.equalsIgnoreCase("contact"))
			{
				
				try
				{
				
					
				
				int row=dao.countStesContacts();
				
					
				Contacts contacts[]=(Contacts[])null;
				
				contacts=new Contacts[row];
				
				contacts=dao.getContactsStes();
				
				request.setAttribute("result", contacts);
				
				RequestDispatcher rd=request.getRequestDispatcher("stesContacts.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
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
