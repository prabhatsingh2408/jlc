package com.jlcindia.jdbc;
import java.io.*;

import javax.sql.RowSet;
import javax.sql.rowset.*;
public class Lab26 {
	public static void main(String[] args){
		try{
			System.out.println("**DeSerializing cashedRowSet**");
		    FileInputStream fis=new FileInputStream("D:\\rowset.txt");
		    ObjectInputStream ois=new ObjectInputStream(fis);
		    RowSet rs=(RowSet)ois.readObject();
		    System.out.println("Deserialized");
		    while(rs.next()){
		    	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getLong(4));
		    }
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}