import java.util.Scanner;

public class MiddleSum {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int ar[][];
		int sum = 0;
		System.out.println("Enter the Number of Rows");
		int r = s.nextInt();
		System.out.println("Enter the Number of Columns");
		int c = s.nextInt();
		if (r == c) {
			System.out.println("Enter the Matrix Elements for " + r + " rows and " + c + " Columns");
			ar = new int[r][c];
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					ar[i][j] = s.nextInt();
				}
			}
			
			for (int i = 1; i < r - 1; i++) {
				for (int j = 1; j < c - 1; j++) {

					sum += ar[i][j];
				}

			}
			System.out.println("The Middle Sum is : " + sum);
		} else {
			System.out.println("Enter Same number of Rows and Columns");
		}

	}

}
