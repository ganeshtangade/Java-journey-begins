package FunctionInJava;
import java.util.*;
public class Factorial {
    public static int Test(int n){
        int f=1;
        for(int i=1; i<=n; i++){
        f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int f = Test(n);
        System.out.println(f);
        sc.close();
    }
}
