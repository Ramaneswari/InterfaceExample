package Packe;

class WelcomeToJava
{
	public final void display()
	{
		System.out.println("hai");
	}
}
class Random1 extends WelcomeToJava
{
	 public void display1()
	{
		System.out.println("heloo");
	}
}
class Random
{
public static void main(String[] a)
{
	 Random1 s = new Random1();
	 System.out.println("hagsj");
	s.display();
}
}
