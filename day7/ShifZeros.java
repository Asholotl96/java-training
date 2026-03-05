import java.util.*;
public class ShifZeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        System.out.println("Enter array elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // for(int i=0;i<n;i++){
        //     int t;
        //     if(arr[i]==0){
        //         t=arr[i];
        //         for(int j=i;j<n-1;j++){     (n^2 complexity)
        //             arr[j]=arr[j+1];
        //         }
        //         arr[n-1]=t;
        //     }
        // }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                if(i==j){ j++; continue;}
                arr[i]=arr[i]+arr[j];
                arr[j]=arr[i]-arr[j];
                arr[i]=arr[i]-arr[j++];
            }
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
