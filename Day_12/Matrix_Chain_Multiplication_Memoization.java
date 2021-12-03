package Day_12;

public class Matrix_Chain_Multiplication_Memoization {

	static int[][] dp = new int[100][100];
	public static int mcm(int[] arr,int i,int j) {
		if(i>=j) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int min = Integer.MAX_VALUE;
		for(int k = i;k<j;k++) {
			int temp = mcm(arr,i,k)+mcm(arr,k+1,j)+(arr[i-1]*arr[j]*arr[k]);
			min = Math.min(min, temp);
		}
		return dp[i][j]=min;
	}
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(mcm(arr,1,arr.length-1));
	}

}
