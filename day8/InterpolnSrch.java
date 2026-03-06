/*
used on sorted array w/ evenly distributed elems. uses a formula to find the target elem.
*/

import java.util.Scanner;

public class InterpolnSrch {
    static int interpol(int[] arr, int key){
        int l=0;
        int r=arr.length-1;
        while(l<=r && key>=arr[l] && key<=arr[r]){
            if(l==r){
                if(arr[l]==key) return l;
                else return -1;
            }
            int p=l+((key-arr[l])*(r-l))/(arr[r]-arr[l]);
            if(arr[p]==key) return p;
            else if(arr[p]<key) l=p+1;
            else r=p-1;
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
        int f=interpol(arr, key);
        if(f==-1) {
            System.out.println("Key not found");
            return;
        }
        System.out.println("Key found at "+(f+1));
        sc.close();
    }
}
