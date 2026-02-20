import java.util.*;
public class swit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character from VIBGYOR: ");
        char c=sc.next().charAt(0);
        c=Character.toUpperCase(c);
        // switch(c){
        //     case 'V':
        //         System.out.println("Violet");
        //         break;
        //     case 'I':
        //         System.out.println("Indigo");
        //         break;
        //     case 'B':
        //         System.out.println("Blue");
        //         break;
        //     case 'G':
        //         System.out.println("Green");
        //         break;
        //     case 'Y':
        //         System.out.println("Yellow");
        //         break;
        //     case 'O':
        //         System.out.println("Orange");
        //         break;
        //     case 'R':
        //         System.out.println("Red");
        //         break;
        //     default:
        //         System.out.println("Enter only VIBGYOR");
        // }
        String color=switch(c){
            case 'V'->{yield "Violet";}
            case 'I'->{yield "Indigo";}
            case 'B'->{yield "Blue";}
            case 'G'->{yield "Green";}
            case 'Y'->{yield "Yellow";}
            case 'O'->{yield "Orange";}
            case 'R'->{yield "Red";}
            default->{yield "Invalid";}
        };
        System.out.println("Color is "+color);
    }
}