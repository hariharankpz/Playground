import java.util.Scanner;

class Faculty
{
  public void salary(int baseSalary){
    System.out.println("Base Salary: "+baseSalary);
}
}
class CSE extends Faculty
{
  public void salary(int baseSalary)
  {
   System.out.println("CSE Faculty: "+(baseSalary+3000));
}
}
class IT extends Faculty
{
  public void salary(int baseSalary)
  {
  System.out.println("IT Faculty: "+(baseSalary+5000));
}
}
class ECE extends Faculty
{
  public void salary(int baseSalary)
  {
    System.out.println("ECE Faculty: "+(baseSalary+4500));
  }
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in =  new Scanner(System.in);
    int baseSalary = in.nextInt();
    if(baseSalary > 0){
    Faculty obj1 = new Faculty();
    ECE obj = new ECE();
    IT obj2 = new IT();
    CSE obj3 = new CSE();
    obj1.salary(baseSalary);
    obj3.salary(baseSalary);
    obj2.salary(baseSalary);
    obj.salary(baseSalary);
    }
    else
    {
      System.out.println("null");
    }
  
  }   
   }
