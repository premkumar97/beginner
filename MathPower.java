import java.util.*;
public class Hunter105 {
	public static void main(String args[]){
	Scanner scan = new Scanner(System.in);
	int a=scan.nextInt();
	int b=1;
	int sum=0;
	int y=b;
	
	while(a!=0)
	{
	b=a%10;
	sum=sum+(int)Math.pow(b,y);
	a=a/10;
	y=b;
	

	}
	System.out.println(sum);
	}
}

