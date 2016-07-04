package com.jlcindia.jdbc;
import java.sql.*;
public class Lab2 {
public static void main(String[] args) {
	Connection con=null;
	Statement st=null;
	try{
		//Step 1:Load the driver class
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//Step 2:Establish the connection
		con=DriverManager.getConnection("jdbc:odbc:JLCMYDSN", "root", "14october");
		//Step 3:Prepare the Sql Statement.
		String sql="insert into stud values(88,'Vas','vas@jlc',65799998,123, '19920606')";
		//Step 4:Create the JDBC statement
		st=con.createStatement();
		//Step 5:Submit the SQL statement to Database using JDBC statement.
		int x=st.executeUpdate(sql);
		//Step 6:Process the result.
		if(x==1){
			System.out.println("Record inserted");
		}else{
			System.out.println("Record not inserted");
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		//Step 7:Close all resources
		try{
			if(st!=null)st.close();
			if(con!=null)con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
}