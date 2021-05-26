package try1;

import java.util.Scanner;
import java.util.Arrays;
public class Try3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner s = new Scanner(System.in);
     int t = s.nextInt();
     while(t-->0) {
       String str = s.next();
       int half = str.length()/2;
       int end=half-1;
       if(str.length()%2!=0)https://open.spotify.com/track/0bMbDctzMmTyK2j74j3nF3
    	half=half+1;
       
       String str1 = str.substring(half);
       
       String str2 = str.substring(0,end);
       int i =0;
       int j=0;
   while(i!=str1.length()) {
	   if(i==str1.length())
		   System.out.println("Yes");
	   else
		   System.out.println("No");
	   
	   if(str1.charAt(i)==str2.charAt(j)) {
		   i++;
	   j=0;
	   }
	   else {
	   j++;
   }

   }
       
       
       
	}
	}
}
