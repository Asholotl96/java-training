public class MultiThrows {
    static void checkVals(int n,String t) throws ArithmeticException, NullPointerException{
        if(n<0){
            throw new ArithmeticException("Number can't be negative");
        }
        if(t==null){
            throw new NullPointerException("Text can't be null");
        }
        System.out.println(n+" "+t);
    }
    public static void main(String[] args){
        try {
            checkVals(5, null);
        } catch (ArithmeticException e) {
            System.out.println("Error: "+e.getMessage());
        } 
        catch (NullPointerException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
