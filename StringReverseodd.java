package com;

import java.util.Scanner;
 public class StringReverseodd {
 public static void main(String[] args) {
	 int i,j;
	 Scanner an=new Scanner(System.in);
	 String a[]=an.nextLine().split(" ");
	 
	  
	 for(i=0;i<a.length;i++)
	 {
		 if(i%2==1)
			 System.out.print(a[i]);
		 else
		 {
		 for(j=a[i].length()-1;j>=0;j--)
		 {

			  System.out.print(a[i].charAt(j));
		 }
		 
		 }
		 System.out.print(" ");
		 
	 }
	 
} 
}
