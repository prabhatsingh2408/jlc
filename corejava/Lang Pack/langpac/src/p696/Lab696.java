package p696;

public class Lab696 {
public static void main(String[] args) throws Exception{
	Runtime rt = Runtime.getRuntime();
	Process p = rt.exec("mspaint");
	// Open welcome.txt FILE in NOTEPAD
	String cmds[] = {"notepad", "D:\\Welcome.txt"};
	Process p2 = rt.exec(cmds);
	String cmds1[] = {"\" C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe","http://www.jlcindia.com"};
			Process p3 = rt.exec(cmds1);
	System.out.println("Press ENTER to close All Process");
	System.out.println("MAIN Completed");
}
}
