package array;

public class ArrangeNumbers {

	public static void arrange(int[] arr, int n) {
		int l = 1;
		int m = 2;
		

		for (int i = 0; i < n / 2; i++) {

			arr[i] = l;
			arr[n - i - 1] = m;
			l = l + 2;
			m = m + 2;

		}
		
		if (arr[n % 2] == 1) {
			arr[n / 2] = n;
		}
	}

	public static void main(String[] args) {
		int n = 1;
		int arr[] = new int[n];
		
		arrange(arr, 0);
		
		for (int i = 0; i <= arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
