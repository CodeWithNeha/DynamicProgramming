package Day_7;

public class Longest_Common_Substring {

	public static void main(String[] args) {
		String text1 = "abcdegh";
		String text2 = "abfcegh";
		int[][] dp = new int[text1.length()+1][text2.length()+1];
		for(int i = 0;i<text1.length()+1;i++) {
			for(int j = 0;j<text2.length()+1;j++) {
				if(i==0||j==0) {
					dp[i][j]=0;
				}
			}
		}
		int max = 0;
		for(int i = 1;i<text1.length()+1;i++) {
			for(int j = 1;j<text2.length()+1;j++) {
				if(text1.charAt(i-1)==text2.charAt(j-1)) {
					dp[i][j] = 1+dp[i-1][j-1];
				}
				else
			     dp[i][j] = 0;
				max = Math.max(dp[i][j],max);
			}
			
		}
		System.out.println(max);
	}

}
