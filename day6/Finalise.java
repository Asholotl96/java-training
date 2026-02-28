public class Finalise {
    protected void finalise(){
        System.out.println("Finalise called");
    }
    public static void main(String[] args) {
        Finalise f=new Finalise();
        f=null;
        System.gc();
    }
}
/*
Heap structure in generational GC
1. Young gen
2. Old gen
3. Metaspace
*/
