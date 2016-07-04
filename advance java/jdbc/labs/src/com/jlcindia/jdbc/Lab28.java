package com.jlcindia.jdbc;
import java.sql.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import com.jlcindia.jdbc.util.*;
public class Lab28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int sid=sc.nextInt();
		System.out.println("Enter Date");
		int d=sc.nextInt();
		System.out.println("Enter Month");
		int m=sc.nextInt();
		System.out.println("Enter Year");
		int y=sc.nextInt();
		Date dt=new Date(y-1900,m-1,d);
		Connection con=null;
		Statement st=null;		
		
		try{
			con=JDBCUtil.getMySQLConnection();
			DatabaseMetaData md=con.getMetaData();
			String db=md.getDatabaseProductName();
			String dop="";
			System.out.println(db);
			if(db.equals("Oracle")){
				SimpleDateFormat f=new SimpleDateFormat("dd-MM-yyyy");
				dop=f.format(dt);
			}else if(db.equals("MySQL")){
				SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
				dop=f.format(dt);
			}
			st=con.createStatement();
			String sql=String.format("insert into datetest values(%d,'%s')",sid,dop);
			st.execute(sql);
			System.out.println("Inserted");
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(st, con);
	}
	}
}