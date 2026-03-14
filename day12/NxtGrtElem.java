
import java.util.*;

public class NxtGrtElem {
    public int[]  nextBigElem(int[] arr){
        int n=arr.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);
        ArrayDeque<Integer> st=new ArrayDeque<>();
        for(int i=0;i<2*n;i++){
            int num=arr[i%n];
            while(!st.isEmpty() && arr[st.peek()]<num) res[st.pop()]=num;
            if(i<n) st.push(i);
        }
        return res;
    }
    public static void main(String[] args) {
        NxtGrtElem sol=new NxtGrtElem();
        int[] arr={1,2,3,4,3};
        int[] res=sol.nextBigElem(arr);
        System.out.println(Arrays.toString(res));
    } 
}
