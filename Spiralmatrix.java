package prem;

import java.util.ArrayList;
import java.util.Scanner;

public class Spiralmatrix {
	public static void main(String args[]){
		Spiralmatrix s=new Spiralmatrix();
		
		Scanner a= new Scanner(System.in);
		int row=a.nextInt();
		int val[][] = new int[row][row];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				val[i][j]= a.nextInt();
			}
		}
		System.out.println(s.spiralOrder(val));
	}
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<Integer>();
 
        if(matrix == null || matrix.length == 0) return result;
 
        int m = matrix.length;
        int n = matrix[0].length;
 
        int x=0; 
        int y=0;
 
        while(m>0 && n>0){
 
            
            if(m==1){
                for(int i=0; i<n; i++){
                    result.add(matrix[x][y++]);
                }
                break;
            }else if(n==1){
                for(int i=0; i<m; i++){
                    result.add(matrix[x++][y]);
                }
                break;
            }
 
            
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y++]);
            }
 
            
            for(int i=0;i<m-1;i++){
                result.add(matrix[x++][y]);
            }
 
            
            for(int i=0;i<n-1;i++){
                result.add(matrix[x][y--]);
            }
 
            
            for(int i=0;i<m-1;i++){
                result.add(matrix[x--][y]);
            }
 
            x++;
            y++;
            m=m-2;
            n=n-2;
        }
 
        return result;
    }
}
