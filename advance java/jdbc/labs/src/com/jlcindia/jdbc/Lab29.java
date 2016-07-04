package com.jlcindia.jdbc;
import java.sql.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import com.jlcindia.jdbc.util.*;
public class Lab29 {
	public static void main(String[] args){
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
		PreparedStatement ps=null;		
		ResultSet rs=null;
		try{
			con=JDBCUtil.getOracleConnection();
			ps=con.prepareStatement("insert into datetest values (?,?)");
			ps.setInt(1,sid);
			ps.setDate(2,dt);
			ps.executeUpdate();
			System.out.println("Inserted");
			JDBCUtil.cleanup(ps, null);
			ps=con.prepareStatement("select * from datetest");
			rs=ps.executeQuery();
			while(rs.next()){
				int id=rs.getInt(1);
				Date dop=rs.getDate(2);
				SimpleDateFormat f= new SimpleDateFormat("dd-MMM-yyyy");
				String d1=f.format(dop);
				System.out.println(id+"\t"+d1);
			}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		JDBCUtil.cleanup(ps, con);
	}
	}
}