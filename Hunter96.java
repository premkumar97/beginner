import java.util.Scanner;

public class Hunter96 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String[] s1 = str1.split(" ");
		int cou = 0;
		int a = 0;
		int a1 = 0;
		for (String str2 : s1) {
			cou++;
		}

		for (int i = 0; i < cou; i++) {
			int count = s1[i].length();
			String str3 = "";
			char[] st = new char[count];
			char x = s1[i].charAt(count - 1);
			if (x >= 64 && x <= 94) {
				a = x - 64;
				
			} else if (x >= 96 && x <= 128) {
				a1 = x - 96;
				
			}
			for (int j = 0; j < count - 1; j++) {
				st[j] = s1[i].charAt(j);
				if (st[j] >= 64 && st[j] <= 94) {
					st[j] -= a;
					if(st[j]<=64){
						st[j]+=26;
					}
					else if(st[j]>=95){
						st[j]-=26;
					}
				} else if (st[j] >= 96 && st[j] <= 128){
					st[j] -= a1;
					if(st[j]<=96){
						st[j]+=26;
					}
					else if(st[j]>=128){
						st[j]-=26;
					}
				}
			}
			for (int k = 0; k < count; k++) {
				str3 += st[k];
			}
			System.out.print(str3 + x + " ");
		}

	}

}
