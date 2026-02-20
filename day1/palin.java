public class palin{
    public  static void main(String[] args){
        int a=13021;
        int o=a;
        int rev=0;
        while(a>0){
            int d=a%10;
            rev=rev*10+d;
            a=a/10;
        }
        if(o==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindorme");
        }
    }
}