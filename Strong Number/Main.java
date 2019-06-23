import java.util.Scanner;
class Main{
	public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    int m = in.nextInt();
    int sum = 0;
    int x = m;
      while( x > 0 )
         {
           int n = x;
           n = n % 10;
           int a = n;
           while ( n != 1 )
              {
                 a = a * (n-1);
                 n--;
              }
           sum = sum + a;
           x = x / 10;
         }
      if(sum == m)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}