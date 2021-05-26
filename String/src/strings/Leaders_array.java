package strings;

import java.util.Scanner;

public class Leaders_array 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size=s.nextInt();
		int[] arr = new int[size];
		for(int j=0;j<size;j++)
		{
			arr[j]=s.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			boolean statement=false;
			for(int k=i+1;k<size;k++)
			{
			  if(arr[i]>arr[k])
			  {
			  statement =true;
			  break;
			  }
			}
			    if(statement==true)
				System.out.print(arr[i]);
			   }
       }
		//for(int i=0;i<arr.length;i++) {
			//boolean allSmaller=true;
			//for(int j=i+1;j<arr.length;j++) {
				//if(arr[i] < arr[j]) {
					//allSmaller=false;
					//break;
			//	}
			//}
		//	if(allSmaller) {
			//	System.out.print(arr[i]+" ");
			//}
		//}
    }

