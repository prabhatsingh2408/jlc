package com.jlcindia.jdbc;
import java.sql.*;
public class Lab4A {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "14october");
			String qry="insert into stud values(78,'Srinivas','sri@jlc',65759998,153, '10101988')";
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