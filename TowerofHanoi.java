import java.util.Scanner;

public class TowerofHanoi {
   public static void main(String[] args) {
	   
       Scanner sn = new Scanner(System.in);
       int nDisks=sn.nextInt();
       System.out.println(nDisks);
       ToH(nDisks, 'A', 'B', 'C');
   }
   public static void ToH(int topN, char first,char middle, char last) {
      if (topN == 1){
         System.out.println("Disk 1 from "+ first + " to " + last);
      }else {
         ToH(topN - 1, first, last , middle);
         System.out.println("Disk "+ topN + " from " + first + " to " + last);
         ToH(topN - 1, middle, first, last);
      }
   }
}
