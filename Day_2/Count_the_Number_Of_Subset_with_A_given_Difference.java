package Day_2;

import java.util.ArrayList;

public class Count_the_Number_Of_Subset_with_A_given_Difference {

	public static int countSum(int[] arr,int sum) {
		int n = arr.length;
		int[][] t = new int[n+1][sum+1];
		for(int i = 0;i<n+1;i++) {
			for(int j = 0;j<sum+1;j++) {
				if(i==0) {
					t[i][j] = 0;
				}
				if(j==0) {
					t[i][j] = 1;
			}
		}
		}
		for(int i = 1;i<n+1;i++) {
			for(int j = 1;j<sum+1;j++) {
				if(arr[i-1]<=j) {
					t[i][j] = t[i-1][j-arr[i-1]]+ t[i-1][j];
				}
				else {
					t[i][j]=t[i-1][j];
				}
			}
		}
		return t[n][sum];
	}
	public static void main(String[] args) {
		int[] arr = {1,1,2,3};
		int n = arr.length;
		int diff = 1;
		int range = 0;
		for(int i = 0;i<n;i++) {
			range +=arr[i];
		}
		int sum = (diff+range)/2;
		System.out.println(countSum(arr,sum));
		}


}
