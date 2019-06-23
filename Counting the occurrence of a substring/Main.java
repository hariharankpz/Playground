import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        int str_len1 = str1.length();
        int str_len2 = str2.length();
        int count = 0;
        for(int i = 0; i <= ((str_len1-str_len2) + 1); i++)
           {   
               boolean flag = true;
               for(int j = 0 ;j < str_len2;j++){
                  if(str1.charAt(i + j) != str2.charAt(j))
                     {
                        flag = false;
                        break;
                     }
                   } 
                if(flag == true)
                   {
                      count++;
                   }
            }   
         System.out.print(count);
   } 
}