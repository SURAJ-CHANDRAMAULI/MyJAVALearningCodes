package simple;

import java.util.Scanner;

public class Julylong {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
			arr[i]= s.nextInt();
		
		int count =0;
			for(int i=0;i<n-1;i++) {
		while(arr[i]!=arr[i+1])
		{
		if(arr[i+1]>arr[i])
			++arr[i];
		
		else
			if(arr[i]>arr[i+1])
				++arr[i+1];
		++count;
		}
		
			}
			System.out.println(count-1);
		}
		

	}

}
