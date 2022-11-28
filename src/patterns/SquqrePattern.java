package patterns;

public class SquqrePattern {

	public static void printPattern(int n) {

		int arr[][] = new int[n][n];
		int k1 = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = k1;
				k1++;
			}
		}

		int k = 0, m = n - 1;

		int l = 0;
		if (n % 2 == 0)
			m = n - 1;
		else
			m = n;

		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n; j++) {
				System.out.format("%3d", arr[k][j]);
			}
			System.out.println("");
			l = l + 2;
			k = l;
		}
		
		k = n - 1;
		for (int i = n / 2; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.format("%3d", arr[k][j]);
			}
			m = m - 2;
			k = m;
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
