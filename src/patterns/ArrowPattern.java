package patterns;

import java.util.Scanner;

public class ArrowPattern {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= (n+1)/2; i++) {
			
			for(int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= n/2; i++) {
			
			for(int j = 1; j <= (n/2) - i; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= (n/2) - i  + 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
