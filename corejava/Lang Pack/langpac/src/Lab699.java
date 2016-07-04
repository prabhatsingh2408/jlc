import java.math.BigInteger;
public class Lab699 {
public static void main(String[] args) {
	BigInteger bint1=new BigInteger("9");
	System.out.println(bint1.bitCount());
	//NUMBER OF 1 BIT
	System.out.println(bint1.bitLength());
	//NUMBER OF TOTAL BITS ALLOCATED
	long val=9223372036854775807L;
	long val2=100;
	long res = val + val2;
	System.out.println(res);
}
}
