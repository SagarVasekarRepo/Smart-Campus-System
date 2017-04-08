package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

import dto.Contacts;
import dto.Menu;
import dto.Rooms;
import dto.Staff;

public class DaoHostel {

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
	
	public Rooms[] getRoomsDevgiri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Rooms rooms[]=(Rooms[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  devgiri_room_details");
		
		res.last();
		
		int row=roomCountDevgiri();
		
		Rooms m=null;
		
		rooms=new Rooms[row];
		
		int count=0;
		
		res.beforeFirst();
		
		while(res.next())
		{
		
				m=new Rooms();
		
				
				
				m.setName(res.getString("name"));
				
				m.setRoom_no(res.getString("room_no"));
				
				m.setId(res.getInt("id"));
				
				rooms[count]=m;
				
				count++;
			
		}
	
		
		return rooms;
		
		
	}
	
	
	public int roomCountDevgiri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from devgiri_room_details";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	public Rooms[] getRoomsSahyadri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Rooms rooms[]=(Rooms[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  sahyadri_room_details");
		
		res.last();
		
		int row=roomCountSahyadri();
		
		Rooms m=null;
		
		rooms=new Rooms[row];
		
		int count=0;
		
		res.beforeFirst();
		
		while(res.next())
		{
		
				m=new Rooms();
		
				
				
				m.setName(res.getString("name"));
				
				m.setRoom_no(res.getString("room_no"));
				
				m.setId(res.getInt("id"));
				
				rooms[count]=m;
				
				count++;
			
		}
	
		
		return rooms;
		
		
	}
	
	
	public int roomCountSahyadri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from sahyadri_room_details";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	public Rooms[] getRoomsShivneri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Rooms rooms[]=(Rooms[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  shivneri_room_details");
		
		res.last();
		
		int row=roomCountShivneri();
		
		Rooms m=null;
		
		rooms=new Rooms[row];
		
		int count=0;
		
		res.beforeFirst();
		
		while(res.next())
		{
		
				m=new Rooms();
		
				
				
				m.setName(res.getString("name"));
				
				m.setRoom_no(res.getString("room_no"));
				
				m.setId(res.getInt("id"));
				
				rooms[count]=m;
				
				count++;
			
		}
	
		
		return rooms;
		
		
	}
	
	
	public int roomCountShivneri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from shivneri_room_details";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	
	public Staff[] getStaffShivneri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Staff staff[]=(Staff[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  shivneri_staff");
		
		res.last();
		
		int row=staffCountShivneri();
		
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
	
	
	public int staffCountShivneri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from shivneri_staff";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	public Staff[] getStaffSahyadri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Staff staff[]=(Staff[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM  sahyadri_staff");
		
		res.last();
		
		int row=staffCountSahyadri();
		
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
	
	
	public int staffCountSahyadri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from sahyadri_staff";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	
	public Staff[] getStaffDevgiri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Staff staff[]=(Staff[])null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		ResultSet res = st.executeQuery("SELECT * FROM devgiri_staff");
		
		res.last();
		
		int row=staffCountDevgiri();
		
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
	
	
	public int staffCountDevgiri() throws SQLException, InstantiationException, IllegalAccessException
	{
		Connection conn=getConnection();
		
		Statement stmt = conn.createStatement();
		
		String str="select * from devgiri_staff";
		
		int row=0;
		
		ResultSet res=stmt.executeQuery(str);
		
		res.last();
		
		row=res.getRow();
		
		return row;
	}
	
	
	public boolean insertRoomSahyadri(String name,String roomNo) throws SQLException, InstantiationException, IllegalAccessException
	{
		
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="insert into sahyadri_room_details(name,room_no) values(?,?) ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
        pstatement.setString(1, name);
		
        pstatement.setString(2, roomNo);
		  
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
	
	
	public boolean insertRoomDevgiri(String name,String roomNo) throws SQLException, InstantiationException, IllegalAccessException
	{
		
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="insert into devgiri_room_details(name,room_no) values(?,?) ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
        pstatement.setString(1, name);
		
        pstatement.setString(2, roomNo);
		  
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
	
	
	public boolean insertRoomShivneri(String name,String roomNo) throws SQLException, InstantiationException, IllegalAccessException
	{
		
		int updateQuery=0;
		
		PreparedStatement pstatement=null;
		
		Connection conn=getConnection();
		
		Statement st = conn.createStatement();
		
		String qry ="insert into shivneri_room_details(name,room_no) values(?,?) ";
		
		pstatement = (PreparedStatement) conn.prepareStatement(qry);
		
        pstatement.setString(1, name);
		
        pstatement.setString(2, roomNo);
		  
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
	
	
	
	
public boolean sahyadriRoomDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from sahyadri_room_details where id=? ";
	
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


public boolean devgiriRoomDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from devgiri_room_details where id=? ";
	
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


public boolean shivneriRoomDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from shivneri_room_details where id=? ";
	
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
	
public boolean shivneriRoomUpdate(int id,String name,String roomNo) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update shivneri_room_details set name='"+name+"' , room_no='"+roomNo+"' where id=? ";
	
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

public Rooms getRoomShivneri(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Rooms rooms=new Rooms();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from shivneri_room_details where id=? ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setInt(1, id);
	
    res = pstatement.executeQuery();
	
	res.beforeFirst();
	
	res.next();
	
    rooms.setName(res.getString("name"));
    
    rooms.setRoom_no(res.getString("room_no"));
    
    rooms.setId(id);
    
	return rooms;
	
	
}

public boolean sahyadriRoomUpdate(int id,String name,String roomNo) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update sahyadri_room_details set name='"+name+"' , room_no='"+roomNo+"' where id=? ";
	
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

public Rooms getRoomSahyadri(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Rooms rooms=new Rooms();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from sahyadri_room_details where id=? ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setInt(1, id);
	
    res = pstatement.executeQuery();
	
	res.beforeFirst();
	
	res.next();
	
    rooms.setName(res.getString("name"));
    
    rooms.setRoom_no(res.getString("room_no"));
    
    rooms.setId(id);
    
	return rooms;
	
	
}


public boolean devgiriRoomUpdate(int id,String name,String roomNo) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update devgiri_room_details set name='"+name+"' , room_no='"+roomNo+"' where id=? ";
	
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

public Rooms getRoomDevgiri(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Rooms rooms=new Rooms();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from devgiri_room_details where id=? ";
	
	pstatement = (PreparedStatement) conn.prepareStatement(qry);
	
    pstatement.setInt(1, id);
	
    res = pstatement.executeQuery();
	
	res.beforeFirst();
	
	res.next();
	
    rooms.setName(res.getString("name"));
    
    rooms.setRoom_no(res.getString("room_no"));
    
    rooms.setId(id);
    
	return rooms;
	
	
}


public boolean insertStaffShivneri(String name,String role,String contact) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into shivneri_staff(name,role,contact) values(?,?,?) ";
	
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

public boolean shivneriStaffDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from shivneri_staff where emp_id=? ";
	
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
	
public Staff getStaffShivneri1(int emp_id) throws SQLException, InstantiationException, IllegalAccessException
{
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Staff staff=new Staff();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from shivneri_staff where emp_id=? ";
	
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


public boolean shivneriStaffUpdate(int emp_id,String name,String role,String contact) throws InstantiationException, IllegalAccessException, SQLException
{
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update shivneri_staff set name='"+name+"' , role='"+role+"',contact='"+contact+"' where emp_id=? ";
	
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


public boolean sahyadriStaffDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from sahyadri_staff where emp_id=? ";
	
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
	
public Staff getStaffSahyadri1(int emp_id) throws SQLException, InstantiationException, IllegalAccessException
{
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Staff staff=new Staff();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from sahyadri_staff where emp_id=? ";
	
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


public boolean sahyadriStaffUpdate(int emp_id,String name,String role,String contact) throws InstantiationException, IllegalAccessException, SQLException
{
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update sahyadri_staff set name='"+name+"' , role='"+role+"',contact='"+contact+"' where emp_id=? ";
	
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

public boolean devgiriStaffDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from devgiri_staff where emp_id=? ";
	
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
	
public Staff getStaffDevgiri1(int emp_id) throws SQLException, InstantiationException, IllegalAccessException
{
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Staff staff=new Staff();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from devgiri_staff where emp_id=? ";
	
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


public boolean devgiriStaffUpdate(int emp_id,String name,String role,String contact) throws InstantiationException, IllegalAccessException, SQLException
{
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update devgiri_staff set name='"+name+"' , role='"+role+"',contact='"+contact+"' where emp_id=? ";
	
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

public boolean insertStaffDevgiri(String name,String role,String contact) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into devgiri_staff(name,role,contact) values(?,?,?) ";
	
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

public boolean insertStaffSahyadri(String name,String role,String contact) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into sahyadri_staff(name,role,contact) values(?,?,?) ";
	
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

public Contacts[] getContactsShivneri() throws SQLException, InstantiationException, IllegalAccessException
{
	Contacts contacts[]=(Contacts[])null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	ResultSet res = st.executeQuery("SELECT * FROM  shivneri_contacts");
	
	res.last();
	
	int row=countShivneriContacts();
	
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


public int countShivneriContacts() throws SQLException, InstantiationException, IllegalAccessException
{
	Connection conn=getConnection();
	
	Statement stmt = conn.createStatement();
	
	String str="select * from shivneri_contacts";
	
	int row=0;
	
	ResultSet res=stmt.executeQuery(str);
	
	res.last();
	
	row=res.getRow();
	
	return row;
}

public boolean shivneriContactDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from shivneri_contacts where id=? ";
	
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


public boolean sahyadriContactDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from sahyadri_contacts where id=? ";
	
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


public boolean devgiriContactDelete(int id) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="delete from devgiri_contacts where id=? ";
	
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

public Contacts[] getContactsSahyadri() throws SQLException, InstantiationException, IllegalAccessException
{
	Contacts contacts[]=(Contacts[])null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	ResultSet res = st.executeQuery("SELECT * FROM  sahyadri_contacts");
	
	res.last();
	
	int row=countSahyadriContacts();
	
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


public int countSahyadriContacts() throws SQLException, InstantiationException, IllegalAccessException
{
	Connection conn=getConnection();
	
	Statement stmt = conn.createStatement();
	
	String str="select * from sahyadri_contacts";
	
	int row=0;
	
	ResultSet res=stmt.executeQuery(str);
	
	res.last();
	
	row=res.getRow();
	
	return row;
}

public Contacts[] getContactsDevgiri() throws SQLException, InstantiationException, IllegalAccessException
{
	Contacts contacts[]=(Contacts[])null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	ResultSet res = st.executeQuery("SELECT * FROM  devgiri_contacts");
	
	res.last();
	
	int row=countDevgiriContacts();
	
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


public int countDevgiriContacts() throws SQLException, InstantiationException, IllegalAccessException
{
	Connection conn=getConnection();
	
	Statement stmt = conn.createStatement();
	
	String str="select * from devgiri_contacts";
	
	int row=0;
	
	ResultSet res=stmt.executeQuery(str);
	
	res.last();
	
	row=res.getRow();
	
	return row;
}

public boolean insertContactShivneri(String name,String address,String email,String contact,String role) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into shivneri_contacts(name,address,email,contact,role) values(?,?,?,?,?) ";
	
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


public boolean insertContactSahyadri(String name,String address,String email,String contact,String role) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into sahyadri_contacts(name,address,email,contact,role) values(?,?,?,?,?) ";
	
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


public boolean insertContactDevgiri(String name,String address,String email,String contact,String role) throws SQLException, InstantiationException, IllegalAccessException
{
	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="insert into devgiri_contacts(name,address,email,contact,role) values(?,?,?,?,?) ";
	
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

public boolean shivneriContactpdate(int id,String name,String address,String email,String contact,String role) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update shivneri_contacts set name='"+name+"' , address='"+address+"',email='"+email+"',contact='"+contact+"',role='"+role+"' where id=? ";
	
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

public boolean sahyadriContactpdate(int id,String name,String address,String email,String contact,String role) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update sahyadri_contacts set name='"+name+"' , address='"+address+"',email='"+email+"',contact='"+contact+"',role='"+role+"' where id=? ";
	
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

public boolean devgiriContactpdate(int id,String name,String address,String email,String contact,String role) throws InstantiationException, IllegalAccessException, SQLException
{

	
	int updateQuery=0;
	
	PreparedStatement pstatement=null;
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="update devgiri_contacts set name='"+name+"' , address='"+address+"',email='"+email+"',contact='"+contact+"',role='"+role+"' where id=? ";
	
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

public Contacts getContactShivneri(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Contacts contacts=new Contacts();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from shivneri_contacts where id=? ";
	
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

public Contacts getContactSahyadri(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Contacts contacts=new Contacts();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from sahyadri_contacts where id=? ";
	
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

public Contacts getContactDevgiri(int id) throws SQLException, InstantiationException, IllegalAccessException
{
	
	ResultSet res;
	
	PreparedStatement pstatement=null;
	
	Contacts contacts=new Contacts();
	
	Connection conn=getConnection();
	
	Statement st = conn.createStatement();
	
	String qry ="select * from devgiri_contacts where id=? ";
	
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
