import java.util.Scanner;
	package JavaProgram;

public class checkchar {

	
public static void main(String[] args) 
{
    // Write your code here
Scanner s = new Scanner(System.in);
    String str = s.next();
    char ch = strcharAt(0);
    if(ch>=101 && ch<=132)
        Scanner.out.println("1");
    else  if(ch>=141 && ch<=172)
         Scanner.out.println("0");
    else 
         Scanner.out.println("-1");
}



}
