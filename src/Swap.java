import java.util.Scanner;
// using function
class B
{
	public static void swap(int a ,int b)
	{
		a =a+b;
		b = a-b;
		a = a-b;
		System.out.println(a+" "+b);
	}
}





public class Swap {

	public static void main(String[] args) {
		B obj = new B();
		
	//	Scanner sc = new Scanner(System.in);
		int a = 10;
		int b = 30;
		System.out.println(a+" "+b);
		B.swap(a,b);
		
	}
}
		// swap using third variable
		/* System.out.println(a + " " + b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
		
		*/
		
		
		//swap without using third variable
	/*	System.out.println(a + " " + b);
		a = a+b;
		b= a-b;
		a= a-b;
		System.out.println(a + " " + b); */
		
	
		
	