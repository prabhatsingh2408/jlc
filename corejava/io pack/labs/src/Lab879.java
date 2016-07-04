import java.io.*;

public class Lab879 {
public static void main(String[] args) {
		File file=new File("D :\\jlc");
		File javafiles[]=file.listFiles((FilenameFilter) new ExtFilter(".java"));
		System.out.println("***Java Files***");
		if(javafiles!=null)
		for(File f:javafiles)
		System.out.println(f);
		else
			System.out.println("NO Java File Found");
		}
		}
		class ExtFilter{
			String ext;
			public ExtFilter(String ext){
				this.ext=ext;
			}
			public boolean accept(File f){
				return f.getName().endsWith(ext);
			}
		}