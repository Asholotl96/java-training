import java.util.*;
public class strong{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int n=sc.nextInt();
        int a=n;
        int sum=0;
        while(a>0){
            int d=a%10;
            int f=1;
            if(d==0) f=1;
            else{
                for(int i=1;i<=d;i++){
                    f*=i;
                }
            }
            sum+=f;
            a=a/10;
        }
        if(sum==n){
            System.out.println("Strong no");
        }
        else System.out.println("Not strong no");
    }
}