package com.dal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.DataInputStream;

import com.dal.helper.MyDBConnection;
import com.dal.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	Connection con;
	PreparedStatement ps;
	Statement stmt;
	ResultSet rs;
	
	
	@Override
	public void insertEmployee(Employee emp) {
	     
		try {
			con  = MyDBConnection.getDbConnection();
			ps=con.prepareStatement("insert into dalemp values(?,?)");
			
			ps.setInt(1, emp.getEid());
			ps.setString(2, emp.getEname());
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows  + " got inserted... ");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	@Override
	public void showEmployee() {	
		try {
			con  = MyDBConnection.getDbConnection();
			stmt= con.createStatement();
			rs = stmt.executeQuery("select * from dalemp");
			while(rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
				
			}
			
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateEmployee(int eid, String ename) {
		/*try {
			con  = MyDBConnection.getDbConnection();
			Statement stmt = con.createStatement();
			String sql = "UPDATE dalemp " +
		     "SET empname = 'API' WHERE empid = 10";
            stmt.executeUpdate(sql);
			System.out.println("got updated...");
		} catch (SQLException e) {

			e.printStackTrace();
		}*/
		
		try {
			con  = MyDBConnection.getDbConnection();
			Statement stmt = con.createStatement();
			DataInputStream KB=new DataInputStream(System.in);
		
		String q="Select * from dalemp where empid='"+ eid +"'";

		ResultSet rs=stmt.executeQuery(q);

		if(rs.next())
		{
			
			System.out.println("Employee id:"+rs.getString(1));
			System.out.println("Sure To Update Above Record Yes/No?");
			String ch=KB.readLine();
			if(ch.equalsIgnoreCase("yes"))
			{
				 q="UPDATE dalemp " +
			     "SET empname = '" + ename + " ' " + "WHERE empid = '" + eid + "'";
				stmt.executeUpdate(q);
				System.out.println("Employee Id - " + eid + " record got updated in DB...");
			}
		}
		else
		{
			System.out.println("Record Not Found...");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}

	
	public void deleteEmployee(int eid) {
		try {
			con  = MyDBConnection.getDbConnection();
			Statement stmt = con.createStatement();
			DataInputStream KB=new DataInputStream(System.in);
		
		String q="Select * from dalemp where empid='"+ eid +"'";

		ResultSet rs=stmt.executeQuery(q);

		if(rs.next())
		{
			
			System.out.println("Employee id:"+rs.getString(1));
			System.out.println("Sure To Delete Above Record Yes/No?");
			String ch=KB.readLine();
			if(ch.equalsIgnoreCase("yes"))
			{
		
				q="delete from dalemp where empid='"+ eid +"'";
				stmt.executeUpdate(q);
				System.out.println("Employee Id - " + eid + " record got deleted from DB...");
			}
		}
		else
		{
			System.out.println("Record Not Found...");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
	
	


