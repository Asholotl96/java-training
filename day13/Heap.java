
import java.util.Arrays;

public class Heap {
    public static void heapify(int[] arr, int n, int i){
        int largest=i;
        int l=2*i+1;
        int r=2*i+2;
        if(l<n && arr[l]>arr[largest]) largest=l;
        if(r<n && arr[r]>arr[largest]) largest=r;
        if(largest!=i){
            int t=arr[i];
            arr[i]=arr[largest];
            arr[largest]=t;
            heapify(arr, n, largest);
        }
    }
    public static void hsort(int arr[]){
        int n=arr.length;
        for(int i=n/2 -1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i=n-1;i>=0;i--){
            int t=arr[0];
            arr[0]=arr[i];
            arr[i]=t;
            heapify(arr,i,0);
        }
    }
    public static void main(String[] args) {
        /*PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());   INSTEAD OF HEAPSORT AND HEAP METHODS
          for max heap: new PriorityQueue<>(Collections.reverseOrder());
          for min heap: new PriorityQueue<>();  */
        int[] arr={4,10,3,5,1};
        hsort(arr);
        System.out.println(""+Arrays.toString(arr));
    }
}
