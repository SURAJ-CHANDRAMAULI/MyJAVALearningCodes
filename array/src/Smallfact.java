import java.math.BigInteger;
import java.util.Scanner;
public class Smallfact {

	public static BigInteger fact(int input) {
		BigInteger f = BigInteger.ONE;
		
		for(int i=1;i<=input;i++)
		f=f.multiply(BigInteger.valueOf(i));
        return f;
		}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int [] arr = new int[t];
		
		for(int i=0;i<t;i++)
		arr[i]=s.nextInt();
		
		for(int i=0;i<t;i++){
		int input = arr[i];
		System.out.println(fact(input));
		}
	}
}
