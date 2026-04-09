class TNode{
    TNode[] children;
    boolean isEnd;
    TNode(){
        children=new TNode[26];
        isEnd=false;
    }
}
public class Trie {
    TNode root;

    Trie() {
    root=new TNode();
    }
    
    public void insert(String word){
        TNode cur=root;
        for(char ch:word.toCharArray()){
            int i=ch-'a';
            if(cur.children[i]==null){
                cur.children[i]=new TNode();
            }
            cur=cur.children[i];
        }
        cur.isEnd=true;
    }
    boolean search(String word){
        TNode cur=root;
        for (char ch:word.toCharArray()){
            int i=ch-'a';
            if(cur.children[i]==null) return false;
            cur=cur.children[i];
        }
        return cur.isEnd;
    }
    public static void main(String[] args) {
        Trie t=new Trie();
        t.insert("cat");
        t.insert("car");
        t.insert("dog");
        System.out.println(""+t.search("cat"));
        System.out.println(""+t.search("car"));
        System.out.println(""+t.search("can"));
        System.out.println(""+t.search("dog"));
    }
}
