package simple;

import java.util.Scanner;

public class GitTestiing {
   
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for(int i=0;i<str.length()-2;i++) {
			if(i==0)
				System.out.print(str.charAt(i));
			if(str.charAt(i)==' ') 
					System.out.print(str.charAt(i+1));
		}
    }
}
