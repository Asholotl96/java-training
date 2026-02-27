class Engine{
    String type;
    Engine(String type){
        this.type=type;
    }
}
class Car{
    Engine eng;
    Car(String engType){
        this.eng=new Engine(engType);
    }
    void show(){
        System.out.println("Car has engine "+eng.type);
    }
}
public class Compsn{
    public static void main(String[] args){
        Car c=new Car("Petrol engine");
        c.show();
    }
}