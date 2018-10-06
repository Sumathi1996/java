import java.util.Scanner;
 
public class Main
{
   public static void main(String args[])
   {
      int x;
      
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
     
      if (x % 2 == 0)
         System.out.println("The number is even.");
      else
         System.out.println("The number is odd.");
   }
}