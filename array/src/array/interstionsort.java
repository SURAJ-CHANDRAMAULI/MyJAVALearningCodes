package array;

import java.util.Scanner;

public class interstionsort 
{
	public static int[] takeinput() 
	{
		Scanner s = new Scanner(System.in);
				int size=s.nextInt();
				int[] arr = new int[size];
				for(int i=0;i<size;i++)
				{
					arr[i]=s.nextInt();
				}
				s.close();
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
		int [] arr1 = takeinput();
		int [] arr2 = takeinput();
		selectsort(arr1);
		selectsort(arr2);
	
			int[] Arr= new int[arr1.length+arr2.length];
		
			int i=0;
			int j=0;
			int k=0;
			while(i<arr1.length && j<arr2.length)
			{
				if(arr1[i]<arr2[j])
				{
					Arr[k]=arr1[i];
					i++;
					k++;
				}
				else
				{
					Arr[k]=arr2[j];
					j++;
					k++;
				}
				
			}
			while(i<arr1.length) 
			{
				Arr[k]=arr1[i];
				i++;
				k++;
			}
			while(j<arr2.length)
			{
				Arr[k]=arr2[j];
				j++;
				k++;
			}
			print(Arr);
    }
		
}
	


