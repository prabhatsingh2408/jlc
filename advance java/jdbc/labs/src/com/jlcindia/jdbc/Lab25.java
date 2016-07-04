package com.jlcindia.jdbc;

import java.io.*;
import javax.sql.RowSet;
import com.sun.rowset.CachedRowSetImpl;

public class Lab25 {
	public static void main(String[] args) {
	try{
		Class.forName("com.mysql.jdbc.Driver");
		RowSet rs=new CachedRowSetImpl();
		rs.setUrl("jdbc:mysql://localhost:3306/jlc");
		rs.setUsername("root");
		rs.setPassword("14october");
		rs.setCommand("select sid,sname,email,phone from stud");
		rs.execute();
		while(rs.next()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
			}
		rs.absolute(7);
		rs.updateString(2,"ram");
		rs.updateString(3,"ram@gmail.com");
		rs.updateLong(4,684235719);
		rs.updateRow();
		System.out.println("Updated");
		rs.beforeFirst();
		System.out.println("Serializing CachedRowset");
		FileOutputStream fos=new FileOutputStream("D:\\rowset.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(rs);
		System.out.println("serialized");
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}