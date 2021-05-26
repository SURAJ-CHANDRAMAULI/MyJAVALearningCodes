package try1;

import java.util.Scanner;

public class Try2 {
	
	public static void main(String args[]) {

		
		 Scanner s = new Scanner(System.in);
		    int t = s.nextInt();
		    while(t-->0){
		    	
		    	String str = s.next();
		    	int half=str.length()/2;
		    	int end = half-1;
		    			
		    	if(str.length()%2!=0)
		    		half=half+1;
		    int i=0;
		    int flag=half;
		    	while(i!=str.length())
		    	{
		    		
		    		if(str.charAt(i)==str.charAt(half))
		    		{
		    			i++;
		    			half=flag;	
		    		}
		    		else {
		    			half++;
		    			
		    		}
		    		
		    		if(i>=end) {
		    			System.out.println("Yes");
		    		break;
		    		}
		    		else if(half==str.length());
		    		{
		    			System.out.println("No");
		    			break;
		    		}
		    	
		    	}
		    		
		    	
		    	
		    	
		    	
		    }
	}

}
