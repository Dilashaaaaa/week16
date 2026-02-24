import java.util.*;


public class q3
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter string");
    String text=sc.nextLine();
    System.out.println("charater to find");
    char ch=sc.nextLine().charAt(0);
    System.out.println("first occurance"+ text.indexOf(ch));
    
    System.out.println("enter index");
    int index=sc.nextInt();
    System.out.println("character at index"+text.charAt(index));
    sc.nextLine();
    
}
}