import java.util.Scanner;

public class Hunter40{  
 public static void main(String args[]){
	 Scanner scan=new Scanner(System.in);
  int r,sum=0,temp;    
  int n=scan.nextInt();  
  
  temp=n;    
  while(n>0){    
   r=n%10;    
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  