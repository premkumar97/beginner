import java.util.Scanner;

public class Panagram {
    public static boolean isPangram(String test){
        for (char a = 'A'; a <= 'Z'; a++)
            if ((test.indexOf(a) < 0) && (test.indexOf((char)(a + 32)) < 0))
                return false;
        return true;
    }
 
    public static void main(String[] args){
    	System.out.print("Enter string to analyse:");
        Scanner sn = new Scanner(System.in);
        String input = sn.nextLine().replaceAll(" ", "");
              
        System.out.println(isPangram(input));
    }
}
