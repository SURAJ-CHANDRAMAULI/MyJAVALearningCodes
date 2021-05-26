package strings;

import java.util.Scanner;

public class Min_length_word
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
//		int[] arr = new int [str.length()+1];
//		int length=0; int count=0;
//		String Str = "";
//		for(int i=0;i<=str.length();i++)
//		{
//
//			if(i==str.length() || str.charAt(i)==' ')
//			{
//				length=i-count;
//				arr[i]=length;
//				count=length;
//			}
//		for(int j=i+1;j<str.length();j++)
//		{
//		if(arr[j]>0 && arr[i]<arr[j])
//		{
//		Str=Str+(str.substring(count,i-count));
//		}
//
//	  }
//   }
		int minlen = Integer.MAX_VALUE;
		int endindex = 0;
		int startindex=0;
		for(int i=0;i<=str.length();i++)
		{
			int length=startindex-endindex;
			if(i==str.length() || str.charAt(i)==' ')
			{
				if(minlen>length) 
				{
			    minlen=length;
				startindex=i-minlen;
				endindex=i;
				}
				
		     }
		
		 }
		System.out.print(str.substring(startindex,endindex));
  

	}
}