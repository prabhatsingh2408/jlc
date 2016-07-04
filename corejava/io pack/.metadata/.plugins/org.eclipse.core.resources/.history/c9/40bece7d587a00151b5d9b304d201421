import java.io.*;

public class Lab877 {
public static void main(String[] args) {
		File drives[]=File.listRoots();
		for(File f:drives){
		long total=f.getTotalSpace();
		total=total/1024/1024/1024;
		long usable=f.getUsableSpace();
		usable=usable/1024/1024/1024;
		long free=f.getFreeSpace();
		free=free/1024/1004/1024;
		System.out.println(f+"\t"+total+"G.B\t"+usable+"G.B\t"+free+"GB");
		}
		}
		}
