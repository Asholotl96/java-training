
/*
compromise between linear and binary search
used on sorted array w/ regular set of values(regular interval)
*/

import java.util.Scanner;

public class JumpSrch {
    static int jumps(int[] arr,int key){
        int p=0;
        int n=arr.length;
        int j=(int)Math.sqrt(n);
        int jp=j;
        while(p<n && arr[Math.min(jp,n)-1]<key){
            p=j;
            jp+=j;
            if(p>=n){
                return -1;
            }
        }
        for(int i=p;i<Math.min(jp,n);i++){
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
        System.out.println("Enter key: ");
        int key=sc.nextInt();
        int f=jumps(arr, key);
        if(f==-1) {
            System.out.println("Key not found");
            return;
        }
        System.out.println("Key found at "+(f+1));
        sc.close();
    }
}
