
interface X
{
	void show();
}
interface Y
{
	 void show1();
	
}
class  H implements X,Y
{
	public void show()
	{
		System.out.println("heloo1");
	}
	@Override
	public void show1() {
		System.out.println("hsj1");
		
	}
			
}
class Multi 
{

	public static void main(String[] args) {
	
	H c = new H();
   c.show();	
   c.show1();

	}

		
	}






 /* class X 
{
	void show ()
	{
		System.out.println("ädfh");
	}
}
class Y {
	void show()
	{
		System.out.println("ädfn");
	}
}

class Multi extends X,Y
{
public void main(String args[])
{
	Multi z = new Multi();
	z.show();
	}
}*/