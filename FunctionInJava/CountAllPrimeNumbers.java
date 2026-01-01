package FunctionInJava;

import java.util.Scanner;

public class CountAllPrimeNumbers {
public static boolean isPrime(int num){
        if (num==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(num);i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void PrimeInRange(int num){
        for (int i=2; i<=num; i++){
            if ( isPrime(i)){
                System.out.println(i);
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        PrimeInRange(num);
        sc.close();
        
}
}
