import java.util.Scanner;
public class Leastnumber{
     public static void main(String []args){
    	 int n,dig,size=0,i,j,temp,ans=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        n = s.nextInt();
        System.out.println("Enter the k value");
        dig=s.nextInt();
        int sol[]=new int[100];
        for (j = 0;n>0; j++) 
        {  
        sol[j]=n%10;  
        n=n/10;  
        size++;
        }
        for(i=0;i<size;i++)
        {
            for(j=i;j<size;j++)
            {
                if(sol[i]>sol[j])
                {
                   temp=sol[j];
                   sol[j]=sol[i];
                   sol[i]=temp;
                }
                
        
            }
        }
        
        	for(i=0;i<size-dig;i++)
            {
               ans=ans*10+sol[i];
                
                
            }
        
        System.out.println(ans);
        
        
        
           
     }
}
