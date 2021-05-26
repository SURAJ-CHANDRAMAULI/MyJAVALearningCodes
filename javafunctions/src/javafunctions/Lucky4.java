package javafunctions;
import java.util.Scanner;

public class Lucky4 {
	public static int fact(int input) {
	int c=0;
while(input>0)
{
    int n=input%10;
    input=input/10;
    if(n==4)
    	c++;
}

return c;
	}

public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int t = s.nextInt();
	int [] arr = new int[t];
	
	for(int i=0;i<t;i++)
	arr[i]=s.nextInt();
	
	for(int i=0;i<t;i++){
	int input = arr[i];
	System.out.println(fact(input));
	}

  }
}
