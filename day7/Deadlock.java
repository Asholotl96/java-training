class A{}
class B{}
public class Deadlock {
    static A objA=new A();
    static B objB=new B();
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            synchronized (objA) {
                System.out.println("Thread 1 locked object A");
                try {
                    Thread.sleep(10000);
                } catch (Exception e) {}
                System.out.println("Thread 1 waiting for object B");
                synchronized (objB) {
                    System.out.println("Thread 1 locked object B");                   
                }
            }
        });
        Thread t2=new Thread(()->{
            synchronized (objB) {
                System.out.println("Thread 2 locked object B");
                try {
                    Thread.sleep(10000);
                } catch (Exception e) {}
                System.out.println("Thread 2 waiting for object A");
                synchronized (objA) {
                    System.out.println("Thread 2 locked object A");                   
                }
            }
        });
        t1.start();
        t2.start();
    }   
}
