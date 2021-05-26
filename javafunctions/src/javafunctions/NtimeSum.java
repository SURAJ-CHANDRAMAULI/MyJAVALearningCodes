package javafunctions;
import java.util.Scanner;
public class NtimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t>0)
		{
			int time = s.nextInt();
			int n = s.nextInt();
			int sum=0;
			for(int i =1; i<=n;i++)
			{
				sum = sum + i;
				if(i==n) {
					n=sum;
					time--;
				}
				if(time==0)
					break;
			}
			t--;
			System.out.println(sum);
		}

	}

}
