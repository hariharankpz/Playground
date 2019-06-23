import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int a = N/100;
    int b = (N/10)%10;
    int c = N%10;
    System.out.print(c);
    System.out.print(b);
    System.out.print(a);
  }
}