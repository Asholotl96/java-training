import java.util.*;
public class LinSearch {
    static int linear(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to search: ");
        int key=sc.nextInt();
        int f=linear(arr, key);
        if(f==-1) {
            System.out.println("Key not found");
            return;
        }
        System.out.println("Key found at "+(f+1));
        sc.close();
    }
}
