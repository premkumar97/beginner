import java.util.*;
 
public class Hunter28
{
    
    public static void main(String args[])
    {
    	Scanner scanner=new Scanner(System.in);
        String str =scanner.nextLine();
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(int i=0;i<str.length();i++)
            lhs.add(str.charAt(i));
        for(Character ch : lhs)
            System.out.print(ch);
    
       
    }
}