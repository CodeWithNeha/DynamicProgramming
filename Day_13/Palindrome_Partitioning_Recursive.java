package Day_13;

public class Palindrome_Partitioning_Recursive {

	public static int solve(String s,int i,int j) {
		if(i>=j||isPalindrome(s,i,j)) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for(int k = i;k<j;k++) {
			int temp = solve(s,i,k)+solve(s,k+1,j)+1;
			min= Math.min(min, temp);
			//System.out.println(min);
		}
		return min;
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
		String s = "ababbbabbababa";
		System.out.println(solve(s,0,s.length()-1));
		//System.out.println(isPalindrome(s,0,s.length()-1));

	}

}
