import java.util.Scanner;

public class Neg {
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		boolean tf = sc.nextBoolean();
		if((a>0 && b<0 && tf==false)  || (a<0 && b>0 && tf==false) || (a<0 && b<0 && tf==true))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
	}

}
