public class instance{
    int x;
    instance(){
        // this(20);
        System.out.println("Def const");
    }
    instance(int x){
        this();
        this.x=x;
        System.out.println("Par const");
    }
    void disp(){
        System.out.println(x);
    }
    public static void main(String[] args){
        // instance ob=new instance();
        instance ob=new instance(20);
        ob.disp();
    }
}