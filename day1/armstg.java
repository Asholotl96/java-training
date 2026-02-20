import java.util.*;
public class armstg{
    public static void main(String[] args){
        System.out.println("Enter a no:");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int count=0, n=a;
        while(n>0){
            count++;
            n=n/10;
        }
        n=a;
        int sum=0;
        while(n>0){
            int d=n%10;
            sum+=Math.pow(d,count);
            n=n/10;
        }
        if(sum==a){
            System.out.println("Armstrong no");
        }
        else{
            System.out.println("Not Armstrong no");
        }
    }
}