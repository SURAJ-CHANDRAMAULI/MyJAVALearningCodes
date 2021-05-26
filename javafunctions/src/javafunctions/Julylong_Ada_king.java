package javafunctions;
import java.util.Scanner;
public class Julylong_Ada_king {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner s = new Scanner(System.in);
     int t = s.nextInt();
     while(t-->0)
     {
      int k=s.nextInt();
    	 String[][] str = new String[8][8];
    	 for(int i=0;i<8;i++)
    	 {
    		 for(int j=0;j<8;j++)
    		 {
    			 str[i][j]=".";
    			 
    		 }
    		 
    	 }
    	 str[7][7]="O";
   
    	
int a=0;
    for(int i=0;i<8;i++)
    {
    	for(int j=0;j<8;j++)
    	{
              if(a<64-k)
              {
            	  str[i][j]="X";
              }
              a++;
    	}
    	
    }
    for(int i=0;i<8;i++)
    {
    	for(int j=0;j<8;j++)
    	{
    		System.out.print(str[i][j]);
    	}
        System.out.println();
    }
    
     System.out.println();
     }
	}

}
