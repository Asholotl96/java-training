//Queue implimentation without using java.util. Queue using two stacks
import java.util.*;
class Que
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

    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
}
public class QDemo{
    public static void main(String[] args){
        Que q = new Que();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println("Front element: "+q.peek());
        System.out.println("Remove: "+q.poll());
        System.out.println("Front element: "+q.peek());
        System.out.println("IsEmpty"+q.isEmpty());
    }
}