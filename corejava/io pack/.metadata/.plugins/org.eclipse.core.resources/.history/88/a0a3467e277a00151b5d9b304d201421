import java.io.*;

public class Lab873 {
public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("D:\\jlc\\abc.txt");
				FileOutputStream fos=new FileOutputStream("D:\\jlc\\xyz.txt");){
		while(true){
			int asc=fis.read();
			if(asc==-1)break;
			fos.write(asc);
		}
		System.out.println("Writing Completed");
	}catch(Exception e){
	e.printStackTrace();
	}
}
}
