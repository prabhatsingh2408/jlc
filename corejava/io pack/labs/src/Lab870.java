import java.io.*;

public class Lab870 {
public static void main(String[] args)throws Exception {
		try(FileInputStream fis=new FileInputStream("D:\\jlc\\abc.txt");
				BufferedInputStream bis=new BufferedInputStream(fis);){
		while(true){
			int asc=bis.read();
			if(asc==-1)break;
			char ch=(char)asc;
			System.out.print(ch);
		}
	}catch(Exception e){
	e.printStackTrace();
	}
}
}