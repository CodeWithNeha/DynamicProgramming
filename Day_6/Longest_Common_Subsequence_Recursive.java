package Day_6;

public class Longest_Common_Subsequence_Recursive {

	public static void main(String args[]) {
		String text1 = "abcde";
		String text2 = "ace";
		System.out.println(lcs(text1,text2,text1.length(),text2.length()));

	}

	public static int lcs(String text1, String text2, int i, int j) {
		if(i==0||j==0) {
			return 0;
		}
		if(text1.charAt(i-1)==text2.charAt(j-1)) {
			return 1+lcs(text1,text2,i-1,j-1);
		}
		else
		return Math.max(lcs(text1,text2,i-1,j), lcs(text1,text2,i,j-1));
	}
}
