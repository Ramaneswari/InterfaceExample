class A {
	static int a;
	static int b;

	static int sum() {
		int c = a + b;
		return c;
	}
}

public class firsta {

	public static void main(String[] args) {
				A.a = 20;
		A.b = 30;

		int tot = A.sum();
		System.out.println(tot);

	}

}
