import java.util.Scanner;

public class Hunter3 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int lim=scan.nextInt();
		int num[]=new int[lim],i;
		for(i=0;i<lim;i++)
		{
			num[i]=scan.nextInt();
			
		}
				
		for(i=0;i<lim;i++)
		{
			if(i==num[i]){
				System.out.println(num[i]);
			}
		}
	}

}
