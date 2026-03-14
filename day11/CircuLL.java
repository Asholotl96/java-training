

class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
        this.next=null;
    }
}
public class CircuLL {
    Node1 head=null;
    public void circLL(int n){
        if(n<-0) return;
        head=new Node1(1);
        Node1 temp=head;
        for(int i=2;i<=n;i++){
            temp.next=new Node1(i);
            temp=temp.next;
        }
        temp.next=head;
    }
    public void display(int n){
        Node1 temp=head;
        int cnt=0;
        while(temp!=null && cnt<n){
            System.out.print(temp.data+" ");
            temp=temp.next;
            cnt++;
        }
        System.out.println("back to head");
    }

    public int jos(int k){
        if(head==null || head.next==null) return -1;
        Node1 prev=null;
        Node1 curr=head;
        while(curr.next!=curr){
            for(int i=1;i<k;i++){
                prev=curr;
                curr=curr.next;
            }
            System.out.println("Eliminated: "+curr.data);
            prev.next=curr.next;
            curr=prev.next;
        }
        head=curr;
        return curr.data;
    }

    public static void main(String[] args) {
        CircuLL list=new CircuLL();
        list.circLL(7);
        list.display(7);
        int surv=list.jos(2);
        System.out.println("Survivor: "+surv);
    }
}
