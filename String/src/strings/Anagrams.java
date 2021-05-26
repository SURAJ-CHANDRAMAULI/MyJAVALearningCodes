package strings;

import java.util.Scanner;
public class Anagrams {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String b = s.nextLine();
		String a = s.nextLine();
		a=a.toLowerCase();
		b=b.toLowerCase();
		
		int count =0;
		 if(a.length()!=b.length())
	     System.out.print("Not Anagrams");
		 else
		 {
		 for(int i=0;i<a.length();i++){
			for(int j=0;j<b.length();j++){
			 if(a.charAt(i)==b.charAt(j)) {
		   count++;
		   break;
			 }
		      else
			   continue;
			 }
	       }			
		 }
	 if(count==a.length()-1)
		 System.out.print("Anagrams");
	           else
	        	   System.out.print("Not Anagrams");
   }
}
	

	


