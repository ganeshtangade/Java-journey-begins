package ConditionalStatement;
import java.util.*;
public class GreaterNumberInThreeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a,b,c;
        System.out.print("Enter A:");
        a=sc.nextInt();
        System.out.print("Enter B:");
        b=sc.nextInt();
        System.out.print("Enter C:");
        c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("A is Greater Number");
        }
        else if(b>a&&b>c){
            System.out.println("B is Greater Number");
        }
        else{
            System.out.println("C is Greater Number");
        }
        sc.close();
        }

    }

