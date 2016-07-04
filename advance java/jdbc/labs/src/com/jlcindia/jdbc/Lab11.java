package com.jlcindia.jdbc;
import java.sql.*;
import java.util.Scanner;
import com.jlcindia.jdbc.util.*;
public class Lab11 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		try{
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter sid");
			int sid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			String sn=sc.nextLine();
			System.out.println("Enter Email");
			String em=sc.nextLine();
			System.out.println("Enter Phone");
			long ph=sc.nextLong();
			String qry=String.format("insert into stud values(?,?,?,?)");
			System.out.println(qry);
			ps=con.prepareStatement(qry);
			ps.setInt(1,sid);
			ps.setString(2,sn);
			ps.setString(3, em);
			ps.setLong(4, ph);
			int x=ps.executeUpdate();
			if(x==1)
				System.out.println("Record inserted successfully");
			else
				System.out.println("No record found");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
             JDBCUtil.cleanup(ps,con);
			}
		}
	}