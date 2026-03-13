public class OddEve{
    static void odd(int a, int n){
        if(a>n) return;
        System.out.print((a+1)+" ");
        even(a+1,n);
    }
    static void even(int a, int n){
        if(a>n) return;
        System.out.print((a-1)+" ");
        odd(a+1,n);
    }
    public static void main(String[] args) {
        int n=10;
        odd(1,n);
    }
}