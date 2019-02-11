import java.util.Scanner;
 
public class EvenOdd
{
  public static void main(String args[])
  {
    int c;
    Scanner in = new Scanner(System.in);
    c = in.nextInt();
   
    if ((c/2)*2 == c)
      System.out.println("Even");
    else
      System.out.println("Odd");
  }
}