class Final{
    final int x;
    Final(int x){
        this.x=x;
    }
    void disp(){
        System.out.println(x);
    }
}
public class Finalinit{
    public static void main(String[] args){
        Final f=new Final(5);
        f.disp();
    }
}