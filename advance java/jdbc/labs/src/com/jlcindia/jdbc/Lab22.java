package com.jlcindia.jdbc;
import java.sql.*;
import com.jlcindia.jdbc.util.*;
public class Lab22 {
	public static void main(String[] args) throws Exception{
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getMySQLConnection();
			st=con.createStatement();
			rs=st.executeQuery("select * from stud");
			ResultSetMetaData md=rs.getMetaData();
			int cols=md.getColumnCount();
			System.out.println("Colums :"+cols);
			for(int i=1;i<=cols;i++){
				String colnm=md.getColumnName(i);
				String clsnm=md.getColumnClassName(i);
				String tabnm=md.getTableName(i);
				String tnm=md.getColumnTypeName(i);
				int size=md.getPrecision(i);
				System.out.println(colnm+"\t"+clsnm+"\t"+tabnm+"\t"+tnm+"\t"+size);
			}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(rs, st, con);
	}
	}
}