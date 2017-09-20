import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
      	System.out.println("hello");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b =sc.nextInt();
		int sum = a+b;
		float avg = (float)sum/2;
		System.out.println(sum+" "+avg);
		

	}

}