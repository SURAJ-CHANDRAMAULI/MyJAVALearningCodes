package simple;
import java.util.Arrays;
import java.util.Scanner;
public class Cops_Theif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t =s.nextInt();
		
		while(t-->0)
		{
			int cn = s.nextInt();
			int speed = s.nextInt();
			int time = s.nextInt();
			int count=0;
			int[] hn = new int[cn];
			
			for(int j=0;j<cn;j++)
			hn[j]=s.nextInt();
			
			Arrays.parallelSort(hn);
		;
			
		for(int i=0;i<cn-1;i++)
		{
			if(hn[i+1]-speed*time>hn[i]+speed*time)
			count=count+(hn[i+1]-speed*time)-(hn[i]+speed*time)-2;
		}
		
			if(100-hn[cn-1]>speed*time)
				count=count+100-hn[cn-1]-speed*time;
			
			if(hn[0]-0>speed*time)
				count=count+hn[0]-speed*time;
			
		System.out.println(count);
		}
		
		

	}

}
