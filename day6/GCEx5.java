//Case 5: Island of isolation
public class GCEx5 {
    GCEx5 ref;
    public static void main(String[] args) {
        GCEx5 t=new GCEx5();
        GCEx5 t1=new GCEx5();
        t.ref=t1;
        t1.ref=t;
        t=null;
        t1=null;
    }
}
