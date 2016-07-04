package com.jlcindia.jdbc;
import java.sql.*;
import java.util.*;
import com.jlcindia.jdbc.util.*;
public class Lab15 {
	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cs=null;
		try{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Sid");
			int sid=sc.nextInt();
			System.out.println("Enter Installment");
			float ins=sc.nextFloat();
			//con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			cs=con.prepareCall("Call updateinfo(?,?,?)");
			cs.setInt(1,sid);
			cs.setFloat(3,ins);
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.FLOAT);
			cs.execute();
			String nm=cs.getString(2);
			float fee=cs.getFloat(3);
			System.out.println(nm+"\t"+fee);
				System.out.println("Called Successfully");
			    }catch(Exception e){
		    	System.out.println("Error in calling procedure");
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(cs,con);
		}
	}
}