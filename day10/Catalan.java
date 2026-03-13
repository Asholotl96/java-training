public class Catalan {
    static int cat(int n){
        if(n==0||n==1) return 1;
        int res=0;
        for(int i=0;i<n;i++) res+=cat(i)*cat(n-1-i);
        return res;
    }
    public static void main(String[] args) {
        int n=10;
        for(int i=0;i<n;i++) System.out.print(cat(i)+" ");
    }
}
