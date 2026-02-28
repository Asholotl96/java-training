//Case 3: Object created inside method destroyed outside
public class GCEx34 {
    void disp(){
        GCEx34 t1=new GCEx34();
        System.out.println(t1);
    }
    public static void main(String[] args) {
        GCEx34 t=new GCEx34();
        //System.out.println(t);
        t.disp();
        //Case 4: Anonymous object gets collected by GC
        new GCEx34();
    }
}
