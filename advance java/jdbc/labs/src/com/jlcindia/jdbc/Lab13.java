package com.jlcindia.jdbc;
import java.sql.*;
import java.util.Scanner;
import com.jlcindia.jdbc.util.*;
public class Lab13 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Query");
			String qry=sc.nextLine();
			ps=con.prepareStatement(qry);
			boolean b1=ps.execute();
			if(b1){
				rs=ps.getResultSet();
				if(rs.next()){
					do{
						int sid=rs.getInt(1);
						String sn=rs.getString(2);
						String em=rs.getString(3);
						long ph=rs.getLong(4);
						System.out.println(sid+"\t"+sn+"\t"+em+"\t"+ph);
					}while(rs.next());
				}
			}else{
				int x=ps.getUpdateCount();
				System.out.println("Result :"+x);
			}
		    }catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(rs,ps, con);
		}
	}
}