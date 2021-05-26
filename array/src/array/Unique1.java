package array;
import java.util.Scanner;
public class Unique1 {

	public static int[] input() {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
		   arr[i]=sc.nextInt();
		}
		return arr;
	}
		
		public static void print(int[] arr) {
			
			
			for(int i=0;i<arr.length;i++) 
			{
				System.out.print(arr[i]);
			}
			
		}
		public static void main(String[] args) {

		
	int [] array = input();
	  int count=0;
      for(int i=0;i<array.length;i++)
      {
          if(array[i]==0)
          count++;
           }
       for(int j=array.length-1;j>array.length-count;j--)
       {
           array[j]=0;
       }
	print(array);

		}
}
