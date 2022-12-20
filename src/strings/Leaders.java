package strings;

import java.util.Stack;

class LeadersInArray {
	/* Java Function to print leaders in an array */
	void printLeaders(int arr[], int size) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[size - 1]);

		for (int i = size - 2; i >= 0; i--) {
			if (arr[i] >= stack.peek()) {
				stack.push(arr[i]);
			}
		}
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	/* Driver program to test above functions */
	public static void main(String[] args) {
		LeadersInArray lead = new LeadersInArray();
		int arr[] = new int[] { 16, 17, 4, 3, 5, 2 };
		int n = arr.length;
		lead.printLeaders(arr, n);
	}
}
