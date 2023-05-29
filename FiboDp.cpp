#include<stdio.h>
#include<bits/stdc++.h>
using namespace std;

// DP Approach
int fibo_dynamic(int n) {
    int arr[n+2];
    int i;
    arr[0] = 0;
    arr[1] = 1;
    for(i=2; i<=n; i++) {
        arr[i] = arr[i-1] + arr[i-2];
    }
    return arr[n];
}

int32_t main() {
    int n;
    cin >> n;
    cout << fibo_dynamic(n) << endl;
}