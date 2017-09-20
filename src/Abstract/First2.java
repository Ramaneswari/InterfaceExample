package Abstract;
interface A{
	int a= 10;
	void show();
}
interface B
{
	void show();
}
abstract class C
{
    int a  =10;
}

public class First2 implements A,B {
	@Override
	public void show() {
		System.out.println("jhas");
		
	}

	public static void main(String[] args) {
           First2 f2 =new First2();
      f2.show();

	}

	

}
