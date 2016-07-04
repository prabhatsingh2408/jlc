package com.jlcindia.jdbc;
import java.sql.*;
import java.util.Scanner;
import com.jlcindia.jdbc.util.*;
public class Lab18 {
	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement ps=null;
		try{
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			String sql="insert into stud (sid,sname) values (?,?)";
			ps=con.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			char choice='Y';
			do{
				System.out.println("Enter name");
				String nm=sc.nextLine();
				System.out.println("Enter Id");
				int id=sc.nextInt();
				ps.setInt(1,id);
				ps.setString(2,nm);
				ps.addBatch();
				System.out.println("do you want to add more");
				sc.nextLine();
				choice=sc.nextLine().charAt(0);
			}while(choice=='Y');
			int res[]=ps.executeBatch();
			for(int i=0;i<res.length;i++){
				System.out.println("Res :"+res[i]);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(ps, con);
		}
	}
}