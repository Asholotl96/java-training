import java.util.*;
public class pattown{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=sc.nextInt();
        int s=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++) System.out.print(" ");
            for(int k=0;k<s;k++) System.out.print("*");
            s+=2;
            System.out.println();
        }
    }
}