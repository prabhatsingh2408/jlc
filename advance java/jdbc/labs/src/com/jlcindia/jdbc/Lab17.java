package com.jlcindia.jdbc;
import java.sql.*;
import com.jlcindia.jdbc.util.*;
public class Lab17 {
	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
			con=JDBCUtil.getMySQLConnection();
			st=con.createStatement();
			String s1="insert into stud values(99,'sn','sn@jlc.com',951847623,8547,10101990)";
			st.addBatch(s1);
			String s2="insert into stud values(97,'sd','sd@jlc.com',935447623,6589,11111988)";
			st.addBatch(s2);
			String s3="insert into stud values(96,'dande','dande@jlc.com',951875243,1258,01011999)";
			st.addBatch(s3);
			String s4="insert into stud values(94,'vas','vas@jlc.com',955389923,9874,08051985)";
			st.addBatch(s4);
			String s5="update stud set phone=357896214,email=snd@gmail.com";
			st.addBatch(s5);
			String s6="delete from stud where sid=88";
			st.addBatch(s6);
			int x[]=st.executeBatch();
			for(int i=0;i<x.length;i++)
				System.out.println(x[i]);
			}catch(Exception e){
		    	e.printStackTrace();
		}finally{
			JDBCUtil.cleanup(st,con);
		}
	}
}