package action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoMess;
import dao.MysqlConnect;
import dto.Contacts;
import dto.Menu;
import dto.Staff;

/**
 * Servlet implementation class MessFetchOperation
 */
public class MessFetchOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MessFetchOperation() {
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
				
					
				
				int row=dao.staffCountArjunMess();
				
					
				Staff staff[]=(Staff[])null;
				
				staff=new Staff[row];
				
				staff=dao.getStaffArjun();
				
				request.setAttribute("result", staff);
				
				RequestDispatcher rd=request.getRequestDispatcher("arjunMessStaff.jsp");
				
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
				
					
				
				int row=dao.countArjunContacts();
				
					
				Contacts contacts[]=(Contacts[])null;
				
				contacts=new Contacts[row];
				
				contacts=dao.getContactsArjun();
				
				request.setAttribute("result", contacts);
				
				RequestDispatcher rd=request.getRequestDispatcher("arjunContacts.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}
				
			}
		}
		
		else if(mess.equalsIgnoreCase("sahdev"))
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
				
					
				
				int row=dao.staffCountSahdevMess();
				
					
				Staff staff[]=(Staff[])null;
				
				staff=new Staff[row];
				
				staff=dao.getStaffSahdev();
				
				request.setAttribute("result", staff);
				
				RequestDispatcher rd=request.getRequestDispatcher("sahdevMessStaff.jsp");
				
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
				
					
				
				int row=dao.countSahdevContacts();
				
					
				Contacts contacts[]=(Contacts[])null;
				
				contacts=new Contacts[row];
				
				contacts=dao.getContactsSahdev();
				
				request.setAttribute("result", contacts);
				
				RequestDispatcher rd=request.getRequestDispatcher("sahdevContacts.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}
				

				
			}
		}
		
		else if(mess.equalsIgnoreCase("kalyani"))
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
				
					
				
				int row=dao.staffCountKalyaniMess();
				
					
				Staff staff[]=(Staff[])null;
				
				staff=new Staff[row];
				
				staff=dao.getStaffKalyani();
				
				request.setAttribute("result", staff);
				
				RequestDispatcher rd=request.getRequestDispatcher("kalyaniMessStaff.jsp");
				
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
				
					
				
				int row=dao.countKalyaniContacts();
				
					
				Contacts contacts[]=(Contacts[])null;
				
				contacts=new Contacts[row];
				
				contacts=dao.getContactsKalyani();
				
				request.setAttribute("result", contacts);
				
				RequestDispatcher rd=request.getRequestDispatcher("kalyaniContacts.jsp");
				
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
