class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SingleLL {
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
    public static void main(String[] args) {
        SingleLL list=new SingleLL();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.display();
        list.addFirst(5);
        list.display();
        list.addAt(25, 4);
        list.display();
        list.countLL();
        list.reverseLL();
        list.display();
    }
}
