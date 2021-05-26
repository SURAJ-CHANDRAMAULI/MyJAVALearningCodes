package strings;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      Scanner s = new Scanner(System.in);
      String Str1 = s.next();
      String Str2 = s.next();
      System.out.print(Str1.substring(0,4).compareTo(Str2.substring(0,4))+" "+Str1+" "+Str2);
	}

}
