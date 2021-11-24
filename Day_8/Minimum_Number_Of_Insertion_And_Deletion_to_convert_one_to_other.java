package Day_8;

public class Minimum_Number_Of_Insertion_And_Deletion_to_convert_one_to_other {

	public static void main(String[] args) {
		String text1 = "heap";
		String text2 = "pea";
		int[][] dp = new int[text1.length()+1][text2.length()+1];
		for(int i = 0;i<text1.length()+1;i++) {
			for(int j = 0;j<text2.length()+1;j++) {
				if(i==0||j==0) {
					dp[i][j]=0;
				}
			}
		}
		for(int i = 1;i<text1.length()+1;i++) {
			for(int j = 1;j<text2.length()+1;j++) {
				if(text1.charAt(i-1)==text2.charAt(j-1)) {
					dp[i][j] = 1+dp[i-1][j-1];
				}
				else
			     dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
			}
		}
		int in = text2.length()-dp[text1.length()][text2.length()];
		int de = text1.length()-dp[text1.length()][text2.length()];
		System.out.println("Insertion :- "+in+"\nDeletion :- "+de);
	}

}
