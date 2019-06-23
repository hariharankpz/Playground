import java.util.Scanner;
class Main
{
    public static void main(String args[])
      {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int l = in.nextInt();
        System.out.print(gcd(n,m,l));
      }
        public static int gcd(int a,int b,int c){
        int small;
        int g = 0;
        if(a>b&&c>b)
          {
              small = b;
          }
        else if(b>a&&c>a)
          {
              small = a;
          }
          else
          {
            small = c;
          }
         while(small>=1)
   
                  {
                       if(a % small == 0 && b % small == 0 && c % small == 0)
                           {
                       g = small;
                       break;
                           }
                       small--;
                  }
              return g;
}
}