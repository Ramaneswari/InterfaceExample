class Parent
{
	
	public void show()
	{
		System.out.println(" i am parent class");
	}
}

public class Cas extends Parent {
         
	public void show()
	{
		System.out.println("I am child class1111");
	}
	public void alpha()
	{
		System.out.println("I am child class");
	}
	public static void main(String[] args) {
		Parent obj = new Cas();
	//	Cas obj1 = (Cas) obj;
		obj.show();
		((Cas) obj).alpha();
		

	}

}
