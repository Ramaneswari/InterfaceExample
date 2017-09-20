
class Bmw
{
	private Object speed;
	Bmw(int speed)
	{
		this.speed = speed;
	}
	public Object getSpeed()
	{
		return speed;
	}

}
public class Car {

	public static void main(String[] args) {
		
		Object obj = new Bmw(501);
		 System.out.println(((Bmw) obj).getSpeed());
				
	}
}

