import java.util.Scanner;
class Main{
	public static void main (String[] args){
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int a = n;
        while(n != 1)
        {
          a = a*(n-1) ;
          n = n - 1;
        }
      
     
      System.out.println(a);
         }
}