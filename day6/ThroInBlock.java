public class ThroInBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block: ");
            throw new ArithmeticException("Exception from try");
        }
        catch (ArithmeticException e) {
            System.out.println("Caught in catch "+e.getMessage());
            throw new NullPointerException("Exception from catch");
        }
        finally{
            System.out.println("Inside finally");
            throw new IllegalStateException("Exception from finally");
        }
    }
}
