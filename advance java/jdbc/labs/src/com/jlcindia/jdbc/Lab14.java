package com.jlcindia.jdbc;
import java.sql.*;
import java.util.*;
import com.jlcindia.jdbc.util.*;
public class Lab14 {
	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cs=null;
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Sid");
			int sid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Name");
			String nm=sc.nextLine();
			System.out.println("Enter fee");
			float fee=sc.nextFloat();
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			cs=con.prepareCall("Call insertStudentinfo");
			cs.setInt(1,sid);
			cs.setString(2,nm);
			cs.setFloat(3,fee);
			cs.execute();
				System.out.println("Called Successfully");
			    }catch(Exception e){
		    	System.out.println("Error in calling procedure");
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(cs,con);
		}
	}
}