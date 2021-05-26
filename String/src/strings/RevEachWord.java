package strings;
import java.util.Scanner;

public class RevEachWord {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String Str="";
		int index=0;
		for(int j=0;j<str.length();j++)
		   {
		     if(str.charAt(j)==' ')
		     {
	            
		    	 for(int i=j-1;i>=index;i--)
		    	 {
		    		Str=Str+str.charAt(j); 
		    	 }
		    	 
		    	 Str=Str+" ";
		    	 index=j+1;
		    }
		    
		}
		for(int i=0;i<Str.length();i++)
		System.out.print(Str.charAt(i));

	}
}


