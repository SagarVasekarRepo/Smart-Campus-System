package action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoMess;
import dao.DaoSecurity;
import dto.Contacts;
import dto.SecurityStaff;
import dto.Staff;

/**
 * Servlet implementation class SecurityFetchOperation
 */
public class SecurityFetchOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecurityFetchOperation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	boolean result = false;
		
		response.setContentType("text/html");
		
	String want=request.getParameter("want");
		
		DaoSecurity dao=new DaoSecurity();
		
		if(want.equalsIgnoreCase("staff"))
		{
			
			try
			{
			
				
			
			int row=dao.staffCountSecurity();
			
				
			SecurityStaff staff[]=(SecurityStaff[])null;
			
			staff=new SecurityStaff[row];
			
			staff=dao.getSecurityStaff();
			
			request.setAttribute("result", staff);
			
			RequestDispatcher rd=request.getRequestDispatcher("securityStaff.jsp");
			
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
			
				
			
			int row=dao.countSecurityContacts();
			
				
			Contacts contacts[]=(Contacts[])null;
			
			contacts=new Contacts[row];
			
			contacts=dao.getContactsSecurity();
			
			request.setAttribute("result", contacts);
			
			RequestDispatcher rd=request.getRequestDispatcher("securityContacts.jsp");
			
			rd.forward(request, response);
			
			
			
			}
			catch(Exception e)
			{
				
				e.printStackTrace();
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
