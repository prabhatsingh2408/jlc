package com.jlcindia.jdbc;
import java.sql.*;
public class Lab3 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "14october");
			String sql="select * from stud";
			st=con.createStatement();
			rs=st.executeQuery(sql);
			while(rs.next()){
				int sid=rs.getInt(1);
				String sn = rs.getString(2);
				String nm = rs.getString(3);
				long ph = rs.getLong(4);
				System.out.println(sid+"\t"+sn+"\t"+ph+"\t"+nm);

			}
			int x=st.executeUpdate(sql);
			if(x==1){
				System.out.println("Record inserted");
			}else{
				System.out.println("Record not inserted");
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