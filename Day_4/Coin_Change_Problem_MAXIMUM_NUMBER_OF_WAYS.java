package Day_4;

public class Coin_Change_Problem_MAXIMUM_NUMBER_OF_WAYS {

	public static void main(String[] args) {
		int[] coin = {1,2,3};
		int sum = 4;
		int n = coin.length;
		int[][] dp = new int[n+1][sum+1];
		for(int i = 0;i<n+1;i++) {
			for(int j = 0;j<sum+1;j++) {
				if(i==0) {
					dp[i][j] = 0;
				}
				if(j==0)
				{
					dp[i][j] =1;
				}
			}
		}
		
		for(int i = 1;i<n+1;i++) {
			for(int j = 1;j<sum+1;j++) {
				if(coin[i-1]<=j) {
					dp[i][j] = dp[i][j-coin[i-1]]+dp[i-1][j];
				}
				else {
					dp[i][j] = dp[i-1][j];
				}
			}
		}
		System.out.println(dp[n][sum]);

	}

}
