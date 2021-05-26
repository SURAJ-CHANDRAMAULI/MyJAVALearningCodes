package try1;

import java.util.Arrays;
import java.util.Scanner;

public class Try5 {

	public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	
	
	int n1 = s.nextInt();
	int a1[] = new int[n1];
   for(int i=0;i<n1;i++)
	a1[i]= s.nextInt();


    int n2 = s.nextInt();
    int a2[] = new int[n2];
    for(int i=0;i<n2;i++)
    a2[i]= s.nextInt();

		
		Arrays.parallelSort(a1);
		Arrays.parallelSort(a2);
		
		int i=0;
		int j=0;
		
		while(i<a1.length || j<a2.length) {
			if(a1[i]==a2[j]) {
				System.out.print(a1[i]);
				i++;
				j++;
			}
			else if(a1[i]>a2[j])
				j++;
			else
				i++;
			
				
		}
		
	}

}
