import java.io.*;

public class Lab878 {
public static void main(String[] args) {
		File file=new File("D :\\jlc\\corejava");
		File files[]=file.listFiles();
		for(File f:files){
		System.out.println(f+"-> is file :"+f.isFile()+"-> is Dir :"+f.isDirectory());
		}
		}
		}
