package simple;
import java.util.Scanner;
public class Min_Notes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			int n=s.nextInt();
			int []arr= {100,50,10,5,2,1};
			int count =0;
			for(int i=0;i<6;i++) {
			 count=count+n/arr[i];
				    n=n%arr[i];
				  if(n==0)
					  break;
			}			
			System.out.println(count);
			t--;
		}
	}
}
