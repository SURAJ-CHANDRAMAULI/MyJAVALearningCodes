package simple;

import java.util.Scanner;

public class RectSq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
		    int l=s.nextInt();
		    int b = s.nextInt();
		    if(l==b)
		    System.out.println(1);
		    int ans =0;
for(int i=1;i<=l*b/2;i++)
{
    
		    if((l*b)%(i*i)==0)
		    {
		        ans=(l*b)/(i*i);
		        
		    }
}
System.out.println(ans);
		}
	}

}
