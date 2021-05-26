package array2D;

import java.util.Scanner;

public class LargestColSum 
{
	
	public static int[][] input()
	{
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		int c = s. nextInt();
		int [][] arr2d =  new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			arr2d[i][j] = s.nextInt();
		    }
		}
		s.close();
		return arr2d;
		
	}
	public static void print(int[][] arr2d)
	{
		for(int i=0;i<arr2d.length;i++)
		{
			for(int j=0;j<arr2d[0].length;j++)
			{
				System.out.print(arr2d[i][j]);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	int[][] Arry = input();
	      
        int sumR=0;
        
      
        int[] Rarr = new int[Arry.length];
        
        System.out.print("sum of rows is " );
	for(int i=0;i<Arry.length;i++)
	{
		sumR=0;
		for(int j=0;j<Arry[0].length;j++)
		{
		sumR=sumR+Arry[i][j];
		}
		
		System.out.print(sumR+" ");
		Rarr[i]=sumR;
	}
	int tempR = Rarr[0];
	int Rindex=0;
		for(int i=0;i<Arry.length;i++)
		{
			if(tempR<Rarr[i])
			{
				tempR = Rarr[i];
				Rindex=i;
			}	
		}
		System.out.println("largest row sum is "+ tempR);
		System.out.println("at index " + Rindex);
		int sumC=0;
		int Cindex=0;
	
		int[] Carr = new int [Arry[0].length];
		System.out.print("sum of columns is ");
		for(int k=0;k<Arry[0].length;k++)
		{
			sumC=0;
			for(int l=0;l<Arry.length;l++)
			{
				sumC = sumC + Arry[l][k];
			}
			System.out.print(sumC+" ");
			
			Carr[k]=sumC;
		}
			int tempC=Carr[0];
		for(int k=0;k<Arry[0].length;k++)
		{
			if(tempC<Carr[k])
			{
				tempC=Carr[k];
				Cindex=k;
			}
		}
			System.out.println("largest column sum is "+ tempC);
			System.out.println("at index " + Cindex);
			
			
			if(tempC>tempR)
			{
				System.out.print("overall in array "+ tempC +" is greatest sum");
				
			}
			else
			{
				System.out.print("overall in array "+ tempR +" is greatest sum");
			}
			
						
	}
}
