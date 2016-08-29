package com;

import java.util.Scanner;
 public class StringReverseCase {
 public static void main(String[] args) {
	 int i,j;
	 Scanner an=new Scanner(System.in);
	 String a[]=an.nextLine().split(" ");
	 
	  
	 for(i=0;i<a.length;i++)
	 {
		 for(j=a[i].length()-1;j>=0;j--)
		 {
			 if(j==0)
				 System.out.print(a[i].toLowerCase().charAt(j));
			 else if(j==(a[i].length()-1))
					 System.out.print(a[i].toUpperCase().charAt(j));
			 else
				 System.out.print(a[i].charAt(j));
		
		 }
		 System.out.print(" ");
	 }
		 
		 
	 }
	 
} 
