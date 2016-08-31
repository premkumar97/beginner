package pro;

import java.util.Scanner;

public class Pro25Keybit {
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int bit=scan.nextInt();
		int a=(int) Math.pow(2, bit);
		
		for(int i=0;i<a-1;i++)
		{
			System.out.println(Integer.toBinaryString(i));
		}
	}
}
