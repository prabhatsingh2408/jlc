package p651;

public class L651 {
	public static void main(String[] args) {
		String str="JLCINDIA";
		char cArr[]=new char[10];
		byte bArr[]=new byte[10];
		cArr[0]='S';
		cArr[1]='R';
		cArr[2]='I';
		str.getChars(3,7,cArr,4);
		str.getBytes(3,7,bArr,4);
		System.out.println("\n****char array****");
		for(int i=0;i<cArr.length;i++){
			char ch = cArr[i];
			System.out.println(i+"\t"+ch);
		}
			System.out.println("\n****byte array****");
			for(int i=0;i<bArr.length;i++){
				byte b = bArr[i];
				System.out.println(i+"\t"+b+"\t"+(char)b);
		}
	}
}
