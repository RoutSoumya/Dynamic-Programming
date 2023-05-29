#include<stdio.h>
#include<bits/stdc++.h>
using namespace std;

// Recursive
int fibo(int n) {
    if(n<=1) {
        return n;
    }
    return fibo(n-1) + fibo(n-2);
}

int32_t main() {
    int n;
    cin >> n;
    cout << fibo(n) << endl;
    getchar();
}