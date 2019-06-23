import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i = 0;i<n;i++)
          {
            arr[i] = in.nextInt();
           }
        func(arr,n);
        
    }
    public static void func(int arr[],int n){
        int index = 0;
        int list[] = new int[n];
        for(int i = 0;i<n;i++){
            if(arr[i] != 0){
                list[index] = arr[i];
                index++;
            }
            
        }
        for(int i = index;i<n;i++){
            list[index] = 0;
        }
      for(int i = 0;i<n;i++){
        System.out.print(list[i]+" ");
    }
}
}