public class splno{
    public static void main(String[] args){
        int a=29;
        int f=a/10, l=a%10;
        int prd=f*l;
        int sum=f+l;
        if((sum+prd)==a){
            System.out.println("Special");
        }
        else{
            System.out.println("Not special");
        }
    }
}