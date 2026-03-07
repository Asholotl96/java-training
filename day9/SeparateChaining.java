import java.util.*;
public class SeparateChaining {
    static int tSize=10;
    static LinkedList<Integer> []t=new LinkedList[tSize];
    static void ins(int k){
        int i=k%tSize;
        if(t[i]==null) t[i]=new LinkedList<>();
        t[i].add(k);
    }
    static void disp(){
        for(int i=0;i<tSize;i++) {
            System.out.print(i+"->");
            if(t[i]!=null){
                for(int v:t[i]) System.out.print(v+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        ins(10);
        ins(21);
        ins(32);
        ins(62);
        ins(45);
        disp();
    }
}