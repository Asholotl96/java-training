import java.util.*;
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> l=new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            l.add(i);
        }
        for (int i = l.size()-1; i>=0; i--) {
            if(l.get(i)>7) l.remove(i); 
        }
        System.out.println(l);
    }
}
