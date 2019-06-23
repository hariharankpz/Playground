import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i = 0; i <= n-1; i++)
    {
      list[i] = in.nextInt();
    }
    per_batch(list,n);
  }
  public static void per_batch(int list[],int n)
     {
         boolean check = true;
         int fb_sum = list[0] + list[1] +list [2];
         for(int i = 3;i<=n-1;i=i+3)
            {
                int fo_b_sum = list[i]+list[i+1]+list[i+2];
                if(fb_sum != fo_b_sum)
                   {
                       check = false;
                       break;
                    }
             }
    if(check == true)    
      System.out.println("Perfect Batch");
    else 
      System.out.println("Not a Perfect Batch");
  }                          
}