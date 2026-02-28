/*
Garbage Collection:
Manages memory
Automatic memory management mechanism used to remove objects created in heap that are no longer in use.

Following are cases where GC deallocates memory.
*/
//Case 1: Nullifying reference
public class GCEx1 {
    public static void main(String[] args) {
        GCEx1 t=new GCEx1();
        System.out.println(t);
        t=null;
        System.out.println(t);
    }
}
