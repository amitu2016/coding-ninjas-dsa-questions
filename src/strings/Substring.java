package strings;

public class Substring {

	public static void printSubstrings(String str) {
		String [] strArr = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
			strArr[i] = (String) str.subSequence(str.indexOf(str.substring(i)), i);
		}
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
	
	public static void main(String[] args) {
		printSubstrings("abc");

	}

}
