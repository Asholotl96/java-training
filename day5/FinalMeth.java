//final class Parent{    --cannot inherit from final class
class Parent{
    final void show(){
        System.out.println("parent");
    }
}
class Child extends Parent{
    void show1(){      //show()  --cannot override a final method
        System.out.println("child");
    }
}
public class FinalMeth{
    public static void main(String[] args){
        Parent c=new Child();
        c.show();
    }
}