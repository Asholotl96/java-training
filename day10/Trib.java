public class Trib {
    static int tribo(int n){
        if(n==0) return 0;
        if(n==1 || n==2) return 1;
        return tribo(n-1)+tribo(n-2)+tribo(n-3);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("Tribonacci series upto "+n+" terms: ");
        for(int i=0;i<n;i++) System.out.print(tribo(i)+" ");
    }
}
