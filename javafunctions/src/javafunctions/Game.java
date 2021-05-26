package javafunctions;
import java.util.Arrays;
import java.util.Scanner;
public class Game {
//	public static void main(String[] args) {
//		
//	Scanner s = new Scanner(System.in);
//	int t = s.nextInt();
//	int [] arr1=new int[t];
//	int [] arr2=new int[t];
//	for(int i=0;i<t;i++){
//		arr1[i]=s.nextInt();
//		arr2[i]=s.nextInt();
//	}
//	int [] lead = new int[t];
//	for(int i=0;i<t;i++)
//	lead[i]=arr1[i]-arr2[i];
//
////	int[] newlead= new int[t];
////	newlead=lead;
//   Arrays.parallelSort(lead);
//	
//	if(Math.abs(lead[0])>lead[t-1])
//		
//	
//			System.out.println(2+" "+Math.abs(lead[0]));
//		
//
//	else 
//		System.out.println(1+" "+lead[t-1]);
//		
//	
//	}	
    public static void main(String[] args){
Scanner s = new Scanner(System.in);
	int t = s.nextInt();
	int score1=0,score2=0;
	int [] arr1=new int[t];
	int [] arr2=new int[t];
	for(int i=0;i<t;i++){
	    arr1[i]=s.nextInt();
	    score1=score1+arr1[i];
	    arr2[i]=s.nextInt();
	    score2=score2+arr2[i];
	}
	
	int [] lead = new int[t];
	for(int i=0;i<t;i++)
	lead[i]=arr1[i]-arr2[i];

   Arrays.parallelSort(lead);
   if(score1<score2)
			System.out.println(2+" "+Math.abs(lead[0]));
		else 
		System.out.println(1+" "+lead[t-1]);
		
	}	
	
}

