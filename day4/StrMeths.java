/*
String: Immutable
        Not thread safe.
StringBuilder: Mutable.
        Not thread safe.
StringBuffer: Mutable
        Thread safe..
*/
import java.util.Scanner;
public class StrMeths{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String ip=sc.nextLine();
        //length method
        System.out.println("Length: "+ip.length());
        //toUupperCase method
        System.out.println("Upper: "+ip.toUpperCase());
        //toLowerCase method
        System.out.println("Lower: "+ip.toLowerCase());
        //charAt(index) method
        System.out.println(ip.charAt(3));
        //substring(begin,end) method
        System.out.println(ip.substring(0,4));
        //concat or + method
        String s="Ankara";
        System.out.println("concat: "+ip.concat(s));
        System.out.println(ip+s);
        //equals method
        System.out.println(ip.equals("Mi bombaaclaaart"));
        //equalsIgnoreCase method
        System.out.println(ip.equalsIgnoreCase("Mi bomba"));
        //replace(old,new) method
        System.out.println(ip.replace("Mi","Tu"));
        //trim() method
        String sp=" "+ip+" ";
        System.out.println("Trimmed: "+sp.trim());
        //startsWith
        System.out.println(ip.startsWith("M"));
        //endsWith
        System.out.println(ip.endsWith("t"));
        //indexOf
        System.out.println(ip.indexOf("r"));
        //compareTo
        System.out.println(ip.compareTo("Mi bomba"));
        //split
        String[] w=ip.split(" ");
        for(String ws:w){
                System.out.println(ws);
        }
        //isLetter, isDigit
        for(int i=0;i<ip.length();i++){
                char c=ip.charAt(i);
                if(Character.isLetter(c)){
                        System.out.println("Is letter");
                }
                else if(Character.isDigit(c)){
                        System.out.println("Is digit");
                }
                else System.out.println("Neither letter nor digit");
        }
    }
}