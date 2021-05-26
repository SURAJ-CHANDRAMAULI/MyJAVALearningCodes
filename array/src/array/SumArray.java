package array;

import java.util.Scanner;

public class SumArray 
{
	public static int[] input() 
	
	{
		Scanner s = new Scanner(System.in);
				int size=s.nextInt();
				int[] arr = new int[size];
				for(int i=0;i<size;i++)
				{
					arr[i]=s.nextInt();
				}
		return arr;
	}
	public static void selectsort(int[] unsorted)
	{
		for(int i=0;i<unsorted.length-1;i++) 
		{
			int min=unsorted[i];
			int minindex=i;
			for(int j=i+1;j<unsorted.length;j++)
			{
				if(unsorted[j]<unsorted[i])
				{
				minindex=j;
				min=unsorted[j];
				}
			}
			
			if(minindex!=i)
			{
			unsorted[minindex]=unsorted[i];
			unsorted[i]=min;
			}
		}
		
	}
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] arr1=input();
		int[] arr2=input();
		//selectsort(arr1);
		//selectsort(arr2);
		int l=0;
		int cl=0;
		
		if(arr1.length>=arr2.length)
	     	l=arr1.length;
		else
			l=arr2.length;
		int[] sum = new int[l+1];
		for(int i=l-1;i>=0;i--)
		{
			int carry=0;
			sum[i]=arr1[i]+arr2[i]+cl;
		
			if(sum[i]>9) 
		     {
				carry=sum[i]/10;
				sum[i]=sum[i]%10;
		     }
			cl=carry;
			
		}
		
		for(int j=l-1;j>=0;j--)
		{
			sum[j+1]=sum[j];
		}
		
		sum[0]=cl;
		
          
          
		print(sum);

	}

}
