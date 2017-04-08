package action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoHostel;
import dao.MysqlConnect;
import dto.Contacts;
import dto.Menu;
import dto.Rooms;
import dto.Staff;

/**
 * Servlet implementation class HostelFetchOperation
 */
public class HostelFetchOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HostelFetchOperation() {
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
			String want=request.getParameter("want");
			
			if(want.equalsIgnoreCase("roomDetails"))
			{
				try
				{
				
					
				
				int row=dao.roomCountShivneri();
				
					
				Rooms rooms[]=(Rooms[])null;
				
				rooms=new Rooms[row];
				
				rooms=dao.getRoomsShivneri();
				
				request.setAttribute("result", rooms);
				
				RequestDispatcher rd=request.getRequestDispatcher("shivneriRooms.jsp");
				
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
				
					
				
				int row=dao.staffCountShivneri();
				
					
				Staff staff[]=(Staff[])null;
				
				staff=new Staff[row];
				
				staff=dao.getStaffShivneri();
				
				request.setAttribute("result", staff);
				
				RequestDispatcher rd=request.getRequestDispatcher("shivneriStaff.jsp");
				
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
				
					
				
				int row=dao.countShivneriContacts();
				
					
				Contacts contacts[]=(Contacts[])null;
				
				contacts=new Contacts[row];
				
				contacts=dao.getContactsShivneri();
				
				request.setAttribute("result", contacts);
				
				RequestDispatcher rd=request.getRequestDispatcher("shivneriContacts.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}
				
			}
		}
		
		else if(hostel.equalsIgnoreCase("sahyadri"))
		{
			String want=request.getParameter("want");
			
			if(want.equalsIgnoreCase("roomDetails"))
			{
				try
				{
					int row=dao.roomCountSahyadri();
					
					
					Rooms rooms[]=(Rooms[])null;
					
					rooms=new Rooms[row];
					
					rooms=dao.getRoomsSahyadri();
					
					request.setAttribute("result", rooms);
					
					RequestDispatcher rd=request.getRequestDispatcher("sahyadriRooms.jsp");
					
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
				
					
				
				int row=dao.staffCountSahyadri();
				
					
				Staff staff[]=(Staff[])null;
				
				staff=new Staff[row];
				
				staff=dao.getStaffSahyadri();
				
				request.setAttribute("result", staff);
				
				RequestDispatcher rd=request.getRequestDispatcher("sahyadriStaff.jsp");
				
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
				
					
				
				int row=dao.countSahyadriContacts();
				
					
				Contacts contacts[]=(Contacts[])null;
				
				contacts=new Contacts[row];
				
				contacts=dao.getContactsSahyadri();
				
				request.setAttribute("result", contacts);
				
				RequestDispatcher rd=request.getRequestDispatcher("sahyadriContacts.jsp");
				
				rd.forward(request, response);
				
				
				
				}
				catch(Exception e)
				{
					
					e.printStackTrace();
				}
				

				
			}
		}
		
		else if(hostel.equalsIgnoreCase("devgiri"))
		{
			
			String want=request.getParameter("want");
			
			if(want.equalsIgnoreCase("roomDetails"))
			{
				try
				{
				
					
					int row=dao.roomCountDevgiri();
					
					
					Rooms rooms[]=(Rooms[])null;
					
					rooms=new Rooms[row];
					
					rooms=dao.getRoomsDevgiri();
					
					request.setAttribute("result", rooms);
					
					RequestDispatcher rd=request.getRequestDispatcher("devgiriRooms.jsp");
					
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
				
					
				
				int row=dao.staffCountDevgiri();
				
					
				Staff staff[]=(Staff[])null;
				
				staff=new Staff[row];
				
				staff=dao.getStaffDevgiri();
				
				request.setAttribute("result", staff);
				
				RequestDispatcher rd=request.getRequestDispatcher("devgiriStaff.jsp");
				
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
				
					
				
				int row=dao.countDevgiriContacts();
				
					
				Contacts contacts[]=(Contacts[])null;
				
				contacts=new Contacts[row];
				
				contacts=dao.getContactsDevgiri();
				
				request.setAttribute("result", contacts);
				
				RequestDispatcher rd=request.getRequestDispatcher("devgiriContacts.jsp");
				
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
