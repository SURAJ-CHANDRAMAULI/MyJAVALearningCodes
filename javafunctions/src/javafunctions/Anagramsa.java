package javafunctions;
import java.util.Scanner;
public class Anagramsa {
	  static boolean isAnagram(String a, String b) {
	        // Complete the function
		  int count=0;
		  a=a.toLowerCase();
		  b=b.toLowerCase();
		     if(a.length()!=b.length())
	        return false;
	        else{
	             for(int i =0;i<a.length()-1;i++){
	            for(int j=0;j<a.length();j++){
	if(a.charAt(i)!=b.charAt(j))
	            continue;
	            else {
	            count++;
	            break;
	            }
	        }
	    }
	  }
	if(count!=a.length())
	return false;
	else
	return true;

	  }

	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	  
	    }

}
