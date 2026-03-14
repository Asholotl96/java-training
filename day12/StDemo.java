//Stack demo using a queue
import java.util.*;
class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
        for(int i=0;i<q.size()-1;i++) q.offer(q.poll());
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

public class StDemo {
    public static void main(String[] args) {
        MyStack st=new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println("Top: "+st.top());
        System.out.println("Remove: "+st.pop());
        System.out.println("Top: "+st.top());
        System.out.println("IsEmpty: "+st.empty());
    }    
}
