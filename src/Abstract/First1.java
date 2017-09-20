package Abstract;

import java.util.Scanner;

//Abstract method 
abstract class Calculator1 {

	abstract void Addition(int a, int b);

	abstract void Substraction(int a, int b);

	abstract void Multiplication(int a, int b);

	abstract void Division(int a, int b);

	// Normal Method
	void mod(int a, int b) {
		int c = a % b;
		System.out.println("Mod :" + c);
	}

}

class Calculator2 extends Calculator1 {
	// Override abstract method
	void Addition(int a, int b) {

		int c = a + b;
		System.out.println("Add :" + c);
	}

	void Substraction(int a, int b) {

		int c = a - b;
		System.out.println("Sub :" + c);
	}

	void Multiplication(int a, int b) {
		int c = a * b;
		System.out.println("Mul :" + c);

	}

	void Division(int a, int b) {

		int c = a / b;
		System.out.println("Div :" + c);

	}

}

public class First1 {

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		Calculator2 c2 = new Calculator2();
		c2.Addition(a, b);
		c2.Substraction(a, b);
		c2.Multiplication(a, b);
		c2.Division(a, b);
		c2.mod(a, b);
	}

}
