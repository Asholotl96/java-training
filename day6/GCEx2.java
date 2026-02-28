//Case 1: Reinitialise 
public class GCEx2 {
    public static void main(String[] args) {
        GCEx2 t=new GCEx2();
        System.out.println(t);
        t=new GCEx2();
        System.out.println(t);
    }
}