class Dept{
    String depName;
    Dept(String depName){
        this.depName=depName;
    }
}
class Clg{
    String clgName;
    Dept dep;
    Clg(String clgName,Dept dep){
        this.clgName=clgName;
        this.dep=dep;
    }
    void disp(){
        System.out.println(clgName+" has department "+dep.depName);
    }
}
public class Aggrgn{
    public static void main(String[] args){
        Dept d=new Dept("CSE");
        Clg c=new Clg("SNPSU",d);
        c.disp();
    }
}