import java.util.*;
public class InputJava {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Print Input Only
        String name=sc.nextLine();
        System.out.println(name);
        //Addition Of A and B from user input Number
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition of A and B:"+c);
        //Area of circle
        int rad=sc.nextInt();
        float Area=3.14f*rad*rad;
        System.out.println("Area of Cirtcle:"+Area);
        //Product Of two Numbers
        int s=sc.nextInt();
        int d=sc.nextInt();
        int f=s*d;
        System.out.println("Product of A and B:"+f);
        sc.close();
    }
}
