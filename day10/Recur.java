public class Recur {
    static int fact(int n){
        System.out.println("Calling factorial("+n+")");
        if(n==0||n==1){
            System.out.println("Returning 1 from factorial("+n+")");
            return 1;
        }
        int res=n*fact(n-1);
        System.out.println("Returning "+res+" from factorial("+n+")");
        return res;
    }
    public static void main(String[] args) {
        int res=fact(5);
    }
}
