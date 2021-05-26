package JavaProgram;

import java.util.Scanner;

public class evenodd {
	public static void main(String[] args)
	{
	
	Scanner s = new Scanner(System.in);
	int a = s.nextInt();
	if(a%2==0)
		System.out.println("its even");
	else
		System.out.println("its odd");
}
}