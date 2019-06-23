import java.util.Scanner;
class Main {
	public static void main (String[] args){
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int i , count = 1;
     for(i = 0; i < n; i++)
       {
       System.out.println(count);
       count = count + 2;
        
        }
    }
}