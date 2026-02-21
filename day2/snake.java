import java.util.*;
public class snake{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int [][]a=new int[n][n];
        int num=1;
        for(int i=0;i<n;i++){
            if(i%2==0) for(int j=0;j<n;j++) a[i][j]=num++;
            else for(int j=n-1;j>=0;j--) a[i][j]=num++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}