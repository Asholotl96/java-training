class paren{
    void disp(){
        System.out.println("parent");
    }
}
class child1 extends paren{
    void dispc(){
        System.out.println("child 1");
    }
}

class child2 extends child1{
    void dispc2(){
        System.out.println("child 2");
    }
}
public class mlinherit {
    public static void main(String[] args) {
        child1 c=new child1();
        c.disp();
        c.dispc();

        child2 c1=new child2();
        c1.disp();
        c1.dispc();
        c1.dispc2();

        paren p=new paren();
        p.disp();
    }
}
