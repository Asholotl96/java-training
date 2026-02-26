public class iib{
    int runs;
    String name;
    {
        System.out.println("inside iib");
        name="VK";
        runs=183;
    } 
    iib(){
        System.out.println("Inside Constr");
        // runs=234;
        // name="Rohit Sharma";
    }
    static{
        System.out.println("Static block");
    }
    void disp(){
        System.out.println(name+" "+runs);
    }
    public static void main(String[] args){
        iib ob=new iib();
        ob.disp();

        iib bo=new iib();
        bo.disp();
    }
}