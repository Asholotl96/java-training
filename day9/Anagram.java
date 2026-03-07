import java.util.*;
public class Anagram {
    static boolean anagrams(String s, String t) {
        s=s.toLowerCase().replaceAll("\\s", "");
        t=t.toLowerCase().replaceAll("\\s", "");
        char[] a1=s.toCharArray();
        char[] a2=t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1, a2)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1: ");
        String s=sc.nextLine();
        System.out.println("Enter string 2: ");
        String t=sc.nextLine();
        if(anagrams(s,t)) System.out.println("Is anagram");
        else System.out.println("Not anagram");
    }
}
