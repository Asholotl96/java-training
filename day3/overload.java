public class overload {
    int add(int a, int b){
        System.out.println("Res:");
        return a+b;
    }
    float add(float a, float b){
        System.out.println("float res:");
        return a+b;
    }
    public static void main(String[] args) {
        overload t=new overload();
        int i=t.add(4, 5);
        System.out.println(i);
        float f=t.add(6.7f,6.9f);
        System.out.println(f);
    }
}
