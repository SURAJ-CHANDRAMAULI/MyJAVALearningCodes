package try1;

import java.util.Scanner;

public class Try4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    int n = s.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=s.nextInt();
		    
		    
		    int count =1;
		    int max = arr[0];
		    for(int i=0;i<n;i++)
		    {
		       
		       if(max>arr[i]) {
		        count++;
		        max=arr[i];
		       }
		    }
		    
		    System.out.println(count);
		}

	}

}
