import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int l = in.nextInt();
        System.out.print(greatest(n,m,l));
	}
   public static int greatest(int a,int b,int c){
     int temp;
     if (a > b)
     {
       temp = a;
     }
     else
     {
       temp = b;
     }
     int large;
     if(temp>c)
     {
       large = temp;
     }
     else
     {
       large = c;
     }
    return large;   
   }    
}