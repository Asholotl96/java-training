class Node{
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data=data;
        left=right=null;
    }
}
public class BSTDemo {
    static Node root;
    void insert(int data){
        root=insert(root,data);
    }
    Node insert(Node root, int data){
        if(root==null){
            return new Node(data);
        }
        else if(root.data<data){
            root.right=insert(root.right,data);
        }
        else{
            root.left=insert(root.left,data);
        }
        return root;
    }

    boolean search(Node root,int key){
        if(root==null) return false;
        if(root.data==key) return true;
        if(key<root.data) return search(root.left,key);
        else return search(root.right,key);
    }
    void disp(Node root){
        if(root==null) return ;
        disp(root.left);
        System.out.print(root.data+" ");
        disp(root.right);
    }

    Node findMin(Node root){
        while(root.left!=null) root=root.left;
        return root;
    }

    Node del(Node root, int key){
        if(root==null) return null;
        else if(key<root.data) root.left=del(root.left,key);
        else if(key>root.data) root.right=del(root.right,key);
        else{
            //case 1: leaf node
            if(root.left==null && root.right==null) return null;
            //case 2: 1 child
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            //case 3: 2 children
            Node min=findMin(root.right);
            root.data=min.data;
            root.right=del(root.right,min.data);
        }
        return root;
    }

    public static void main(String[] args) {
        BSTDemo b=new BSTDemo();
        int[] vals={10,5,15,2,7,20};
        for(int i:vals) b.root=b.insert(b.root,i);
        System.out.println("Find 5? " + b.search(root, 5));
        b.disp(root);
        System.out.println();
        b.del(root, 5);
        b.disp(root);
    }
}