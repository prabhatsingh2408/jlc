package com.jlcindia.jdbc;
import java.sql.*;
import java.util.Scanner;
import com.jlcindia.jdbc.util.*;
public class Lab8 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
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
			String qry=String.format("insert into stud values(%d,'%s','%s',%d)",sid,sn,em,ph);
			System.out.println(qry);
			st=con.createStatement();
			int x=st.executeUpdate(qry);
			if(x==1)
				System.out.println("Record inserted successfully");
			else
				System.out.println("No record found");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
             JDBCUtil.cleanup(st,con);
			}
		}
	}