import java.util.Scanner;

public class Hunter75 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Limit");
		int lim=scan.nextInt(),i;
		int num[]=new int[lim];
		for(i=0;i<lim;i++)
		{
			num[i]=scan.nextInt();
		}
		for(i=0;i<lim-1;i++)
		{
			if(num[i]>num[i+1])
			System.out.println(num[i+1]);
			else
				System.out.println("-1");
			
			
		}
				
				
	}

}

