package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import dto.Contacts;
import dto.Menu;
import dto.SecurityStaff;
import dto.Staff;

public class DaoSecurity {

	public Connection getConnection() throws InstantiationException, IllegalAccessException
	{
		Connection conn = null;
		 String url = "jdbc:mysql://localhost:3306/";
		  String dbName = "icampus";
		  String driver = "com.mysql.jdbc.Driver";
		  String userName = "root"; 
		  String password = "root"; 
		  
	  try
	  {
	Class.forName(driver).newInstance();
	  conn = DriverManager.getConnection(url+dbName,userName,password);
	  
	  
	  } 
	  catch (ClassNotFoundException e) 
	  {
	  e.printStackTrace();
	  }
	  catch(SQLException s)
	  {
		  s.printStackTrace();
		  
	  } 
	  
	  return conn;
	}

	public SecurityStaff[] getSecurityStaff() throws SQLException, InstantiationException, IllegalAccessException
	{
		SecurityStaff staff[]=(SecurityStaff[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  security_staff");
		
		res.last();
		
		int row=staffCountSecurity();
		
		SecurityStaff m=null;
		
		staff=new SecurityStaff[row];
		
		int count=0;
		
		res.beforeFirst();
		
		while(res.next())
		{
		
				m=new SecurityStaff();
				
				m.setId(res.getInt("id"));
				
				m.setName(res.getString("name"));
				
				m.setRole(res.getString("role"));
				
				
				
				staff[count]=m;
				
				count++;
			
		}
	
		
		return staff;
		
		
	}
	
	
	public int staffCountSecurity() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from security_staff";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	public boolean insertSecurityStaff(String name,String role) throws SQLException, InstantiationException, IllegalAccessException
	{
		
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="insert into security_staff(name,role) values(?,?) ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
	    pstatement.setString(1, name);
		
	    pstatement.setString(2, role);
	    
	    
		  
	    updateQuery = pstatement.executeUpdate();
		
	    if(updateQuery!=0)
	    {
	    	
	    	return true;
	    }
	    
	    else
	    {
	    	return false;
	    	
	    }
		
	}

	public boolean securityStaffDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
	{

		
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="delete from security_staff where id=? ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
	    pstatement.setInt(1, id);
		
	    updateQuery = pstatement.executeUpdate();
		
	    if(updateQuery!=0)
	    {
	    	
	    	return true;
	    }
	    
	    else
	    {
	    	return false;
	    	
	    }

	}
		
	public SecurityStaff getSecurityStaff1(int emp_id) throws SQLException, InstantiationException, IllegalAccessException
	{
		ResultSet res;
		
		PreparedStatement pstatement=null;
		
		SecurityStaff staff=new SecurityStaff();
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="select * from security_staff where id=? ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
	    pstatement.setInt(1, emp_id);
		
	    res = pstatement.executeQuery();
		
		res.beforeFirst();
		
		res.next();
		
	    staff.setName(res.getString("name"));
	    
	    staff.setRole(res.getString("role"));
	    
	    
	    
	    staff.setId(res.getInt("id"));
	    
	    
	    
	    
		return staff;
		
		
		
		
	}


	public boolean securityStaffUpdate(int emp_id,String name,String role) throws InstantiationException, IllegalAccessException, SQLException
	{
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="update security_staff set name='"+name+"' , role='"+role+"' where id=? ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
	    //pstatement.setString(1, name);
	    
	   // pstatement.setString(2, price);
	    
	    pstatement.setInt(1, emp_id);
		
	    updateQuery = pstatement.executeUpdate();
		
	    if(updateQuery!=0)
	    {
	    	
	    	return true;
	    }
	    
	    else
	    {
	    	return false;
	    	
	    }

		
	}


	public Contacts[] getContactsSecurity() throws SQLException, InstantiationException, IllegalAccessException
	{
		Contacts contacts[]=(Contacts[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  security_contacts");
		
		res.last();
		
		
		int row=countSecurityContacts();
		
		Contacts m=null;
		
		contacts=new Contacts[row];
		
		int count=0;
		
		res.beforeFirst();
		
		while(res.next())
		{
		
				m=new Contacts();
		
				m.setContact(res.getString("contact"));
				
				m.setName(res.getString("name"));
				
				m.setAddress(res.getString("address"));
				
				m.setId(res.getInt("id"));
				
				m.setEmail(res.getString("email"));
				
				m.setRole(res.getString("role"));
				
				contacts[count]=m;
				
				count++;
			
		}

		
		return contacts;

	}


	public int countSecurityContacts() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from security_contacts";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}

	public boolean securityContactDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
	{

		
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="delete from security_contacts where id=? ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
	    pstatement.setInt(1, id);
		
	    updateQuery = pstatement.executeUpdate();
		
	    if(updateQuery!=0)
	    {
	    	
	    	return true;
	    }
	    
	    else
	    {
	    	return false;
	    	
	    }

	}

	public boolean insertContactSecurity(String name,String address,String email,String contact,String role) throws SQLException, InstantiationException, IllegalAccessException
	{
		
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="insert into security_contacts(name,address,email,contact,role) values(?,?,?,?,?) ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
	    pstatement.setString(1, name);
		
	    pstatement.setString(2, address);
	    
	    pstatement.setString(3, email);
	    
	    pstatement.setString(4, contact);
	    
	    pstatement.setString(5, role);
		  
	    updateQuery = pstatement.executeUpdate();
		
	    if(updateQuery!=0)
	    {
	    	
	    	return true;
	    }
	    
	    else
	    {
	    	return false;
	    	
	    }
		
	}

	public boolean securityContactpdate(int id,String name,String address,String email,String contact,String role) throws InstantiationException, IllegalAccessException, SQLException
	{

		
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="update security_contacts set name='"+name+"' , address='"+address+"',email='"+email+"',contact='"+contact+"',role='"+role+"' where id=? ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
	    //pstatement.setString(1, name);
	    
	   // pstatement.setString(2, price);
	    
	    pstatement.setInt(1, id);
		
	    updateQuery = pstatement.executeUpdate();
		
	    if(updateQuery!=0)
	    {
	    	
	    	return true;
	    }
	    
	    else
	    {
	    	return false;
	    	
	    }

	}

	public Contacts getContactSecurity(int id) throws SQLException, InstantiationException, IllegalAccessException
	{
		
		ResultSet res;
		
		PreparedStatement pstatement=null;
		
		Contacts contacts=new Contacts();
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="select * from security_contacts where id=? ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
	    pstatement.setInt(1, id);
		
	    res = pstatement.executeQuery();
		
		res.beforeFirst();
		
		res.next();
		
	    contacts.setName(res.getString("name"));
	    
	    contacts.setAddress(res.getString("address"));
	    contacts.setEmail(res.getString("email"));
	    contacts.setContact(res.getString("contact"));
	    contacts.setRole(res.getString("role"));
	    
	    contacts.setId(id);
	    
		return contacts;
		
		
	}

}
