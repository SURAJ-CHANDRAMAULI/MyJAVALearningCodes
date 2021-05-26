package array;

import java.util.Scanner;

public class Kitchen {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			int[] arr1 = new int[n];
			int[] arr2 = new int[n];
			for(int i=0;i<n;i++)
			{
				arr1[i]=s.nextInt();
				arr2[i]=s.nextInt();
			}
			int count=0;
			if(arr1[0]>=arr2[0])
				count++;
			
		
			for(int i=0;i<n-1;i++)
			{
				if(arr1[i+1]-arr1[i]>=arr2[i+1])
					count++;
			}
			
			System.out.println(count);
		}

	}

}
