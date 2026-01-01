package FunctionInJava;

import java.util.Scanner;

public class DecimalToBinary {
    public static void DecBinary(int  binNum){
    int myNum = binNum;
    int pow=0;
    int dec=0;
    while(binNum>0){
        int ld=binNum%10;
        dec=dec+(ld*(int)Math.pow(2,pow));
        pow++;
        binNum=binNum/10;

    }
    System.out.println("Decimal of "+ myNum +"  = "+ dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Binary:");
        int n = sc.nextInt();
        DecBinary(n);
        sc.close();

    }
}

