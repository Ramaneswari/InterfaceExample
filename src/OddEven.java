import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[100];
		int n = sc.nextInt();
		int even = 0;
		int odd = 0;
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
        
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				even =1;
			}
			else
			{
				odd = 1;
			}
		}
		if(even == 1)
		{
			System.out.println("Even");

		for(int i=0;i<n;i++)
			{
		      if(a[i]%2==0)
		      {
		    	  System.out.println(a[i]);
		      }
			}
		
		}
		if(odd==1)
		{
			System.out.println("Ödd");
			for(int i=0;i<n;i++)
			{
		      if(a[i]%2!=0)
		      {
		    	  System.out.println(a[i]);
		      }
			}

			
		}
	}

}
