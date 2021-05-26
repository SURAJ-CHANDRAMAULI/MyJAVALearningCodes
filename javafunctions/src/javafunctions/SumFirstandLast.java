package javafunctions;
import java.util.Scanner;
public class SumFirstandLast {

	public static int fact(int input) {
	int n=input;
while(n>10)
{
n=n/10;
}
int sum=input%10+n;
return sum;
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
