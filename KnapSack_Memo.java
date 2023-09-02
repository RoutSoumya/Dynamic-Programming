import java.io.*;
class KnapSack_Memo {

    public static int max(int a, int b) {
        return (a>b) ? a:b;
    }

    public static int matrix(int[] wt, int[] val, int W, int n) {
        int[][] dp = new int[n+1][W+1];
        for(int i=0; i<n; i++) {
            for(int j=0; j<W; j++) {
                dp[i][j] = -1;
            }
        }
        return ks(wt, val, W, n, dp);
    }

    public static int ks(int[] wt, int[] val, int W, int n, int[][] dp) {
        if(W==0 || n==0) return 0;
        if (dp[n][W] != -1) return dp[n][W];
        if (wt[n-1] <= W) {
            return dp[n][W] = max(val[n-1] + ks(wt, val, W-wt[n-1], n-1, dp), ks(wt,val, W, n-1, dp));
        }
        else if(wt[n-1] > W) {
            return dp[n][W] = ks(wt, val, W, n-1, dp);
        }
        return dp[n][W] = ks(wt, val, W, n-1, dp);
    }

    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int W = 7;
        int n = val.length;
        int ans = matrix(wt, val, W, n);
        System.out.println(ans);
    }
}