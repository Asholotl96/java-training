import java.util.*;
public class spiral{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=sc.nextInt();
        int [][]a=new int[n][n];
        int top=0, bot=n-1, lf=0, rt=n-1;
        int p=1;
        while(top<=bot && lf<=rt){
            for(int i=lf;i<=rt;i++){
                a[top][i]=p;
                p++;
            }
            top++;

            for(int i=top;i<=bot;i++){
                a[i][rt]=p;
                p++;
            }
            rt--;

            for(int i=rt;i>=lf;i--){
                a[bot][i]=p;
                p++;
            }
            bot--;

            for(int i=bot;i>=top;i--){
                a[i][lf]=p;
                p++;
            }
            lf++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}