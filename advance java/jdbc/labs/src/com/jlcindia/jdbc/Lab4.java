package com.jlcindia.jdbc;
import java.sql.*;
public class Lab4 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jlc", "root", "14october");
			String qry="insert into stud values(78,'Srinivas','sri@jlc',65759998,153, '19881010')";
			st=con.createStatement();
				int x=st.executeUpdate(qry);
				if(x==1){
				System.out.println("Record inserted");
			}else{
				System.out.println("Record not inserted");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(st!=null)st.close();
				if(con!=null)con.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}