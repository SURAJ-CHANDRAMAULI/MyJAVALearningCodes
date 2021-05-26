package array;

import java.util.Scanner;

public class Array1 {
	
	public static int[] takeinput() {
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr = new int[size];//int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
		   arr[i]=sc.nextInt();
		}
		return arr;
	}
	public static void output(int[] arr) {
		
		for(int i=0;i<arr.length;i++)
		{
		 System.out.print(arr[i]);
		}
		
	}

	public static int largest(int arr[]) {
		// TODO Auto-generated method stub
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
		
		
	}
	public static void main(String[] args) {
		int[] arry = takeinput();
		
		//output(arry);
		int max=largest(arry);
		System.out.print(max);
		
	}
}


