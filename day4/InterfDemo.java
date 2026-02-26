interface Human{
    void power();
    default void identity(){
        System.out.println("Gangadhar");
    }
}
interface Energy{
    default void energy(){
        System.out.println("Sun");
    }
}
class Shaktimaan implements Human,Energy{
    public void power(){
        System.out.println("Five Elements");
    }
}
public class InterfDemo{
    public static void main(String[] args){
        Human h1=new Shaktimaan();
        h1.power();
        h1.identity();
    }
}