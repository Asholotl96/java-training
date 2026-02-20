import java.util.*;
public class hamming{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: ");
        int a=sc.nextInt();
        int count=0;
        while(a>0){
            count+=(a&1);
            a=a>>1;
        }
        System.out.println(count);
    }
}