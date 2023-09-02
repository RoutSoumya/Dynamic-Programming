import java.util.*;

class CountofSubsetInAsum {

    public static int CountofSubset(int arr[], int sum, int n) {
        int dp[][] = new int[n+1][sum+1];
        for(int i=0; i<=n; i++) {
            int count = 0;
            for(int j=0; j<=sum; j++) {
                if(n==0 || sum==0) {
                    return dp[i][j];
                }
                else if(arr[i-1] <= j) {
                    return dp[i][j] = dp[i][j-arr[i-1]] + dp[i-1][j];
                    count++;
                }
                else {
                    return dp[i][j] = dp[i-1][j];
                }
            }
        }
        //return dp[n][sum];
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 8 ,10};
        int sum = 10;
        int n = arr.length;
        int ans = CountofSubset(arr, sum, n);
        System.out.println(ans);
    }
}