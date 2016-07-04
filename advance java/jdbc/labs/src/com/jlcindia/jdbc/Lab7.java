package com.jlcindia.jdbc;
import java.sql.*;
import com.jlcindia.jdbc.util.*;
public class Lab7 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
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