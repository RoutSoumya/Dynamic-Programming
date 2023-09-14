class KnapSack_Rec {
    public static int max(int a, int b) {
        if(a>b) return a;
        else return b;
    }
    public static int ks(int[] wt, int[] val, int W, int n) {
        if(W==0 || n==0) return 0;
        if (wt[n-1] <= W) {
            return max(val[n-1] + ks(wt, val, W-wt[n-1], n-1), ks(wt,val, W, n-1));
        }
        else if(wt[n-1] > W) {
            return ks(wt, val, W, n-1);
        }
        return ks(wt, val, W, n-1);
    }

    public static void main(String[] args) {
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int W = 7;
        int n = val.length;
        int ans = ks(wt, val, W, n);
        System.out.println(ans);
    }
}