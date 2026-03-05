class MyThrd extends Thread{
    public void run(){
        System.out.println("Thread finished");
    }
}
public class Terminated {
    public static void main(String[] args) {
        MyThrd t1=new MyThrd();
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: "+e.getMessage());
        }
        System.out.println("State: "+t1.getState());
    }    
}
