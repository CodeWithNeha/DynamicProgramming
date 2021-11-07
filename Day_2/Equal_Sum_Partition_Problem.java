package Day_2;

public class Equal_Sum_Partition_Problem {

	public static boolean subsetSum(int[] arr,int sum,int n) {
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
		return t[n][sum];
	}
	public static void main(String[] args) {
		int[] arr = {1,5,5,11};
		int n = arr.length;
		int sum = 0;
        for(int i = 0;i<n;i++) {
        	sum +=arr[i];
        }
        if(sum%2!=0) {
        	System.out.println("False");
        }
        else {
        	System.out.println(subsetSum(arr,sum/2,n));
        }
	}

}
