/*
sum()
start()
sleep()
join()
yield()
isAlive()
getState()
*/
class MyThrrd extends Thread{
    public void run(){
        System.out.println(getName()+" started, state: "+getState());
        Thread.yield(); //yield control to let another thread run
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            System.out.println(getName()+" interrupted: "+e.getMessage());
        }
        System.out.println(getName()+" finished, state: "+getState());
    }
}
public class ThrdMeth {
    public static void main(String[] args) {
        MyThrrd t1=new MyThrrd();
        MyThrrd t2=new MyThrrd();
        System.out.println("Before start, t1 is alive?: "+t1.isAlive());
        t1.start();
        t2.start();
        System.out.println("After start t1: "+t1.getState());
        System.out.println("After start t2: "+t2.getState());
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: "+e.getMessage());
        }
        System.out.println("After join t1 state: "+t1.getState());
        System.out.println("AFter join t2 state: "+t2.getState());
        System.out.println("t1 alive?: "+t1.isAlive());
        System.out.println("t2 alive?: "+t2.isAlive());
    }
}
/*
yield() -> only hints/requests to thread scheduler
priority basis -> can only request but doesnt guarantee that current thread will stop or pause
main decider -> jvm and OS decide which thread gets paused
*/