package strings;

import java.util.Scanner;

public class Revword {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String Str = "";
		
		for(int i =str.length()-1;i>=0;i--) 
		{
			Str=Str+str.charAt(i);
		}
		
		System.out.print(Str);		

	}

}
