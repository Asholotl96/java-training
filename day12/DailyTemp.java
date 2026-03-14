//Leetcode 739
import java.util.*;
public class DailyTemp {
    public int[] dailyTemps(int[] arr) {
        int n=arr.length;
        int[] res=new int[n];
        ArrayDeque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            int num=i;
            while(!st.isEmpty() && arr[st.peek()]<arr[num]) res[st.peek()]=i-st.pop();
            if(i<n) st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] temp={73,74,75,71,69,72,76,73};
        DailyTemp sol=new DailyTemp();
        int[] res=sol.dailyTemps(temp);
        System.out.println(Arrays.toString(res));
    }
}
