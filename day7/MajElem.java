import java.util.*;                         //Boyer Moore algorithm, entire array contains only 2 distinct values
public class MajElem {
    static int majority(int[] arr){
        int cnt=0;
        int candi=0;
        for(int num:arr){
            if(cnt==0) candi=num;
            if(num==candi) cnt++;
            else cnt--;
        }
        cnt=0;
        for(int num:arr){
            if(num==candi) cnt++;
            if(cnt>(arr.length/2)) return candi;
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
        System.out.println("Majority element: "+majority(arr));
    }
}
