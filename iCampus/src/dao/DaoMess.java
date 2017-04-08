package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import dto.Contacts;
import dto.Menu;
import dto.Staff;

public class DaoMess 
{
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
	
	public Menu[] getMenusSibaca() throws SQLException, InstantiationException, IllegalAccessException
	{
		Menu menus[]=(Menu[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  sibaca_menu");
		
		res.last();
		
		int row=menuCountSibaca();
		
		Menu m=null;
		
		menus=new Menu[row];
		
		int count=0;
		
		res.beforeFirst();
		
		while(res.next())
		{
		
				m=new Menu();
		
				
				
				m.setName(res.getString("name"));
				
				m.setPrice(res.getString("price"));
				
				m.setId(res.getInt("id"));
				
				menus[count]=m;
				
				count++;
			
		}
	
		
		return menus;
		
		
	}
	
	
	public int menuCountSibaca() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from sibaca_menu";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	public Menu[] getMenusSit() throws SQLException, InstantiationException, IllegalAccessException
	{
		Menu menus[]=(Menu[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  sit_menu");
		
		res.last();
		
		int row=menuCountSit();
		
		Menu m=null;
		
		menus=new Menu[row];
		
		int count=0;
		
		res.beforeFirst();
		
		while(res.next())
		{
		
				m=new Menu();
				
				m.setName(res.getString("name"));
				
				m.setPrice(res.getString("price"));
				
				m.setId(res.getInt("id"));
				
				menus[count]=m;
				
				count++;
			
		}
	
		
		return menus;
		
		
	}
	
	
	public int menuCountSit() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from sit_menu";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	public Menu[] getMenusStes() throws SQLException, InstantiationException, IllegalAccessException
	{
		Menu menus[]=(Menu[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  stes_menu");
		
		res.last();
		
		int row=menuCountStes();
		
		Menu m=null;
		
		menus=new Menu[row];
		
		int count=0;
		
		res.beforeFirst();
		
		while(res.next())
		{
		
				m=new Menu();
				
				m.setId(res.getInt("id"));
				
				m.setName(res.getString("name"));
				
				m.setPrice(res.getString("price"));
				
				menus[count]=m;
				
				count++;
			
		}
	
		
		return menus;
		
		
	}
	
	
	public int menuCountStes() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from stes_menu";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	
	public Staff[] getStaffArjun() throws SQLException, InstantiationException, IllegalAccessException
	{
		Staff staff[]=(Staff[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  arjun_mess_staff");
		
		res.last();
		
		int row=staffCountArjunMess();
		
		Staff m=null;
		
		staff=new Staff[row];
		
		int count=0;
		
		res.beforeFirst();
		
		while(res.next())
		{
		
				m=new Staff();
				
				m.setEmp_id(res.getInt("emp_id"));
				
				m.setName(res.getString("name"));
				
				m.setRole(res.getString("role"));
				
				m.setContact(res.getString("contact"));
				
				staff[count]=m;
				
				count++;
			
		}
	
		
		return staff;
		
		
	}
	
	
	public int staffCountArjunMess() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from arjun_mess_staff";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	public Staff[] getStaffSahdev() throws SQLException, InstantiationException, IllegalAccessException
	{
		Staff staff[]=(Staff[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  sahdev_mess_staff");
		
		res.last();
		
		int row=staffCountSahdevMess();
		
		Staff m=null;
		
		staff=new Staff[row];
		
		int count=0;
		
		res.beforeFirst();
		
		while(res.next())
		{
		
				m=new Staff();
				
				m.setEmp_id(res.getInt("emp_id"));
				
				m.setName(res.getString("name"));
				
				m.setRole(res.getString("role"));
				
				m.setContact(res.getString("contact"));
				
				staff[count]=m;
				
				count++;
			
		}
	
		
		return staff;
		
		
	}
	
	
	public int staffCountSahdevMess() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from sahdev_mess_staff";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	
	public Staff[] getStaffKalyani() throws SQLException, InstantiationException, IllegalAccessException
	{
		Staff staff[]=(Staff[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  kalyani_mess_staff");
		
		res.last();
		
		int row=staffCountKalyaniMess();
		
		Staff m=null;
		
		staff=new Staff[row];
		
		int count=0;
		
		res.beforeFirst();
		
		while(res.next())
		{
		
				m=new Staff();
				
				m.setEmp_id(res.getInt("emp_id"));
				
				m.setName(res.getString("name"));
				
				m.setRole(res.getString("role"));
				
				m.setContact(res.getString("contact"));
				
				staff[count]=m;
				
				count++;
			
		}
	
		
		return staff;
		
		
	}
	
	
	public int staffCountKalyaniMess() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from kalyani_mess_staff";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	public boolean insertMenusSibaca(String name,String price) throws SQLException, InstantiationException, IllegalAccessException
	{
		
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="insert into sibaca_menu(name,price) values(?,?) ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
        pstatement.setString(1, name);
		
        pstatement.setString(2, price);
		  
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
	
	
	public boolean insertMenusSit(String name,String price) throws SQLException, InstantiationException, IllegalAccessException
	{
		
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="insert into sit_menu(name,price) values(?,?) ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
        pstatement.setString(1, name);
		
        pstatement.setString(2, price);
		  
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
	
	
	public boolean insertMenusStes(String name,String price) throws SQLException, InstantiationException, IllegalAccessException
	{
		
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="insert into stes_menu(name,price) values(?,?) ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
        pstatement.setString(1, name);
		
        pstatement.setString(2, price);
		  
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
	

public boolean sibacaMenuDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from sibaca_menu where id=? ";
	
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
	

public boolean sibacaMenuUpdate(int id,String name,String price) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update sibaca_menu set name='"+name+"' , price='"+price+"' where id=? ";
	
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

public Menu getMenuSibaca(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Menu menus=new Menu();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from sibaca_menu where id=? ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setInt(1, id);
	
    res = pstatement.executeQuery();
	
	res.beforeFirst();
	
	res.next();
	
    menus.setName(res.getString("name"));
    
    menus.setPrice(res.getString("price"));
    
    menus.setId(id);
    
	return menus;
	
	
}

public boolean sitMenuDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from sit_menu where id=? ";
	
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
	

public boolean sitMenuUpdate(int id,String name,String price) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update sit_menu set name='"+name+"' , price='"+price+"' where id=? ";
	
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

public Menu getMenuSit(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Menu menus=new Menu();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from sit_menu where id=? ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setInt(1, id);
	
    res = pstatement.executeQuery();
	
	res.beforeFirst();
	
	res.next();
	
    menus.setName(res.getString("name"));
    
    menus.setPrice(res.getString("price"));
    
    menus.setId(id);
    
	return menus;
	
	
}


public boolean stesMenuDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from stes_menu where id=? ";
	
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
	

public boolean stesMenuUpdate(int id,String name,String price) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update stes_menu set name='"+name+"' , price='"+price+"' where id=? ";
	
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

public Menu getMenuStes(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Menu menus=new Menu();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from stes_menu where id=? ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setInt(1, id);
	
    res = pstatement.executeQuery();
	
	res.beforeFirst();
	
	res.next();
	
    menus.setName(res.getString("name"));
    
    menus.setPrice(res.getString("price"));
    
    menus.setId(id);
    
	return menus;
	
	
}


public boolean insertStaffArjun(String name,String role,String contact) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into arjun_mess_staff(name,role,contact) values(?,?,?) ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setString(1, name);
	
    pstatement.setString(2, role);
    
    pstatement.setString(3, contact);
	  
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

public boolean arjunStaffDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from arjun_mess_staff where emp_id=? ";
	
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
	
public Staff getStaffArjun1(int emp_id) throws SQLException, InstantiationException, IllegalAccessException
{
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Staff staff=new Staff();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from arjun_mess_staff where emp_id=? ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setInt(1, emp_id);
	
    res = pstatement.executeQuery();
	
	res.beforeFirst();
	
	res.next();
	
    staff.setName(res.getString("name"));
    
    staff.setRole(res.getString("role"));
    
    staff.setContact(res.getString("contact"));
    
    staff.setEmp_id(res.getInt("emp_id"));
    
    
    
    
	return staff;
	
	
	
	
}


public boolean arjunMessStaffUpdate(int emp_id,String name,String role,String contact) throws InstantiationException, IllegalAccessException, SQLException
{
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update arjun_mess_staff set name='"+name+"' , role='"+role+"',contact='"+contact+"' where emp_id=? ";
	
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


public boolean sahdevStaffDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from sahdev_mess_staff where emp_id=? ";
	
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
	
public Staff getStaffSahdev1(int emp_id) throws SQLException, InstantiationException, IllegalAccessException
{
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Staff staff=new Staff();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from sahdev_mess_staff where emp_id=? ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setInt(1, emp_id);
	
    res = pstatement.executeQuery();
	
	res.beforeFirst();
	
	res.next();
	
    staff.setName(res.getString("name"));
    
    staff.setRole(res.getString("role"));
    
    staff.setContact(res.getString("contact"));
    
    staff.setEmp_id(res.getInt("emp_id"));
    
    
    
    
	return staff;
	
	
	
	
}


public boolean sahdevMessStaffUpdate(int emp_id,String name,String role,String contact) throws InstantiationException, IllegalAccessException, SQLException
{
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update sahdev_mess_staff set name='"+name+"' , role='"+role+"',contact='"+contact+"' where emp_id=? ";
	
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

public boolean kalyaniStaffDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from kalyani_mess_staff where emp_id=? ";
	
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
	
public Staff getStaffkalyani1(int emp_id) throws SQLException, InstantiationException, IllegalAccessException
{
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Staff staff=new Staff();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from kalyani_mess_staff where emp_id=? ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setInt(1, emp_id);
	
    res = pstatement.executeQuery();
	
	res.beforeFirst();
	
	res.next();
	
    staff.setName(res.getString("name"));
    
    staff.setRole(res.getString("role"));
    
    staff.setContact(res.getString("contact"));
    
    staff.setEmp_id(res.getInt("emp_id"));
    
    
    
    
	return staff;
	
	
	
	
}


public boolean kalyaniMessStaffUpdate(int emp_id,String name,String role,String contact) throws InstantiationException, IllegalAccessException, SQLException
{
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update kalyani_mess_staff set name='"+name+"' , role='"+role+"',contact='"+contact+"' where emp_id=? ";
	
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

public boolean insertStaffKalyani(String name,String role,String contact) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into kalyani_mess_staff(name,role,contact) values(?,?,?) ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setString(1, name);
	
    pstatement.setString(2, role);
    
    pstatement.setString(3, contact);
	  
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

public boolean insertStaffSahdev(String name,String role,String contact) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into sahdev_mess_staff(name,role,contact) values(?,?,?) ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setString(1, name);
	
    pstatement.setString(2, role);
    
    pstatement.setString(3, contact);
	  
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

public Contacts[] getContactsArjun() throws SQLException, InstantiationException, IllegalAccessException
{
	Contacts contacts[]=(Contacts[])null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	ResultSet res = st.executeQuery("SELECT * FROM  arjun_mess_contacts");
	
	res.last();
	
	int row=countArjunContacts();
	
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


public int countArjunContacts() throws SQLException, InstantiationException, IllegalAccessException
{
	Connection conn=getConnection();
	
	Statement stmt = conn.createStatement();
	
	String str="select * from arjun_mess_contacts";
	
	int row=0;
	
	ResultSet res=stmt.executeQuery(str);
	
	res.last();
	
	row=res.getRow();
	
	return row;
}

public boolean arjunContactDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from arjun_mess_contacts where id=? ";
	
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


public boolean sahdevContactDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from sahdev_mess_contacts where id=? ";
	
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


public boolean kalyaniContactDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from kalyani_mess_contacts where id=? ";
	
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

public Contacts[] getContactsSahdev() throws SQLException, InstantiationException, IllegalAccessException
{
	Contacts contacts[]=(Contacts[])null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	ResultSet res = st.executeQuery("SELECT * FROM  sahdev_mess_contacts");
	
	res.last();
	
	int row=countSahdevContacts();
	
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


public int countSahdevContacts() throws SQLException, InstantiationException, IllegalAccessException
{
	Connection conn=getConnection();
	
	Statement stmt = conn.createStatement();
	
	String str="select * from sahdev_mess_contacts";
	
	int row=0;
	
	ResultSet res=stmt.executeQuery(str);
	
	res.last();
	
	row=res.getRow();
	
	return row;
}

public Contacts[] getContactsKalyani() throws SQLException, InstantiationException, IllegalAccessException
{
	Contacts contacts[]=(Contacts[])null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	ResultSet res = st.executeQuery("SELECT * FROM  kalyani_mess_contacts");
	
	res.last();
	
	int row=countKalyaniContacts();
	
	Contacts m=null;
	
	contacts=new Contacts[row];
	
	int count=0;
	
	res.beforeFirst();
	
	while(res.next())
	{
	
			m=new Contacts();
	
			m.setContact(res.getString("contacts"));
			
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


public int countKalyaniContacts() throws SQLException, InstantiationException, IllegalAccessException
{
	Connection conn=getConnection();
	
	Statement stmt = conn.createStatement();
	
	String str="select * from kalyani_mess_contacts";
	
	int row=0;
	
	ResultSet res=stmt.executeQuery(str);
	
	res.last();
	
	row=res.getRow();
	
	return row;
}

public boolean insertContactArjun(String name,String address,String email,String contact,String role) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into arjun_mess_contacts(name,address,email,contact,role) values(?,?,?,?,?) ";
	
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


public boolean insertContactSahdev(String name,String address,String email,String contact,String role) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into sahdev_mess_contacts(name,address,email,contact,role) values(?,?,?,?,?) ";
	
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


public boolean insertContactKalyani(String name,String address,String email,String contact,String role) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into kalyani_mess_contacts(name,address,email,contacts,role) values(?,?,?,?,?) ";
	
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

public boolean arjunContactpdate(int id,String name,String address,String email,String contact,String role) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update arjun_mess_contacts set name='"+name+"' , address='"+address+"',email='"+email+"',contact='"+contact+"',role='"+role+"' where id=? ";
	
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

public boolean sahdevContactpdate(int id,String name,String address,String email,String contact,String role) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update sahdev_mess_contacts set name='"+name+"' , address='"+address+"',email='"+email+"',contact='"+contact+"',role='"+role+"' where id=? ";
	
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

public boolean kalyaniContactpdate(int id,String name,String address,String email,String contact,String role) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update kalyani_mess_contacts set name='"+name+"' , address='"+address+"',email='"+email+"',contacts='"+contact+"',role='"+role+"' where id=? ";
	
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

public Contacts getContactArjun(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Contacts contacts=new Contacts();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from arjun_mess_contacts where id=? ";
	
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

public Contacts getContactSahdev(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Contacts contacts=new Contacts();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from sahdev_mess_contacts where id=? ";
	
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

public Contacts getContactKalyani(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Contacts contacts=new Contacts();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from kalyani_mess_contacts where id=? ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setInt(1, id);
	
    res = pstatement.executeQuery();
	
	res.beforeFirst();
	
	res.next();
	
    contacts.setName(res.getString("name"));
    
    contacts.setAddress(res.getString("address"));
    contacts.setEmail(res.getString("email"));
    contacts.setContact(res.getString("contacts"));
    contacts.setRole(res.getString("role"));
    
    contacts.setId(id);
    
	return contacts;
	
	
}

	
}

