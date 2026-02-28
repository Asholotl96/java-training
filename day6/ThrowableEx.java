public class ThrowableEx{
    public static void main(String[] args){
        try{
            int a=10;
            int b=0;
            if(b==0){
                throw new Throwable("Division by zero");
            }
            int res=a/b;
            System.out.println("Result: "+res);
        }
        catch(Throwable t){
            System.out.println("Caught throwable: "+t.getMessage());
        }
    }
}