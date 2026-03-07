public class HashTb {
    static int tSize=10;
    static int hT[]=new int[tSize];
    static void add(int k){
        int i=k%tSize;
        hT[i]=k;
    }
    static void disp(){
        for(int i=0;i<tSize;i++){
            System.out.println(i+" -> "+hT[i]);
        }
    }
    public static void main(String[] args) {
        add(32);
        add(33);
        add(45);
        add(56);
        add(77);
        disp();
    }
}
