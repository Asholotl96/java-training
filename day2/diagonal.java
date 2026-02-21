import java.util.*;
public class diagonal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int [][]a=new int[n][n];
        int num=1;
        for(int d=0;d<2*n-1;d++){
            //int r=d<n?d:n-1;
            //int c=d<n?0:d-n+1;
            // while(r>=0 && c<n){
            //     a[r][c]=num++;
            //     r--;
            //     c++;
            // }
            int c=d<n?d:n-1;
            int r=d<n?0:d-n+1;
            while(c>=0 && r<n){
                a[r][c]=num++;
                c--;
                r++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}