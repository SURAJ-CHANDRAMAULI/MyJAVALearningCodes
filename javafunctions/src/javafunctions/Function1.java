package javafunctions;

import java.util.Scanner;

public class Function1 {

	
		// TODO Auto-generated method stub
		public static int fact(int n) {
			int res=1;
			for(int i=1;i<=n;i++)
			{
				res=res*i;
			}
			return res;
		}
		public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int num=fact(n);
		int den1=fact(r);
		int den2=fact(n-r);
		int ans=num/(den1*den2);
		System.out.print(ans);

	}

}
