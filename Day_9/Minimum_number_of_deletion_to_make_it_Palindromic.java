package Day_9;

public class Minimum_number_of_deletion_to_make_it_Palindromic {

	public static void main(String[] args) {
		String text1 = "abbcba";
		String text2 = "";
		int rev = text1.length()-1;
		while(rev>=0) {
			text2 +=text1.charAt(rev);
			rev--;
		}
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
		System.out.println(text1.length()-dp[text1.length()][text2.length()]);
		
	}

}
