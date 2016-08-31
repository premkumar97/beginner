import java.util.Scanner;

public class Hunter12 {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		float height[]=new float[50];
		int i,j;
		float temp;
		for(i=0;i<50;i++)
		{
			height[i]=scan.nextFloat();
		}
		for(i=0;i<50;i++)
		{
			for(j=i+1;j<50;j++)
			{
				if(height[i]<height[j])
				{
					temp=height[i];
					height[i]=height[j];
					height[j]=temp;
					
				}
			}
		}
		System.out.println("The 4th Tallest Student Height: "+height[3]);
		i=scan.nextInt();
		System.out.println(height[i]);
	}
}
