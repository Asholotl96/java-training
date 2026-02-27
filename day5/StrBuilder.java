import java.util.Scanner;
public class StrBuilder{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ip = "Ben";
        StringBuilder sb = new StringBuilder(ip);
        sb.append(" 14");
        System.out.println(sb.toString());

        //insert
        sb.insert(0, "King ");
        System.out.println(sb.toString());

        //replace
        sb.replace(0, 4, "Queen");
        System.out.println(sb.toString());

        //delete
        sb.delete(0, 5);
        System.out.println(sb.toString());

        //reverse
        sb.reverse();
        System.out.println(sb.toString());

    }
}