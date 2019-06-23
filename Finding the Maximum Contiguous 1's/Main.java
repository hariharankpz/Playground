import java.util.Scanner;
class Main
{
    public static void main(String args[])    
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int freq[] = new int[n];
        max_ele(arr,freq,n);
    }
    public static void max_ele(int a[],int freq[],int n){
    int idx = 0;
    int count = 0;
    for(int i = 0;i<n;i++)
        {
            if(a[i] == 1)
                {
                    count++;
                    freq[idx] = count;
                }
            if(a[i] == 0)
            {
                idx++;
                freq[idx] = 0;
                count = 0;
            }
                
        }
        int max = 0;
        for(int i = 1 ; i< n;i++)
            {
                if(freq[i] > freq[max])
                    {
                        max = i;
                    }
            }
            System.out.print(freq[max]);
   }
}
