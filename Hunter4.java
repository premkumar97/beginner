import java.util.ArrayList;
import java.util.Scanner;

public class Hunter4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int lim=scan.nextInt();
		int i;
		Integer[] a=new Integer[lim];
		for(i=0;i<lim;i++)
		{
			a[i]=scan.nextInt();
		}
		ArrayList<Integer> b=new ArrayList<>();
		for(i=0;i<lim;i++)
		{
			if(b.contains(a[i]))
			{
				b.remove(a[i]);
			}
			else
			{
				b.add(a[i]);
			}
		}
		System.out.println(b);

	}

}
