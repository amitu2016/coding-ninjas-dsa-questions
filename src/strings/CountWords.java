package strings;

public class CountWords {
	
	public static int countWords(String str) {	
		
		int count = 0;
		
		String[] strArray =   str.split(" ");
		
		
		count = strArray.length;
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countWords("This is a cat"));
	}

}
