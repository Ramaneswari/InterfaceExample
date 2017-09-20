class ss
{
	int spped =90;
	void show()
	{
		System.out.println("haell");
	}
}
class ss1 extends ss
{
	int spped = 20;
	void show()
	{
		System.out.println("hai");
	}
}
class Sub {

	public static void main(String[] args) {
	
     ss s = new ss1();
     System.out.println(s.spped);
     s.show();
         
	}

}
