import java.util.*;
public class MergeLL {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>(Arrays.asList(1,2,3,4,5));
        LinkedList<Integer> l2=new LinkedList<>(Arrays.asList(6,7,8,9,10));
        System.out.println(l1);
        System.out.println(l2);
        l1.addAll(l2);
        System.out.println(l1);
    }
}
