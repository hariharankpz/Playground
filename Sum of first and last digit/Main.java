import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);       	
		int n = in.nextInt();
        int b = (n % 10);
		while( n / 10 > 0)
		{
		    n = n / 10;
		    
		}
		int a = n;
	    int sum = a + b;
		System.out.println(sum);
	}
}

