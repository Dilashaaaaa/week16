import java.util.*;


public class q1
{
   public static void main(String[] args)
   {
     Scanner scan= new Scanner(System.in);
     System.out.println("Enter first String");
     String s1=scan.nextLine();
     
     System.out.println("Enter second String");
     String s2= scan.nextLine();
     
     String s3= s1.concat(s2);
     System.out.println("Combined" +s3);
     
     System.out.println("Enter fourth string ");
     String s4=scan.nextLine();
     
     if(s3.equals(s4))
     {
     System.out.println("Are equal");
    }
     else
     {
         System.out.println("Not equal");
        }
     
    }
}