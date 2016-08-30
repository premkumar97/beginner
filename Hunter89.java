import java.util.Scanner;

public class Hunter89 {

 public static void main(String[] args){

	 Scanner scan=new Scanner(System.in);
			 
	  String[] words=scan.nextLine().split(",");
	   
	     int[] fr=new int[words.length];
	   
	     for(int i=0;i<fr.length;i++)
	       fr[i]=0;
	   
	     for(int i=0;i<words.length;i++){
	       for(int j=0;j<words.length;j++){
	         if(words[i].equals(words[j])) 
	           {
	             fr[i]++;

	                }
	            }
	           }

	   
	       for(int i=0;i<words.length;i++){
	         for(int j=0;j<words.length;j++){
	           if(words[i].equals(words[j])) 
	           {
	             if(i!=j) words[i]="";

	           }
	     }
	     }

	

	int total=0;
	
	for(int i=0;i<words.length;i++){

	if(words[i]!=""){


	System.out.println(words[i]+"="+fr[i]);

	total+=fr[i];

	}

	



   }
 }
 

}
