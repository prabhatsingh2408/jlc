import java.io.*;

public class Lab874 {
public static void main(String[] args) {
		try(FileReader fr=new FileReader("D:\\jlc\\abc.txt");
				BufferedReader br=new BufferedReader(fr);
				FileWriter fw=new FileWriter("D:\\jlc\\xyz.txt");
				BufferedWriter bwr=new BufferedWriter(fw);){
		while(true){
			String st=br.readLine();
			if(st==null)break;
			bwr.write(st);
			bwr.newLine();
		}
		bwr.close();
		System.out.println("Writing Completed");
	}catch(Exception e){
	e.printStackTrace();
	}
}
}
