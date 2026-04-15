import java.util.*;
public class LIS {
    int liss(int[] arr){
        int n=arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i] && dp[i]<dp[j]+1) dp[i]=dp[j]+1;
            }
        }
        int max=1;
        for(int i=0;i<n;i++){
            max=Math.max(max,dp[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={10,9,2,5,3,7,101,18};
        LIS l=new LIS();
        int s=l.liss(arr);
        System.out.println("LIS: "+s);
    }
}
