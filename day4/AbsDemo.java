/*Abstraction:
Hiding implementation and showing essential features.
Achieved through interface(100% abstraction) and abstract keyword.
After java8, even interface is no longer 100% abstract, can include non abstract methods in interface.
In C++, can create objects in both heap and stack. In java, object created in heap but reference exists in stack.
*/
abstract class Boo{
    abstract void disp();
    void boom(){
        System.out.println("Non abstract method in abstract class.");
    }
    static void info(){
        System.out.println("Info");
    }
}
class Goo extends Boo{
    void disp(){
        System.out.println("Abstract method defined in subclass.");
    }
}
public class AbsDemo{
    public static void main(String[] args){
        Boo ob=new Goo();
        ob.boom();
        ob.disp();
        Boo.info(); //use class name to call static method in abstract class.
    }
}