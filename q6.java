import java.util.Scanner;

/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q6
{
    public static void main(String[] args)
    
    {
      Scanner scan = new Scanner(System.in);
      System.out.println("enter a string");
      String text=scan.nextLine();
      
      
      StringBuilder sb = new StringBuilder();
      
      for(int i= text.length()-1;i>=0;i--)
      {
        sb.append(text.charAt(i));
    }
        String reversed=sb.toString();
        System.out.println("Orginal"+ text);
        System.out.println("Reversed" +reversed);
        
        if (text.equals(reversed))
        {
        System.out.println("palindrome");
        
        }
        else
        {
         System.out.println("not");
        }
      
      
       
      
      
    }
}