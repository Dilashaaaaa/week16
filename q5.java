import java.util.*;


/**
 * Write a description of class q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q5
{
   public static void main(String[] args)
   
   {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a string");
    String first = scan.nextLine();
    
    StringBuilder sb = new StringBuilder(first);
     System.out.println("enter another string");
    String second = scan.nextLine();
    sb.append(second);
    
    System.out.println("enter number");
    int number=scan.nextInt();
    
    System.out.println("enter special chararcter");
    char special=scan.next().charAt(0);
    
    sb.append(number);
    sb.append(special);
    
    
    
    
    }
}