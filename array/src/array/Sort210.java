package array;

import java.util.Scanner;

public class Sort210 {
	public static int[] input() {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
		   arr[i]=sc.nextInt();
		}
		sc.close();
		return arr;
	}
	public static void print(int[] arr)
	{
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arr = input();
		int zero=0,one=0,two=0;
		for(int i=0;i<Arr.length;i++)
		{
			if(Arr[i]==0)
				zero++;
			else if(Arr[i]==1)
				one++;
			else
				two++;
		}
		for(int j=0;j<Arr.length;j++)
		{
			if(j<zero)
				Arr[j]=0;
			else if(j>=zero && j<zero+one)
				Arr[j]=1;
			else
				Arr[j]=2;
		}
		print(Arr);

	}

}
