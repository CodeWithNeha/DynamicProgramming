package Day_5;

public class Coin_Change_Problem_Minimum_Number_Of_Coin {

	public static void main(String[] args) {
		int[] coin = {3,5,2};
		int sum = 5;
		int n = coin.length;
		int[][] dp = new int[n+1][sum+1];
		for(int i = 0;i<n+1;i++) {
			for(int j = 0;j<sum+1;j++) {
				
				if(i==0) {
					dp[i][j] = Integer.MAX_VALUE-1;
				}
				if(j==0){
					dp[i][j] = 0;
				}
			}
		}
		for(int j = 1;j<sum+1;j++) {
			if(j%coin[0]==0) {
				dp[1][j] = j/coin[0];
			}
			else {
				dp[1][j] = Integer.MAX_VALUE-1;
			}
		}
		
		for(int i = 2;i<n+1;i++) {
			for(int j = 1;j<sum+1;j++) {
				if(coin[i-1]<=j) {
					dp[i][j] = Math.min(1+dp[i][j-coin[i-1]], dp[i-1][j]);
				}
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		System.out.println(dp[n][sum]);
	}

}
