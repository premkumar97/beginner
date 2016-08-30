import java.util.Scanner;

public class JavaHunter101 {
 
        public static void main(String[] args) {
 
        	Scanner scan=new Scanner(System.in);
        	int i,j,k;
        	int lim=scan.nextInt();
                for(i=1;i<=lim;i++)
                {
                	for(j=lim;j>=i;j--)
                		System.out.print(" ");
                	for(k=1;k<=i;k++)
                	{
                		System.out.print(k+" ");
                	}
                	System.out.println();
                }
 
        }
}
