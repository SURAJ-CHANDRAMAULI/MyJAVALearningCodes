
package javafunctions;
import java.util.Scanner;
public class InputOutput {
	public static int[] input() {
		Scanner s = new Scanner(System.in);
				int size=s.nextInt();
				int[] arr = new int[size];
				for(int i=0;i<size;i++)
				{
					arr[i]=s.nextInt();
				}
		return arr;
	}
	public static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int[] takeinput = input();
print(takeinput);
	}

}
