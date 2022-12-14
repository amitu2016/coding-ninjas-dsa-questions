package patterns;


public class ConcentricSquare
{

//Function to
//print the pattern
static void printPattern(int n)
{
	// number of rows and
	// columns to be printed
	int s = 2 * n - 1;

	// Upper Half
	for (int i = 0;
			i < (s / 2) + 1; i++)
	{
		int m = n;

		// Decreasing part
		for (int j = 0; j < i; j++)
		{
			System.out.print(m + " ");
			m--;
		}

		// Constant Part
		for (int k = 0;
				k < s - 2 * i; k++)
		{
			System.out.print(n - i + " ");
		}

		// Increasing part.
		m = n - i + 1;
		for (int l = 0; l < i; l++)
		{
			System.out.print(m + " ");
			m++;
		}

		System.out.println();
	}

	// Lower Half
	for (int i = s / 2 - 1;
			i >= 0; i--)
	{

		// Decreasing Part
		int m = n;
		for (int j = 0; j < i; j++)
		{
			System.out.print(m + " ");
			m--;
		}

		// Constant Part.
		for (int k = 0;
				k < s - 2 * i; k++)
		{
			System.out.print(n - i + " ");
		}

		// Decreasing Part
		m = n - i + 1;
		for (int l = 0; l < i; l++)
		{
			System.out.print(m + " ");
			m++;
		}
		System.out.println();
	}
}
//Driver Code
public static void main (String[] args)
{
	int n = 3;

	printPattern(n);
}
}



