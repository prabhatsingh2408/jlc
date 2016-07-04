package com.jlcindia.jdbc;
import java.sql.*;
import com.jlcindia.jdbc.util.*;
public class Lab6 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
			//con=JDBCUtil.getOracleConnection()
			con=JDBCUtil.getMySQLConnection();
			String qry="insert into stud values(55,'Srini','srini@jlc',65711998,153, '19780922')";
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
			JDBCUtil.cleanup(st, con);
			}
		}
	}