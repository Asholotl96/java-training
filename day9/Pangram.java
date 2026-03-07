import java.util.*;
public class Pangram {
    static boolean pangramch(String s){
        s=s.strip().toLowerCase();
        if(s.length()<26) return false;
        for(char c='a';c<='z';c++){
            if(s.indexOf(c)<0) return false;
        }
        return true;    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s=new String();
        s=sc.nextLine();
        if(pangramch(s)) System.out.println("Pangram string");
        else System.out.println("Not Pangram");
    }
}
