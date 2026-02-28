 /*
1. Multithreading allows a program to execute multiple threads simultaneously to perform multiple tasks efficiently.
2. Ways to create Thread in java:
   > by extending a Thread class
   > by implementing Runnable interface
3. Thread life cycle:
   >5 main states: New, Runnable, Running, Waiting/Blocked, Terminated/Died
4. Thread methods:
   >Sleep, run, wait and join.
*/

public class MultiThr extends Thread{
    public void run(){
        System.out.println("Thread running");
    }
    public static void main(String[] args) {
        MultiThr t1=new MultiThr();
        //t1.start(); //creates new thread and running
        //t1.run(); just a method call
        System.out.println("State: "+t1.getState());
    }
}
