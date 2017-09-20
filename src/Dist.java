import java.util.Scanner;

public class Dist {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int c[] = new int[a];
		for(int i=0;i<a;i++)
		{
			c[i]=sc.nextInt();
		}
		int b =  sc.nextInt();
		int count = 0;
		for(int i=0;i<a;i++)
		{
			if(c[i]==b)
			{
				count++;
		    }
		
		}
		System.out.println(count);
			
		
	}
}

/*
 * int count=0;
 * 
 * while(d!=0) { int c = (int) d%10; if(c==b) { count++; } d = d/10; }
 * System.out.println(count); } }
 */
