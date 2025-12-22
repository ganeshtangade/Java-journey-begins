import java.util.*;
public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Side of Square:");
        int Side=sc.nextInt();
        int Area=Side*Side;
        System.out.println("Area of Square is:"+Area);
        sc.close();
        
    }
}
