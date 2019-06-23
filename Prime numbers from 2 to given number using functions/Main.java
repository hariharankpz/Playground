import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int i = 2; i <= n; i++)
	    {
	        if(prime(i))
	        {
	            System.out.println(i);
	        }
	    }
	    
	}
  public static boolean prime(int m){
    boolean isprime = true;
    for(int j = 2;j <= m/2;j++){
      if(m%j == 0){
        isprime = false;
        break;}
    }
    return isprime;
  }
}