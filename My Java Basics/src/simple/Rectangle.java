package simple;
import java.util.Arrays;
import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
int t = s.nextInt();
while(t-->0)
{
int n = s.nextInt();
int c=0;
for(int i = 0; i<n;i++)
{
	int type = s.nextInt();
c=c^type;

System.out.println(c+" "+type);
}
}
	
}
	}

