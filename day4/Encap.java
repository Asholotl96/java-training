//encapsulation provides us controlled/protected access to data, unlike abstraction that hides all unimportant features
//setters allow u to initialise one var at a time unlike constructors. getters to access one var at a time.
//setters have no return type, getters have a return type.

public class Encap{
    private String name;
    private String power;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPower(String power){
        this.power=power;
    }
    public String getPower(){
        return power;
    }
    void disp(){
        System.out.println("Hero: "+name);
        System.out.println("Power: "+power);
    }
    public static void main(String[] args){
        Encap hero=new Encap();
        hero.setName("Billy");
        hero.setPower("Brain Cancer");
        hero.disp();
        System.out.println(hero.getName()+" "+hero.getPower());
    }
}