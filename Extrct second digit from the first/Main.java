import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        while( n > 100)
        {
          n = n / 10;
        }
      n = n % 10;
      System.out.println(n);
    }
}
    