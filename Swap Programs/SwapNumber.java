import java.util.Scanner;
public class SwapNumber
{
    public static void main(String args[])
   {
     Scanner sc =new Scanner(System.in);
      System.out.println("Enter First Number..");
        int a=sc.nextInt();     
      System.out.println("Enter Second Number..");
        int b=sc.nextInt();   
       
    System.out.println("Before Swap:  "+a+ " "+b);
           int t=a;
               a=b;
               b=t;
 System.out.println("After Swap: "+a+" "+b);  
  }
}