package javafunctions;
import java.util.Scanner;
public class Sqrt {
	 public static void solve(int n){
	        int ans=1;
	        
	        for(int i=1;i<=n/2;i++){
	            if(i*i<=n){
	                ans=i;
	                
	            }
	            
	        }
	       System.out.println(ans); 
	        
	    }
	    
	    
	    
		public static void main (String[] args) throws java.lang.Exception
		{
			// your code goes here
			Scanner scn=new Scanner(System.in);
			int t=scn.nextInt();

			while(t--!=0){
			    int n=scn.nextInt();
			    solve(n);
			    
			}
		}

}
