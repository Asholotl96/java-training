import java.util.Arrays;

public class CoinCh {
    int CCh(int[] coins,int amt){
        int[] dp=new int[amt+1];
        Arrays.fill(dp,amt+1); //inf
        dp[0]=0;
        for(int i=1;i<=amt;i++){
            for(int c:coins){
                if(c<=i) dp[i]=Math.min(dp[i],1+dp[i-c]);
            }
        }
        return dp[amt]>amt?-1:dp[amt];
    }
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amt=11;
        CoinCh cc=new CoinCh();
        int r=cc.CCh(coins, amt);
        System.out.println("CCh: "+r);
    }
}
