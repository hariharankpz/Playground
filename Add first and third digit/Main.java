import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int g = in.nextInt();
      int a = g / 100;
      int b = g % 10;
      int sum = a+b;
      System.out.println(sum);
	}
}