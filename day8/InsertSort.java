import java.util.Arrays;
import java.util.Scanner;

public class InsertSort {
    static void inserts(int[] arr){
        for(int i=1;i<arr.length;i++){
            int k=arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>k;j--){
                arr[j+1]=arr[j];
            }
            arr[j+1]=k;
        }
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
        inserts(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }    
}
