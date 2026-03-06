import java.util.Arrays;
import java.util.Scanner;

public class SelecSrt {
    static void selects(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int v=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[v]) v=j;
            }
            int t=arr[i];
            arr[i]=arr[v];
            arr[v]=t;
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
        selects(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    
}
