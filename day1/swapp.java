public class swapp{
    public static void main(String[] args){
        int a=10, b=11;
        System.out.println("Before swap:"+a+" "+b);
        a=a+b; //a*b / t=a
        b=a-b; //a/b / a=b
        a=a-b; //a/b / b=t
        System.out.println("after swap:"+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after bitwise swap:"+a+" "+b);
    }
}