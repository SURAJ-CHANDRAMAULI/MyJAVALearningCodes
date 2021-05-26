package javafunctions;
import java.util.Scanner;
public class JulylongMissingAPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int[] arr = new int[8*n-2];
			for(int i=0;i<8*n-2;i++)
				arr[i]=s.nextInt();
			int x=0,y=0;
			int c=0;
			//int [] count = new int[8*n-2];
			for(int i=0;i<8*n-8;i++)
			{
				for(int j=i;j<8*n-2;j++)
				{
					if(arr[i]==arr[j])
						c++;
				}
			//	count[i]=c;
				if(c%2!=0)
				{
					x=arr[i];
				}
					
			
			}
			System.out.print(x+" "+y);	
		}

	}

}
