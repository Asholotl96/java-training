/*String pool: when initialised without new keyword, strings are stored here.
 == (compares obj created at certain variables) & .equals(compares values)
*/
public class StrPool{
    public static void main(String[] args){
        String s1="Ben14";
        String s2="Ben14";
        String s3=new String("Ben14");
        String s4=new String("Ben14");
        System.out.println("s1==s2 "+ (s1==s2));
        System.out.println(s1.equals(s2));
        System.out.println("s3==s4 "+(s3==s4));
        System.out.println(s3.equals(s4));
        System.out.println("s1==s3 "+(s1==s3));
        System.out.println(s1.equals(s3));
        String s5=s3.intern();
        System.out.println("s1==s5 "+(s1==s5));
        System.out.println(s1.equals(s5));
    }
}