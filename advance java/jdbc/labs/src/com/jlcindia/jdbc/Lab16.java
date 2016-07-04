package com.jlcindia.jdbc;
import java.sql.*;
import java.util.*;
import oracle.jdbc.OracleTypes;
import com.jlcindia.jdbc.util.*;
public class Lab16 {
	public static void main(String[] args) {
		Connection con=null;
		CallableStatement cs=null;
		ResultSet rs=null;
		try{
			con=JDBCUtil.getOracleConnection();
			cs=con.prepareCall("Call getAllStudents(?)");
			cs.execute();
			rs=(ResultSet)cs.getObject(1);
			if(rs.next()){
				do{
					int id=rs.getInt(1);
					String nm=rs.getString(2);
					float fee=rs.getFloat(3);
					System.out.println(id+"\t"+nm+"\t"+fee);
				}while(rs.next());
			}else{
				System.out.println("No Record Found");
			}
			}catch(SQLException e){
		    	System.out.println("Error in calling procedure");
			e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(cs,con);
		}
	}
}