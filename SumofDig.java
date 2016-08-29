package com;

import java.util.Scanner;
 public class SumofDig {
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
	   for(i=0;i<num1.length;i++)
	   {
		   
		   for(j=i;j>=0;j--)
		   {
			  
			   pow+=num1[j];
		   }
	   }
	   
	   
	   System.out.println(pow);
	   
	  }
	 
	 
 }
