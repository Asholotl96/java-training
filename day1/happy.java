import java.util.*;
public class happy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int a=sc.nextInt();
        int n=a;
        boolean h=false;
        while(true){
            int sum=0;
            while(n>0){
                int d=n%10;
                sum+=(d*d);
                n=n/10;
            }
            if(sum==1){
                h=true;
                break;
            }
            if(sum==a){
                break;
            }
            n=sum;
        }
        if(h){
            System.out.println("Happy no");
        }
        else System.out.println("Sad no");
    }
}