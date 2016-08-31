import java.util.Scanner;

public class Hunter56 {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int lim=scan.nextInt();
		int num[]=new int[lim+1];
		int i,j,small,tot=0,num1=0,num2=0;
		for(i=0;i<lim;i++)	
		{
			num[i]=scan.nextInt();
		}
		small=num[0]-num[1];
		for(i=0;i<lim;i++)
		{
			tot=0;
			for(j=i+1;j<lim;j++)
			{
				tot=(num[j]>0)?num[i]-num[j]:num[i]+num[j];
				tot=tot<0?-tot:tot;
				
				if(small>tot)
				{
				
					small=tot;
					num1=num[i];
					num2=num[j];
				}
			}
		}
		System.out.println(+num1+" "+num2);
	}

}
