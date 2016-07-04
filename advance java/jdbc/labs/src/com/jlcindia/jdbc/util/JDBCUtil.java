package com.jlcindia.jdbc.util;

import java.sql.*;

public class JDBCUtil {
static{
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}catch(ClassNotFoundException ex){
		System.out.println(ex);
	}
}
public static Connection getOracleConnection()throws SQLException{
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	Connection con=DriverManager.getConnection(url,"system","14october");
	return con;
}
public static Connection getMySQLConnection()throws SQLException{
	String url="jdbc:mysql://localhost:3306/jlc";
	Connection con=DriverManager.getConnection(url,"root","14october");
	return con;
}
public static void cleanup(Statement st,Connection con){
	try{
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();
	}catch(Exception e){
		System.out.println(e);
	}
}
public static void cleanup(ResultSet rs,Statement st,Connection con){
	try{
		if(rs!=null)
			rs.close();
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();
	}catch(Exception e){
		System.out.println(e);
	}
}
}