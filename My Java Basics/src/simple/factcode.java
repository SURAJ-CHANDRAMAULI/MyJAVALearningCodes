package simple;
import java.util.Scanner;
public class factcode {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		// your code goes here
//		Scanner s = new Scanner(System.in);
////		int[] arr = new int[t];
//		int t = s.nextInt();
//    while(t>0){
//     int n= s.nextInt();
//     int f=1;
//     for(int i=n;i>1;i--)
//     f=f*i;
//    System.out.print(f);
//		 t--;  
//		}
//		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int[] arr = new int[t];
		
		int k=0,j=0;
    while(t>0){
     int n= s.nextInt();
     
     arr[k]=n;
     k++;
     t--;
    }
    int f=0;
 while(j<t)
        
 {
     for(int i=1;i<=arr[j];i++)
     f=f*i;
    System.out.print(f);
		 j++;
	}

	}

}
