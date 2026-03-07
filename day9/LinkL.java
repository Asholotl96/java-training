import java.util.LinkedList;
public class LinkL {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.addLast(20);
        ll.addFirst(5);
        ll.add(2,50);
        System.out.println(ll);
    }
}

