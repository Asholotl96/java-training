public class ReqGC {
    public static void main(String[] args) {
        ReqGC r=new ReqGC();
        r=null;
        System.gc();
        System.out.println("GC requested");
    }
}
