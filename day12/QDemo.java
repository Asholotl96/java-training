//Queue implimentation without using java.util.Queue using two stacks
import java.util.*;
class QDemo
{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void offer(int x){
        s1.push(x);
    }

    public int poll(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public int peek(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }
    public static void main(String[] args){
        QDemo q = new QDemo();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("QDemo: "+q.s1);
        System.out.println("Remove: "+q.poll());
        System.out.println("QDemo: "+q.s1);
        System.out.println("Front element: "+q.peek());
    }
}