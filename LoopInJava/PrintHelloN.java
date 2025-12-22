package LoopInJava;
import java.util.*;
public class PrintHelloN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int counter=1;
        int n;
        System.out.print("Enter N:");
        n=sc.nextInt();
        while(counter<=n){
            System.out.println("Hello World");
            counter++;

        }
        sc.close();

    }
}
