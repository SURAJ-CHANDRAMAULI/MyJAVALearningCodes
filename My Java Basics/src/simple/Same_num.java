package simple;
import java.util.*;
public class Same_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		while(t-->0)
		{
		    int n = s.nextInt();
		    int one=0;
		    int zero=0;
		    int digit=0;
		    while(n!=0)
		    {
		        digit++;
		        int d=0;
		        d=n%10;
		        n=n/10;
		        if(d==1)
		        one++;
		        else
		        zero++;
		    }
		    if((zero==1 && one == digit-zero) || (one==1 && zero == digit-one))
		    System.out.println("Yes");
		    else
		    System.out.println("No");
		    
		}
	}

}
