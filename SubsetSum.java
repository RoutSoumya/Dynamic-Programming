import java.util.*;
class SusetSum {

    public static int ss(int[] arr,int sum, int n) {
        int dp[][] = new int[arr+1][sum+1];
        for(int i=0; i<=arr; i++) {
            for(int j=0; j<=sum; j++) {
                if(n==0 || sum==0) {
                    return dp[i][j];
                }
                else if(arr[i-1] <= j) {
                    return dp[i][j] = dp[i][j-arr[i-1]] || dp[i-1][j];
                }
                else {
                    return dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int[] arr = {1,5,11,5};
        int sum = 11;
        int ans = ss(arr, sum);
        System.out.println(ans);
    }
}