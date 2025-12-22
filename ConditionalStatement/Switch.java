package ConditionalStatement;
import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:");
        int number=sc.nextInt();
        switch(number){
            case 1:
                System.out.println("Sunday");
                break;
                case 2:
                System.out.println("Monday");
                break;
                case 3:
                System.out.println("Tuesday");
                break;
                case 4:
                System.out.println("Wednesday");
                break;
                case 5:
                System.out.println("Thusday");
                break;
                case 6:
                System.out.println("Friday");
                break;
                case 7:
                System.out.println("Sturday");
                break;
                default:
                System.out.println("Invalid Input....");
                sc.close();
        }
    }
}
