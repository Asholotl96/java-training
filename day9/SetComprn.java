import java.util.*;

public class SetComprn {
    public static void main(String[] args) {
        Set<Integer> hs=new HashSet<>(Arrays.asList(30,10,50,20,40));
        Set<Integer> lhs=new LinkedHashSet<>(Arrays.asList(30,10,50,20,40));
        Set<Integer> ts=new TreeSet<>(Arrays.asList(30,10,50,20,40));
        System.out.println("Hashset(unordered): "+hs);
        System.out.println("LinkedHashSet(ordered): "+lhs);
        System.out.println("TreeSet(sorted set): "+ts);
    }
}
