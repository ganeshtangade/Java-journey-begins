import java.util.*;
public class AverageThreeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
         System.out.print("Enter value of A:");
        int A=sc.nextInt();
        System.out.print("Enter value of B:");
        int B=sc.nextInt();
        System.out.print("Enter value of C:");
        int C=sc.nextInt();
        System.out.print("Enter value of N:");
        int N=sc.nextInt();
        float Avg=(A+B+C)/N;
        System.out.println("Average of Three Numbers is :"+Avg);
        sc.close();
        
    }
}
