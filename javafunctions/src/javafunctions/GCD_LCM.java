package javafunctions;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;

public class GCD_LCM {
	 private static long GCD(long n1, long n2) {
		 if(n2==0)
		 return n1;
		 return GCD(n2,n1%n2);
		 }
		 	public static void main(String[] args)
		 	{
		 		Scanner s = new Scanner(System.in);
		 		int t = s.nextInt();
		 		while(t>0){
		 			long n1=s.nextLong();
		 			long n2=s.nextLong();
		 			System.out.println(GCD(n1,n2)+" "+n1*n2/GCD(n1,n2));
		 			t--;
		 		}
		 	}
}

