package Day_13;

public class Optimization_Of_Palindrome_Partitioning {


	static int[][] dp = new int[1001][1001];
	public static int solve(String s,int i,int j) {
		if(i>=j||isPalindrome(s,i,j)) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int min = Integer.MAX_VALUE;
		for(int k = i;k<j;k++) {
			int left = 0,right = 0;
			if(dp[i][k]!=0) {
				left = dp[i][k];
			}
			else {
				left = solve(s,i,k);
				dp[i][k] = left;
			}
			if(dp[k+1][j]!=0) {
				right = dp[k+1][j];
			}
			else {
				 right = solve(s,k+1,j);
				dp[k+1][j] = right;
			}
			int temp = left+ right+1;
			min= Math.min(min, temp);
			//System.out.println(min);
		}
		return dp[i][j]= min;
	}
	private static boolean isPalindrome(String s, int i, int j) {
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s = "coder";
		System.out.println(solve(s,0,s.length()-1));
		//System.out.println(isPalindrome(s,0,s.length()-1));

	}

}
