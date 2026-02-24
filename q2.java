
/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2
{
    public static void main(String[] args)
    {
        String text="Hello  World ";
        String trimmedString = text.trim();
        System.out.println(trimmedString);
        
        //substring
        String firstTen= trimmedString.substring(0,10);
        System.out.println("First ten characters"+firstTen);
        String[] words = text.split(",");
         for(String word:words)
         {
            System.out.println(word);
            }
        
    }
}