import java.util.*;
public class RotbyD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of arr: ");
        int n=sc.nextInt();
        System.out.println("Enter rotate by d: ");
        int d=sc.nextInt();
        d=d%n;
        System.out.println("Enter array: ");
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int[] rot=new int[n];
        for(int i=0;i<n;i++){
            rot[(i+d)%n]=arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(rot[i]+" ");
        }
    }
}
/*
1 2 3 4 5
> 5 4 3 2 1
> 4 5 3 2 1
> 4 5 1 2 3
*/