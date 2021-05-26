package JavaProgram;
import java.util.Scanner;
public class frnhttocels { 

public static void main(String[] args)
    {
        int i,W,E,S;
        double c;
        Scanner s = new Scanner(System.in);
        
		S =  s.nextInt();
		E = s.nextInt();
        W = s.nextInt();
        
for(i=S;i<=E;i=i+W)
{
    c = (5/9)*(i-32);
    System.out.println(i+"\t"+c);
    
}
		}

}



