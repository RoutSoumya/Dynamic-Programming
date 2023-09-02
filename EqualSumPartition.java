import java.io.*;
import ss;
class EqualSumPartition {

    static boolean esm(int[] arr, int n) {
        for(int i=0; i<=n; i++) {
            int sum = 0;
            sum += arr[i];
        }
        if(sum%2 != 0) {
            return false;
        }
        else {
            int half = sum / 2;
            return ss(arr, half, n);
            return true;
        }
    }

    static void boolean ss(int[] arr,int sum, int n) {
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
        int n = 11;
        int ans = esm(arr, n);
        System.out.println(ans);
    }
}