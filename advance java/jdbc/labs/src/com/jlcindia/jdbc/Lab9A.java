package com.jlcindia.jdbc;
import java.sql.*;
import java.util.Scanner;
import com.jlcindia.jdbc.util.*;
public class Lab9A {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getOracleConnection();
			//con=JDBCUtil.getMySQLConnection();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter sid");
			int sid=sc.nextInt();
			String qry=String.format("select * from stud where sid=%d",sid);
			st=con.createStatement();
			rs=st.executeQuery(qry);
				if(rs.next()){
						int id=rs.getInt(1);
						String sn=rs.getString(2);
						String em=rs.getString(3);
						long ph=rs.getLong(4);
						System.out.println(sid+"\t"+sn+"\t"+em+"\t"+ph);
					}else{
				System.out.println("Sorry ,Student record not found");
			}
		    }catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(rs,st, con);
		}
	}
}