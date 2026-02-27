/*              Relationship    Type        Dependency
    Inheritance     is A        Strong      Dependent
    Association     uses A      Weaker      Independent
    Aggregation     has A       Weak        Independent
    Composition     has A       Strong      Dependent
*/
class Teach{
    static String name;
    Teach(String name){
        this.name=name;
    }
}
class Stud{
    static String name;
    Stud(String name){
        this.name=name;
    }
}
public class Asscn{
    public static void main(String[] args){
        Teach t=new Teach("Nirmal");
        Stud s=new Stud("Abc");
        System.out.println(Stud.name+" is taught by "+Teach.name);
    }
}