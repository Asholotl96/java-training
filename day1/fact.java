import java.util.*;
public class fact{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=1;
        if(a==0) System.out.println("Fact= "+f);
        else{
            for(int i=2;i<=a;i++){
                f*=i;
            }
            System.out.println("Fact= "+f);
        }
    }
}