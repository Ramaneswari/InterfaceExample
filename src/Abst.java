/*
abstract class Bank
{
	abstract int getRate();
}
class Sbi extends Bank
{
	public int getRate()
	{
		return 4;
	}
}
class Idbi extends Bank
{
	public int getRate()
	{
		return 7;
	}
}
class Abst
{
	public static void main( String args[])
	{
		Bank b;
		b = new Sbi();
		System.out.println(b.getRate());

		b= new Idbi();
	System.out.println(b.getRate());
		
		
		
	}
}*/
abstract class Bike
{
	Bike()
	{
		System.out.println("1....");
	}
	abstract void show();
	void sum() {
		System.out.println("heloo111");
	}
}
class Honda extends Bike
{
	void show()
	{
	
		
		System.out.println("heloo222");
	}
}


class Abst
{
	public static void main(String args[])
	{
		Bike b = new Honda();
		b.sum();
		b.show();
	}
}