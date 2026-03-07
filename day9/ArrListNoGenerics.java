import java.util.*;

public class ArrListNoGenerics {
    public static void main(String[] args) {
        ArrayList<Object> l=new ArrayList();
        l.add(10);
        l.add("Hi");
        l.add(3.14);
        l.add(true);
        System.out.println("List: "+l);
        for (int i = 0; i <l.size(); i++) {
            Object n=(Object)l.get(i);
            System.out.println("Number: "+n);
        }
    }
}