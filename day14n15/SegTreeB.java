import java.util.Arrays;

public class SegTreeB {
    static int[] tree;

    @SuppressWarnings("OverridableMethodCallInConstructor")
    SegTreeB(int[] arr) {
        tree=new int[4*arr.length];
        build(arr,0,0,arr.length-1);
    }
    void build(int[] arr, int node, int start, int end){
        if(start==end){
            tree[node]=arr[start];
        }else{
            int mid=(start+end)/2;
            build(arr,2*node+1, start,mid);
            build(arr, 2*node+2, mid+1,end);
            tree[node]=Math.max(tree[2*node+1],tree[2*node+2]);
        }
    }

    @SuppressWarnings("unused")
    int query(int node, int start, int end, int l, int r){
        if(r<start || end<l) return Integer.MIN_VALUE;
        if(l<=start && end<r) return tree[node];
        int mid=(start+end)/2;
        return Math.max(query(2*node+1, start, mid, l, r),query(2*node+2, mid+1, end, l, r));
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,3,8};
        @SuppressWarnings("unused")
        SegTreeB s=new SegTreeB(arr);
        System.out.println(""+Arrays.toString(tree));
    }
    
}
