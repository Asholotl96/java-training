public class LCS {
    int lcss(String s1,String s2){
        int m=s1.length();
        int n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String s1="AGGTAB";
        String s2="GXTXAYB";
        LCS l=new LCS();
        int r=l.lcss(s1, s2);
        System.out.println("LCS: "+r);
    }
}
