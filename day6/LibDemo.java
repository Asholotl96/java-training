class GC extends Exception{
    GC(String m){
        super(m);
    }
}
public class LibDemo {
    static void CheckAtt(boolean abs) throws GC{
        if(abs) throw new GC("Penalty to submit 3 books in library");
        else System.out.println("Present in class: No penalty");
    }
    public static void main(String[] args) {
        boolean abs=true;
        try {
            CheckAtt(abs);    
        } catch (GC e) {
        System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Welcome to Saptagiri");
        }
    }   
}
