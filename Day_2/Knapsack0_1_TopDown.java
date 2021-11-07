package Day_2;

public class Knapsack0_1_TopDown {

	public static void main(String[] args) {
		int[] val = {1,6,18,22,28};
		int[] wt = {1,2,5,6,7};
		int W = 11;
		int n = val.length;
		int[][] t = new int[n+1][W+1];
		for(int i = 0;i<n+1;i++) {
			for(int j = 0;j<W+1;j++) {
				if(i==0||j==0) {
					t[i][j] = 0;
				}
			}
		}
		for(int i = 1;i<n+1;i++) {
			for(int j = 1;j<W+1;j++) {
				if(wt[i-1]<=j) {
					t[i][j] = Math.max(val[i-1]+t[i-1][j-wt[i-1]], t[i-1][j]);
				}
				else {
					t[i][j]=t[i-1][j];
				}
			}
		}
		System.out.println(t[n][W]);
	}

}
