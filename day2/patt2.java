import java.util.*;
public class patt2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++) System.out.print("* ");
            //for(int j=1;j<=i;j++) System.out.print(i+" ");
            System.out.println();
        }
    }
}