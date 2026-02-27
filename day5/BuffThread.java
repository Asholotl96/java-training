class BuffTask implements Runnable{
    private StringBuffer sb;
    public BuffTask(StringBuffer sb){
        this.sb=sb;
    }
    public void run(){
        for(int i=0;i<2000;i++) sb.append("a");
    }
}
public class BuffThread{
    public static void main(String[] args) throws InterruptedException{
        StringBuffer sb=new StringBuffer("Start");
        Thread t1=new Thread(new BuffTask(sb));
        Thread t2=new Thread(new BuffTask(sb));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(sb);
    }
}