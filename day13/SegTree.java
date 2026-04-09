import java.util.Arrays;

public class SegTree {
    static int[] tree;

    SegTree(int[] arr) {
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
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        SegTree s=new SegTree(arr);
        System.out.println(""+Arrays.toString(tree));
    }
    
}
