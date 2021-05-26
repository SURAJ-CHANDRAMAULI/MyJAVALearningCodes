package strings;

public class Main {

	String s2;
	
	 public static void main(String[] args) {
		 Main p = new Main();
		p.f1();
	 }

	void f1() {
		// TODO Auto-generated method stub
		String s1 = "foo";
		s2=f2(s1);
		System.out.println(s1+" "+s2);
	}

	 String f2(String s1) {
		// TODO Auto-generated method stub
		s1=s1+"bar";
		System.out.print(s2+" ");
		return s1;
	}
	
  // String s3=f2(s2);
	
}
