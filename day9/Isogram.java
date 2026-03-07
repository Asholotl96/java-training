import java.util.*;

public class Isogram {
    static boolean isIsogram(String d) {
        Set<Character> hs=new HashSet<>();
        for(int i=0;i<d.length();i++) hs.add(d.charAt(i));
        if(hs.size()==d.length()) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String d=sc.nextLine();
        d=d.replaceAll("[^a-z]", "");
        System.out.println(d);
        if(isIsogram(d)) System.out.println("Isogram string");
        else System.out.println("Not Isogram");
    }
}
