class MyThr extends Thread{
    public void run(){
        try {
            System.out.println("Sleeping..");
            Thread.sleep(10000);
            System.out.println("Awake");
        } catch (Exception e) {
        }
    }
}
public class WaitSlp{
    public static void main(String[] args) {
        MyThr t1=new MyThr();
        t1.start();
    }
}