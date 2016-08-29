package com;

import java.util.Scanner;
 public class NumberSum {
	 public static void main(String[] args)
	  {
	   int i,j,pow=0;     
	   Scanner scan = new Scanner(System.in);
	   String[] num=scan.nextLine().split("");
	   int []num1=new int[num.length];
	   for(i=0;i<num.length;i++)
	   {
		 num1[i]=Integer.parseInt(num[i]);
	   }
	   {
		   System.out.println(num[i]);
		   for(j=i;j>=0;j--)
		   {
			   System.out.println(num[j]);
			   pow+=num1[j];
		   }
	   }
	   
	   
	   System.out.println(pow);
	   
	  }
	 
	 
 }
