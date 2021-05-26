package array;

import java.util.Scanner;

public class Removingconstvedplcte 
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
	/*public static void print(int[] arr)
	{
		
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print(arr[i]);
		}
		
	}
	*/

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] Arr = takeinput();
		for(int i=0;i<Arr.length-1;i++)
		{
			if(Arr[i]!=Arr[i+1])
			{
			System.out.print(Arr[i]);
			}
		}
	
		System.out.print(Arr[Arr.length-1]);
    }

}
