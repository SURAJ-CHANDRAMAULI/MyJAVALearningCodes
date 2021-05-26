package simple;

import java.util.Scanner;

public class Chef_card {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			 int chefp=0;
	   			int mortyp=0;
		while(n-->0)
		{
             int ccard = s.nextInt();
             int mcard = s.nextInt();
	
			int sumdigitC =0;
			int sumdigitM=0;
			
             while(ccard!=0)
            	  {
            	  sumdigitC=ccard%10+sumdigitC;
            	  ccard=ccard/10;
            	  }
            	  while(mcard!=0)
            	  {
            	  sumdigitM=mcard%10+sumdigitM;
            	  mcard=mcard/10;
            	  }	  
            	 
           if(sumdigitC>sumdigitM)
          chefp++;
           else if(sumdigitC<sumdigitM)
        	   mortyp++;
           else {
        	   chefp++;
        	   mortyp++;
           }
              }
              if(chefp>mortyp)
              System.out.println(0+" "+chefp);
              else if(chefp<mortyp)
                  System.out.println(1+" "+mortyp);   
              else
                  System.out.println(2+" "+chefp);
            	 
              }
		}

	}


