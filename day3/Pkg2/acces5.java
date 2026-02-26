package Pkg2;
import Pkg1.access;

public class acces5 extends access{
    public void dispDets(){
        System.out.println("Public "+name);
        System.out.println("Protected "+age);
        showname();
        showage();
    }
    public static void main(String[] args){
        acces5 a=new acces5();
        a.dispDets();
        access b=new access();
        System.out.println("Public outside: "+b.name);
        // System.out.println("Public outside: "+b.age);
    }
}