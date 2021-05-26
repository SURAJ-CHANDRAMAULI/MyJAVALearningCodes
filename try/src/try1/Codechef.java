package try1;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
//     static int myXOR(int x, int y)
// {
     
//     // Initialize result
//     int res = 0; 
 
//     // Assuming 32-bit Integer 
//     for(int i = 31; i >= 0; i--)                     
//     {
         
//         // Find current bits in x and y
//         int b1 = ((x & (1 << i)) == 0 ) ? 0 : 1;  
//         int b2 = ((y & (1 << i)) == 0 ) ? 0 : 1;  
 
//         // If both are 1 then 0 else xor is same as OR
//         int xoredBit = ((b1 & b2) != 0) ? 0 : (b1 | b2);          
 
//         // Update result
//         res <<= 1;
//         res |= xoredBit;
//     }
//     return res;
// }

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		
		while(t-->0){
		    
		    int c = s.nextInt();
		    int d=0;
		    for(int i=0;i<=c/2;i++)
		    {
		        if(Math.pow(2,i)>c){
		            d=i;
		            System.out.println("d wala loop");
		            break;
		        }
		       
		    }
		    int ans=0;
		   
		    for(int i=1;i<=c;i++){
		        
		        for(int j=1;j<=c;j++){
		            
		            if((i^j)==c)
		            {
		                ans = i*j;
		                System.out.println("xor wa;a loop");
		               
		          
		            }
		          
		        }
		    }
		    System.out.println("sab loop ke bahar");
		    
		    System.out.println(ans);
		    
		}
	}
}

