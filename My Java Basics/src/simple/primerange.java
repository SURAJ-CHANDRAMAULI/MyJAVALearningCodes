package simple;
import java.util.Scanner;
public class primerange {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	for(i=2;i<=n;i++)
	{
		for(j=2;j<=i/2,j++)
		{
			if(1%j==0)
				break;
			else
				System.out.println(i);
		}
	}

}
