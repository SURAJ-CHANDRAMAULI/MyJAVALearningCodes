package simple;
import java.util.Scanner;
public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner s = new Scanner(System.in);
			int t = s.nextInt();
		while(t>0)
		{
		    int n = s.nextInt();
		    int p=s.nextInt();
		    double total=(n*p);
		    		if(n>1000)
		    		{
		    		    total =(float) (total*0.9);
		    		    	System.out.printf("%.6f\n",total);
		  
		    		}
		    		else {
		    		System.out.printf("%.6f\n",total);
		    		}
		    		t--;
		    		
		    	}
		    		
	
		    		

	}

}
