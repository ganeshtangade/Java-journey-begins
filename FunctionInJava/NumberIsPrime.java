package FunctionInJava;

import java.util.Scanner;

public class NumberIsPrime {
    public  static boolean isPrime(int num){
       if(num==2){
       System.out.println("Number is prime..");
       }
        for(int i=2; i<=num-1; i++){
            if (num%i==0){
                System.out.println("Number is not prime");
            }
        }
        System.out.println("Number is prime..");
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
sc.close();
    }

}
