package Operators_In_java;
import java.util.*;
public class ArithmaticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a,b;
        System.out.print("Enter Value of A:");
        a=sc.nextInt();
        System.out.print("Enter Value of B:");
         b=sc.nextInt();
         System.out.println("Addition of A and B is:"+(a+b));
         System.out.println("Substraction of A and B is:"+(a-b));
         System.out.println("Multiplication of A and B is:"+(a*b));
         System.out.println("Division of A and B is:"+(a/b));
         System.out.println("Modulo of A and B is:"+(a%b));
         sc.close();
        


    }
    
}
