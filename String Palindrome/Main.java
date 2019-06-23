import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str  = in.nextLine();
        int str_len = str.length();
        int first = 0;
        int last  = str_len-1;
        boolean match = true;
        while(first < last)
           {
               if(str.charAt(first) != str.charAt(last))
                   {
                       match = false;
                       break;
                   }
                first++;
                last--;
           } 
         if(match == true)
            {
               System.out.println("Yes");
            }
         else
               System.out.println("No");
      
    }     
}