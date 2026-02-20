import java.util.*;
public class kapkr{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a no:");
        int a=sc.nextInt();
        if(a==1){
            System.out.println("kaprekar");
        }
        else{
            int n=a*a;
            int d=1;
            boolean k=false;
            while(d<n){
                int r=n%d;
                int q=n/d;
                if((r>0)&&(r+q)==a){
                    k=true;
                    System.out.println("kaprekar");
                    break;
                }
                d*=10;
            }
            if(!k){
                System.out.println("Not kaprekar");
            }        
        }
    }
}