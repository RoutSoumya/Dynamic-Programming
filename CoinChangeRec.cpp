#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int count(int coins[], int n, int sum) {
    if(sum == 0) {
        return 1; // No coins
    }
    if(sum < 0) {
        return 0; // No solution
    }
    if(n <= 0) {
        return 0; // If no coins and sum > 0 then no coins
    }
    return count(coins, n-1, sum) + count(coins, n, sum - coins[n-1]);
}

int32_t main() {
    int i,j;
    int coins[] = { 1, 2, 3 };
    int n = sizeof(coins) / sizeof(coins[0]);
    int sum = 4;
    cout << " " << count(coins, n, sum) << endl;
}