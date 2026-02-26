class par{
    @SuppressWarnings("unused")
    void disp(){
        System.out.println("parent");
    }
}
class chil extends par{
    @Override
    void disp(){
        System.out.println("child");
    }
}
public class override {
    public static void main(String[] args) {
        chil a=new chil();
        a.disp();
    }
}   
