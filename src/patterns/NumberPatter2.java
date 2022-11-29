package patterns;

import java.util.Scanner;

public class NumberPatter2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		int z = 2 * n - 1;
		while(i <= n) {
			int j = 1;
			int p = 1;
			while(j <= i) {
				System.out.print(p);
				p++;
				j++;
			}
			
			i++;
			System.out.println();
			
		}
		
		while(z >= n) {
			int k = n;
			int q = 1;
			while(k >= n) {
				System.out.print(q);
				q++;
				k--;
			}
			
			z--;
			System.out.println();
		}

	}

}
