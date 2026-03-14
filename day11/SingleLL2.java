class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SingleLL2 {
    Node head=null;
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null) temp=temp.next;
        temp.next=newNode;
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addAt(int data, int pos){
        if(pos==1){ addFirst(data); return;}
        Node newNode=new Node(data);
        int count=1;
        Node temp=head;
        while(count<pos-1 && temp!=null) {temp=temp.next; count++;}
        if(temp==null) {System.out.println("Position out of range"); return;}
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void delLast(){
        if(head==null) System.out.println("Empty list");
        if(head.next==null) head=null;
        Node temp=head;
        while(temp.next.next!=null) temp=temp.next;
        temp.next=null;
    }
    public void delFirst(){
        if(head==null) System.out.println("Empty list");
        if(head.next==null) head=null;
        Node temp=head.next;
        head=temp;
    }
    public void delAt(int pos){
        if(head==null) { 
            System.out.println("Empty list"); 
            return;
        }
        if(pos==1) {
            delLast(); 
            return;
        }
        if(pos<0) {
            System.out.println("Invalid position");
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1 && temp.next!=null;i++){
            temp=temp.next;
        }

        if(temp==null || temp.next==null){
            System.out.println("Position out of bounds");
            return;
        }
        temp.next=temp.next.next;
    }
    public void reverseLL(){
        Node prev=null;
        Node cur=head;
        Node nextn=null;
        while(cur!=null){
            nextn=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextn;
        }
        head=prev;
    }
    public void countLL(){
        int c=1;
        Node temp=head;
        if(temp==null) c=0;
        else{
            while(temp.next!=null) {temp=temp.next; c++;}
        }
        System.out.println("Count is: "+c);
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public boolean isCyclic(){
        Node s=head;
        Node f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f) return true;
        }
        return false;
    }

    public void swapNodes(int x, int y) {
        if (x == y)
            return;
        Node prevX = null;
        Node currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;   
            currX = currX.next;
        }
        Node prevY = null;
        Node currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
        if (currX == null || currY == null)
            return;
        if (prevX != null)
            prevX.next = currY;
        else
            head = currY;
        if (prevY != null)
            prevY.next = currX;
        else
            head = currX;
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public int middlNode(){
        if(head==null) return -1;
        Node s=head;
        Node f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s.data;
    }

    public void splitLL(){
        if(head==null || head.next==null){
            System.out.println("List too small to split");
            return;
        }
        Node s=head;
        Node f=head;
        Node prevS=null;
        while(f!=null && f.next!=null){
            prevS=s;
            s=s.next;
            f=f.next.next;
        }
        Node h1=head;
        Node h2=s;
        if(prevS!=null){
            prevS.next=null;
        }
        SingleLL2 half1=new SingleLL2();
        half1.head=h1;
        System.out.println("First half: ");
        half1.display();
        SingleLL2 half2=new SingleLL2();
        half2.head=h2;
        System.out.println("Second half: ");
        half2.display();
    }

    public static void main(String[] args) {
        SingleLL2 list=new SingleLL2();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
        //list.head.next.next.next=list.head;
        if(list.isCyclic()) System.out.println("Cyclic");
        else System.out.println("Not cyclic");
        list.swapNodes(40, 20);
        list.display();
        if(list.middlNode()==-1) System.out.println("Empty LL, no mid node");
        else System.out.println("Middle node: "+list.middlNode());
        //list.splitLL();
        list.delLast();
        list.display();
        list.delFirst();
        list.display();
        list.delAt(2);
        list.display();
    }
}
