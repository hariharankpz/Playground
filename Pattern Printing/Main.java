import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int temp = n;
    for(int i = 0 ;i<n;i++){
      for(int j = 0;j<n;j++){
        if(i>j){
          System.out.print(temp-j);
        }
        else{
        System.out.print(temp-i);
        }
      }
      System.out.println("");
    }
    
    
    }
}