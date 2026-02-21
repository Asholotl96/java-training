import java.util.*;
public class zgzg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n=sc.nextInt();
        int col=1+(4*(n));
        for(int r=1;r<=3;r++){
            for(int c=1;c<=col;c++){
                if((r==1 && c%4==3)||(r==2 && c%2==0)||(r==3 && c%4==1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("/n Reversed Zigzag:/n/n ");
        for(int r=1;r<=3;r++){
            for(int c=1;c<=col;c++){
                if((r==3 && c%4==3)||(r==2 && c%2==0)||(r==1 && c%4==1)) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}