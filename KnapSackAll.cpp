#include<iostream>
using namespace std;

// RECURSION
int max(int a, int b) { return (a>b) ? a:b ; }
int knapSack(int W, int wt[] ,int val[], int n) {
    if(n==0 || W==0) return 0;
    if(wt[n-1] > W) return knapSack(W, wt, val, n-1);
    else return max(val[n-1] + knapSack(W-wt[n-1],wt,val,n-1),
    knapSack(W,wt,val,n-1));
}

// MEMOIZATION
int knapSackRec(int W, int wt[], int val[], int i, int **dp) {
    if(i<0) return 0;
    if(dp[i][W] != -1) return dp[i][W];
    if(wt[i] > W) {
        dp[i][W] = knapSackRec(W,wt,val,i-1,dp);
        return dp[i][W];
    }
    else {
        dp[i][W] = max(val[i] + knapSackRec(W-wt[i],wt,val,i-1,dp),
        knapSackRec(W,wt,val,i-1,dp));
        return dp[i][W];
    }
}
 
int knapSackMem(int W, int wt[], int val[], int n) {
    int **dp;
    dp = new int*[n];
    for(int i=0; i<n; i++) {
        for(int j=0; j<=W+1; j++) {
            dp[i][j] = -1;
        }
    }
    return knapSackRec(W,wt,val,n-1,dp);
}

int main() {
    int val[] = {1,4,5,7};
    int wt[] = {1,3,4,5};
    int W = 7;
    int n = sizeof(val)/sizeof(val[0]);
    // cout << knapSack(W,wt,val,n) << endl; //Recursion Call
    cout << knapSackMem(W,wt,val,n) << endl; //Memoization Call
    return 0;
}