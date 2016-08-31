import java.util.Scanner;

public class Hunter63 {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int lim=scan.nextInt();
		int num[]=new int[lim+1];
		int i,j,large;
		for(i=0;i<lim;i++)
		{
			num[i]=scan.nextInt();
		}
		for(i=0;i<lim;i++)
		{
			large=num[i];
			for(j=i+1;j<lim;j++)
			{	
				if(large<num[j])
				{
					large=num[j];
				}
			
			}
			num[i]=large;
		}
		num[lim]=0;
		for (int k = 1; k < num.length; k++) {
			System.out.println(num[k]);
		}
		
		
	}
}
