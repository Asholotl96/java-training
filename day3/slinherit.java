class parent{
    void disp(){
        System.out.println("parent");
    }
}
class childd extends parent{
    void dispc(){
        System.out.println("child");
    }
}
public class slinherit {
    public static void main(String[] args) {
        childd c=new childd();
        c.disp();
        c.dispc();

        parent p=new parent();
        p.disp();
    }
}
