package javafunctions;

import java.util.Scanner;

public class isprime {
	public static boolean checkp(int n) {
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
			return true;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	
		for(int i=2;i<=n;i++)
		{
			if(checkp(i))
			{
				System.out.println(i);
			}
		}

	}

}
