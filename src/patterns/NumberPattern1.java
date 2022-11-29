package patterns;

import java.util.Scanner;

public class NumberPattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		
		while(i <= n) {
			int space = 1;
			while (space <= n - i) {
				System.out.print(" ");
				space++;
			}
			
			int j = 1;
			int p = i;
			while (j <= i) {
				System.out.print(p);
				p++;
				j++;
			}
			
			i++;
			System.out.println();
		}

	}

}
