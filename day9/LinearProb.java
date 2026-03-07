public class LinearProb{
    static int ts = 10;
    static int table[] = new int[ts];
    static void insert(int key){
        int index = key%ts;
        while(table[index]!=0){
            index=(index+1)%ts;
        }
        table[index]=key;
    }
    static public void display(){
        for(int i =0;i<ts;i++){
            System.out.println("Index "+i+ " Value "+table[i]);
        }
    }
    public static void main(String[] args){
        insert(10);
        insert(23);
        insert(19);
        insert(30);
        insert(22);
        insert(29);

        display();
    }
}