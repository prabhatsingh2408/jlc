package com.jlcindia.jdbc;
import java.sql.*;
public class Lab5 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jlc", "root", "14october");
			String qry="select * from stud";
			st=con.createStatement();
			rs=st.executeQuery(qry);
				if(rs.next()){
					do{
						int sid=rs.getInt(1);
						String sn=rs.getString(2);
						String em=rs.getString(3);
						long ph=rs.getLong(4);
						System.out.println(sid+"\t"+sn+"\t"+em+"\t"+ph);
					}while(rs.next());
					}else{
				System.out.println("No record found");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(rs!=null)rs.close();
				if(st!=null)st.close();
				if(con!=null)con.close();
				}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}