package try1;

import java.util.Scanner;

public class Cups {

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);	
		
	int n = s.nextInt();
	int  maxweight = s.nextInt();
	int[] wt = new int[n];
	int[] cost = new int[n];
	
	for(int i=0;i<n;i++)
		wt[i]=s.nextInt();
	
	for(int j=0;j<n;j++)
		cost[j] = s.nextInt();
	
	int dp[] = new int[maxweight+1];
	
	dp[0]=0;
	
	for(int i =1;i<=maxweight;i++) {
		dp[i]= dp[i-1]+maxof(i,wt,cost);
	}
       System.out.println(dp[maxweight]);
	}
	
	public static int maxof(int k,int[] wt, int[] cost) {
		int temp=Integer.MIN_VALUE;
		for(int i=0;i<wt.length;i++) {
			
				if(wt[i]==k) {
					if(cost[i]>temp)
						temp=cost[i];
				}
			
		}
		return temp;
		
	}

}
