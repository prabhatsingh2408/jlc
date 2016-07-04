package com.jlcindia.jdbc;
import java.sql.*;
import com.jlcindia.jdbc.util.*;
public class Lab21 {
	public static void main(String[] args) throws Exception{
		Connection con=JDBCUtil.getOracleConnection();
			con=JDBCUtil.getMySQLConnection();
			DatabaseMetaData md=con.getMetaData();
			System.out.println("URL :" + md.getURL());
			System.out.println("USER :" + md.getUserName());
			System.out.println("Major Version :" + md.getDatabaseMajorVersion());
			System.out.println("MINOR Version :" + md.getDatabaseMinorVersion());
			System.out.println("Full join :"+ md.supportsFullOuterJoins());
			System.out.println("Product Name :"+md.getDatabaseProductName());
			System.out.println("Multiple RS :"+md.supportsMultipleOpenResults());
			System.out.println("DB :"+md.getDatabaseProductName());
	}
}