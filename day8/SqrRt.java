import java.util.Scanner;

public class SqrRt {
    static int squart(int n){
        int l=0;
        int r=n;
        int a=0;
        while(l<=r){
            int m=l+(r-l)/2;
            if((long)m*m==n) return m;
            else if((long)m*m>n) r=m-1;
            else {a=m; l=m+1;}
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int res=squart(n);
        System.out.println("Sq root: "+res);
        sc.close();
    }
}
