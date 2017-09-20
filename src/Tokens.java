import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokens {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer str1 = new StringTokenizer(str);
		// str = str.trim();
	/*	StringTokenizer str1 = new StringTokenizer(str, " @ - ' %");
		while (str1.hasMoreTokens()) {
			System.out.println(str1.nextToken());*/
		System.out.println("token   "+ str1.nextToken(" "));
		}

	}

