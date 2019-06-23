import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int idx = 0; idx <= n - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
        int search_elem_1 = in.nextInt();
        int search_elem_2 = in.nextInt();
        int elem_1_idx = -1;
        int elem_2_idx = -1;
        for(int idx = 0; idx <= n - 1; idx++)
        {
            if(search_elem_1 == arr[idx])
            {
                elem_1_idx = idx;
            }
            if(search_elem_2 == arr[idx]){
                elem_2_idx = idx;
            }
        }
        System.out.println(elem_1_idx);
        System.out.println(elem_2_idx);
    }
}