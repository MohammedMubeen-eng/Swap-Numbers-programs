import java.util.Scanner;
public class SwapNumber3
{
    public static void main(String args[])
   {
     Scanner sc =new Scanner(System.in);
      System.out.println("Enter First Number..");
        int a=sc.nextInt();     
      System.out.println("Enter Second Number..");
        int b=sc.nextInt();   
       
    System.out.println("Before Swap:  "+a+ " "+b);
           a=a*b;
           b=a/b;
           a=a/b;
 System.out.println("After Swap: "+a+" "+b);  
  }
}