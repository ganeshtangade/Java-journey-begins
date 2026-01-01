package FunctionInJava;

import java.util.Scanner;

public class PrefixSuffixPrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Number:");
        int num=sc.nextInt();
        num=0;

        while(num>0){
int LD=num%10;
num=num/10;
if(LD==2){
    System.out.println("True");
}
for (int i=2; i<=Math.sqrt(LD);i++){
    if (LD%i!=0){
        System.out.println("True");
    }
    else{
        System.out.println("False");
    }
}
        }
    }
}
