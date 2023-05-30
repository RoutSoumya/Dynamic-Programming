#include<stdio.h>
#include<bits/stdc++.h>
using namespace std;

// Memoization
int fib(int n, vector<int> dp) {
    if(n<=1) return n;
    if(dp[n] != -1) return dp[n];
    return dp[n] = fib(n-1, dp) + fib(n-2, dp);
}

// Tabulation
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
    cout << fibo_dynamic(n) << endl;

    // vector<int> dp(n+1, -1);
    // cout << fib(n, dp);
}