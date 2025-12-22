package ConditionalStatement;
import java.util.*;
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter A:");
        a=sc.nextInt();
        System.out.print("Enter B:");
        b=sc.nextInt();
        if(a>b){
            System.out.println("A is Greater Number");
        }
        else{
            System.out.println("B is Greater Number");
        }
        sc.close();
    }
}
