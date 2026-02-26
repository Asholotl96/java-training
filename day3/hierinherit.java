class parent{
    void disp(){
        System.out.println("parent");
    }
}
class sibling1 extends parent{
    void dispc(){
        System.out.println("sibling 1");
    }
}

class sibling2 extends parent{
    void dispc2(){
        System.out.println("sibling 2");
    }
}

public class hierinherit {
     public static void main(String[] args) {
        sibling1 c=new sibling1();
        c.disp();
        c.dispc();

        sibling2 c1=new sibling2();
        c1.disp();
        c1.dispc2();

        parent p=new parent();
        p.disp();
    }
}
