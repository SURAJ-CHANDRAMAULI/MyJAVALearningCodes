package array;
import java.util.Scanner;
public class javalist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner s = new Scanner(System.in);
		                int size=s.nextInt();
		                int[] arr = new int[size];
		                for(int i=0;i<size;i++)
		                {
		                    arr[i]=s.nextInt();
		                }
		    
		        // TODO Auto-generated method stub
		     
		        
		            System.out.print("Insert");
		            int x =s.nextInt();
		            int y = s.nextInt();
		            System.out.print("Delete");
		            int d = s.nextInt();
		            
		                int[] Arr = new int[size+1];
		            for(int j=0;j<size;j++)
		            {
		                Arr[j]=arr[j];
		            }
		            int temp=0;
		            temp=Arr[x];
		               Arr[x]=y;
		               Arr[d]=temp;
		               for(int l=0;l<size;l++) 
		               {
		            	   System.out.print(Arr[l]);
		               }
		               }
	
		        
		    }

	


