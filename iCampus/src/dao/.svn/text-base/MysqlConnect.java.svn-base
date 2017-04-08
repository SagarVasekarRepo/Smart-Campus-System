package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import dto.Contacts;
import dto.Menu;
import dto.Staff;

public class MysqlConnect
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
	
	
	public Staff[] getStaffStes() throws SQLException, InstantiationException, IllegalAccessException
	{
		Staff staff[]=(Staff[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  stes_canteen_staff");
		
		res.last();
		
		int row=staffCountStes();
		
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
	
	
	public int staffCountStes() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from stes_canteen_staff";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	public Staff[] getStaffSit() throws SQLException, InstantiationException, IllegalAccessException
	{
		Staff staff[]=(Staff[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  sit_canteen_staff");
		
		res.last();
		
		int row=staffCountSit();
		
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
	
	
	public int staffCountSit() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from sit_canteen_staff";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	
	public Staff[] getStaffSibaca() throws SQLException, InstantiationException, IllegalAccessException
	{
		Staff staff[]=(Staff[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  sibaca_canteen_staff");
		
		res.last();
		
		int row=staffCountSibaca();
		
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
	
	
	public int staffCountSibaca() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from sibaca_canteen_staff";
		
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


public boolean insertStaffSibaca(String name,String role,String contact) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into sibaca_canteen_staff(name,role,contact) values(?,?,?) ";
	
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

public boolean sibacaStaffDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from sibaca_canteen_staff where emp_id=? ";
	
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
	
public Staff getStaffSibaca1(int emp_id) throws SQLException, InstantiationException, IllegalAccessException
{
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Staff staff=new Staff();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from sibaca_canteen_staff where emp_id=? ";
	
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


public boolean sibacaCanteenStaffUpdate(int emp_id,String name,String role,String contact) throws InstantiationException, IllegalAccessException, SQLException
{
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update sibaca_canteen_staff set name='"+name+"' , role='"+role+"',contact='"+contact+"' where emp_id=? ";
	
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


public boolean sitStaffDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from sit_canteen_staff where emp_id=? ";
	
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
	
public Staff getStaffSit1(int emp_id) throws SQLException, InstantiationException, IllegalAccessException
{
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Staff staff=new Staff();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from sit_canteen_staff where emp_id=? ";
	
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


public boolean sitCanteenStaffUpdate(int emp_id,String name,String role,String contact) throws InstantiationException, IllegalAccessException, SQLException
{
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update sit_canteen_staff set name='"+name+"' , role='"+role+"',contact='"+contact+"' where emp_id=? ";
	
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

public boolean stesStaffDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from stes_canteen_staff where emp_id=? ";
	
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
	
public Staff getStaffStes1(int emp_id) throws SQLException, InstantiationException, IllegalAccessException
{
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Staff staff=new Staff();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from stes_canteen_staff where emp_id=? ";
	
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


public boolean stesCanteenStaffUpdate(int emp_id,String name,String role,String contact) throws InstantiationException, IllegalAccessException, SQLException
{
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update stes_canteen_staff set name='"+name+"' , role='"+role+"',contact='"+contact+"' where emp_id=? ";
	
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

public boolean insertStaffSit(String name,String role,String contact) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into sit_canteen_staff(name,role,contact) values(?,?,?) ";
	
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

public boolean insertStaffStes(String name,String role,String contact) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into stes_canteen_staff(name,role,contact) values(?,?,?) ";
	
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

public Contacts[] getContactsSibaca() throws SQLException, InstantiationException, IllegalAccessException
{
	Contacts contacts[]=(Contacts[])null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	ResultSet res = st.executeQuery("SELECT * FROM  sibaca_contacts");
	
	res.last();
	
	int row=countSibacaContacts();
	
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


public int countSibacaContacts() throws SQLException, InstantiationException, IllegalAccessException
{
	Connection conn=getConnection();
	
	Statement stmt = conn.createStatement();
	
	String str="select * from sibaca_contacts";
	
	int row=0;
	
	ResultSet res=stmt.executeQuery(str);
	
	res.last();
	
	row=res.getRow();
	
	return row;
}

public boolean sibacaContactDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from sibaca_contacts where id=? ";
	
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


public boolean sitContactDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from sit_contacts where id=? ";
	
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


public boolean stesContactDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from stes_contacts where id=? ";
	
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

public Contacts[] getContactsSit() throws SQLException, InstantiationException, IllegalAccessException
{
	Contacts contacts[]=(Contacts[])null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	ResultSet res = st.executeQuery("SELECT * FROM  sit_contacts");
	
	res.last();
	
	int row=countSitContacts();
	
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


public int countSitContacts() throws SQLException, InstantiationException, IllegalAccessException
{
	Connection conn=getConnection();
	
	Statement stmt = conn.createStatement();
	
	String str="select * from sit_contacts";
	
	int row=0;
	
	ResultSet res=stmt.executeQuery(str);
	
	res.last();
	
	row=res.getRow();
	
	return row;
}

public Contacts[] getContactsStes() throws SQLException, InstantiationException, IllegalAccessException
{
	Contacts contacts[]=(Contacts[])null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	ResultSet res = st.executeQuery("SELECT * FROM  stes_contacts");
	
	res.last();
	
	int row=countStesContacts();
	
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


public int countStesContacts() throws SQLException, InstantiationException, IllegalAccessException
{
	Connection conn=getConnection();
	
	Statement stmt = conn.createStatement();
	
	String str="select * from stes_contacts";
	
	int row=0;
	
	ResultSet res=stmt.executeQuery(str);
	
	res.last();
	
	row=res.getRow();
	
	return row;
}

public boolean insertContactSibaca(String name,String address,String email,String contact,String role) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into sibaca_contacts(name,address,email,contact,role) values(?,?,?,?,?) ";
	
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


public boolean insertContactSit(String name,String address,String email,String contact,String role) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into sit_contacts(name,address,email,contact,role) values(?,?,?,?,?) ";
	
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


public boolean insertContactStes(String name,String address,String email,String contact,String role) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into stes_contacts(name,address,email,contact,role) values(?,?,?,?,?) ";
	
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

public boolean sibacaContactpdate(int id,String name,String address,String email,String contact,String role) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update sibaca_contacts set name='"+name+"' , address='"+address+"',email='"+email+"',contact='"+contact+"',role='"+role+"' where id=? ";
	
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

public boolean sitContactpdate(int id,String name,String address,String email,String contact,String role) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update sit_contacts set name='"+name+"' , address='"+address+"',email='"+email+"',contact='"+contact+"',role='"+role+"' where id=? ";
	
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

public boolean stesContactpdate(int id,String name,String address,String email,String contact,String role) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update stes_contacts set name='"+name+"' , address='"+address+"',email='"+email+"',contact='"+contact+"',role='"+role+"' where id=? ";
	
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

public Contacts getContactSibaca(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Contacts contacts=new Contacts();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from sibaca_contacts where id=? ";
	
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

public Contacts getContactSit(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Contacts contacts=new Contacts();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from sit_contacts where id=? ";
	
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

public Contacts getContactStes(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Contacts contacts=new Contacts();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from stes_contacts where id=? ";
	
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

/*public static void main(String args[]) throws SQLException, InstantiationException, IllegalAccessException
	{
		MysqlConnect dao=new MysqlConnect();
		
		Connection conn=dao.GetConnection();
		
		System.out.println("Success");
		
		System.out.println("Rows :: "+dao.Menu_Count());
		
	}*/
}
