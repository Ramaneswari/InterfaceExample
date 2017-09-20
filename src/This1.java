import java.util.Scanner;

class C {
	private String name;
	private int age;

	C(String name, int age)
	{
	this.name = name;
	this.age = age;
	}

	String getName() {
		return name;
		
	}
	int getAge()
	{
		return age;
	}
}

public class This1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		C obj = new C(name,age);
		
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		

	}

}
