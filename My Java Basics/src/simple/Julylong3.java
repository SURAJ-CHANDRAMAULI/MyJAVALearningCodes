package simple;

import java.util.Arrays;
import java.util.Scanner;

public class Julylong3 {
	
	static boolean check(int[] arr1,int[]arr2)
	{
		boolean identical=false;
		Arrays.parallelSort(arr1);
		Arrays.parallelSort(arr2);
		if(Arrays.equals(arr1, arr2)==true)
			identical=true;
		return identical;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
	int []arr1 = new int[n];
	int [] arr2 = new int[n];
	
	for(int i=0;i<n;i++)
	{
		arr1[i]=s.nextInt();
		arr2[i]=s.nextInt();
	}
	int count=0;
boolean equal=check(arr1,arr2);
if(equal==true)
	count=0;
else
{
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	int freq=0;
 for(int i=0;i<arr1.length-1;i++)
 {
	 freq++;
	 if(arr1[i]!=arr1[i+1] && arr2[i]!=arr2[i+1])
	 {
		 if(freq%2==0)
			 count=freq/2;
		 freq=0;
	 }
 }
	
	
	
	
	
	
}
			
		
		
		
			
	
	
	
	System.out.println();
	
  }	
 }
}