package Day_2;

import java.util.ArrayList;

public class Minimum_Subset_Sum_Difference {

	public static int miniSub(int[] arr,int sum,int n) {
		boolean[][] t = new boolean[n+1][sum+1];
		for(int i = 0;i<n+1;i++) {
			for(int j = 0;j<sum+1;j++) {
				if(i==0) {
					t[i][j] = false;
				}
				if(j==0) {
					t[i][j] = true;
			}
		}
		}
		for(int i = 1;i<n+1;i++) {
			for(int j = 1;j<sum+1;j++) {
				if(arr[i-1]<=j) {
					t[i][j] = t[i-1][j-arr[i-1]]|| t[i-1][j];
				}
				else {
					t[i][j]=t[i-1][j];
				}
			}
		}
	     ArrayList<Integer> al = new ArrayList<>();
	     for(int j = 0;j<(sum+1)/2;j++) {
	    	 if(t[n][j]==true) {
	    		 al.add(j);
	    	 }
	     }
	     int min = Integer.MAX_VALUE;
	     for(int i=0;i<al.size();i++) {
	    	 min = Math.min(min, sum-2*al.get(i));
	     }
	     return min;
	
	}
	public static void main(String[] args) {
		int[] arr = {1,2,7};
		int n = arr.length;
		int range = 0;
		for(int i = 0;i<n;i++) {
			range +=arr[i];
		}
		System.out.println(miniSub(arr,range,n));
		}

}
