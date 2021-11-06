package Day_1;

public class Knapsack0_1_Recursive {

	public static void main(String[] args) {
		int[] val = {1,6,18,22,28};
		int[] wt = {1,2,5,6,7};
		int W = 11;
		int n = val.length;
		System.out.println(Knapsack(wt,val,W,n));

	}

	public static int Knapsack(int[] wt, int[] val, int W, int n) {
		if(n==0||W==0) {
			return 0;
		}
		
		if(wt[n-1]<=W) {
			return  Math.max(val[n-1]+Knapsack(wt,val,W-wt[n-1],n-1), Knapsack(wt,val,W,n-1));
		}
		else
		return Knapsack(wt,val,W,n-1);
	}

}
