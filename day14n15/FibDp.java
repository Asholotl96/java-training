public class FibDp {
    int fibo(int n,int[] dp){
        if(n<=1) return n;
        if(dp[n]!=-1) return dp[n];
        dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
        return dp[n];
    }
    int fib(int n){
        int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++) dp[i]=-1;
        int r=fibo(n,dp);
        return r;
    }
    public static void main(String[] args) {
        FibDp f=new FibDp();
        int r=f.fib(7);
        System.out.println("Fib(7) using DP: "+r);
    }
}
