class Aa{}
class Bb{}
public class DeadlkFree {
    static Aa objA=new Aa();
    static Bb objB=new Bb();
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            synchronized (objA) {
                synchronized (objB) {
                    System.out.println("Thread 1 finished safely");
                }
            }
        });
        Thread t2=new Thread(()->{
            synchronized (objB) {
                synchronized (objA) {
                    System.out.println("Thread 2 finished safely");
                }
                
            }
        });
        t1.start();
        t2.start();
    } 
}