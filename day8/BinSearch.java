import java.util.Scanner;

public class BinSearch {
    static int binarys(int[] arr, int key){
        int l=0;
        int r=arr.length;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==key) return m;
            else if(arr[m]>key) r=m-1;
            else l=m+1;
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
        System.out.println("Enter key: ");
        int key=sc.nextInt();
        int f=binarys(arr, key);
        if(f==-1) {
            System.out.println("Key not found");
            return;
        }
        System.out.println("Key found at "+(f+1));
        sc.close();
    }
    
}
