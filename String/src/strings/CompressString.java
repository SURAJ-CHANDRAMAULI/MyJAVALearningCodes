package strings;
import java.util.Scanner;
class CompressString {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int freq=1;
		int count=1;
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				freq++;
				continue;
			}
	
		count=freq;
		freq=1;
		if(str.charAt(i)!=str.charAt(i+1))
			{
			System.out.print(str.charAt(i)+""+count);
		    }
		}
		
		for(int i=(str.length()-1);i>0;i--)
		{
			if(str.charAt(i)!=str.charAt(i-1))
			{
				System.out.print(str.charAt(i)+"");
				System.out.print(str.length()-i);
				break;
			}
		}
		
	}
}
