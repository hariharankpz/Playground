import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = 0 ,large; 
        int arr[] = new int[n];
        for(int i = 0; i <= n-1; i++)
             {
                arr[i] = in.nextInt();
             }
         for(int i = 0; i <= n-1;i++)
             {
              if (arr[i] > temp)
              { 
                temp = arr[i];
              }
             }
         System.out.print(temp);
    }
}