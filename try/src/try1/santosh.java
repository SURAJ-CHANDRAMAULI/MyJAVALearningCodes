package try1;

import java.util.Scanner;

public class santosh {
	
//	static boolean isprime(int a) {
//		for(int i=2;i<=a/2;i++)
//		{
//			if(a%i==0)
//				return false;
//		}
//		return true;
//	}
	   static boolean isPrime(int n) 
	    { 
	      
	        if (n <= 1) 
	            return false; 
	  
	        
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	        jnu 
	  
	        return true; 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s = new Scanner(System.in);
     int l=s.nextInt();
     int r = s.nextInt();
  int count =0;
     for(int i=l;i<=r;i++)
     {
    	 int a = Integer.bitCount(i);
    	 System.out.println(Integer.toBinaryString(a));
    			if(isPrime(a))
    			 count++;
     }
     System.out.println(count);
	}

}
