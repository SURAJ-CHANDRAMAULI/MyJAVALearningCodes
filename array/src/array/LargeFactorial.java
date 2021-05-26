package array;
import java.util.Scanner;
import java.math.BigInteger;
public class LargeFactorial {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		 BigInteger f = BigInteger.ONE;
		// TODO Auto-generated method stub
		for(int i=n;i>0;i--)
		{
			f=f.multiply(BigInteger.valueOf(i));
        }
		System.out.print(f);
			

	}

}
