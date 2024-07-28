#include<stdio.h>
#include<bits/stdc++.h>
using namespace std;

// Memoization
int fib(int n, vector<int> dp) {
    if(n<=1) return n;
    if(dp[n] != -1) return dp[n];
    return dp[n] = fib(n-1, dp) + fib(n-2, dp);
}

// Tabulation Method 1
int fibo_dynamic(int n) {
    int dp[n+2];
    int i;
    dp[0] = 0;
    dp[1] = 1;
    for(i=2; i<=n; i++) {
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
}

int32_t main() {
    int n;
    cin >> n;

    // Tabulation approach 2 w/o using arrays
    int prev2 = 0;
    int prev1 = 1;
    for(int i=2; i<=n; i++) {
        int curri = prev1 + prev2;
        prev2 + prev1;
        prev1 = curri;
    }
    cout << prev1;

}
