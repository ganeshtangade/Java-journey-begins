package LoopInJava;

import java.util.Scanner;

public class PrintNo1ToN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int counter=1;
        int n;
        System.out.println("Enter N:");
        n=sc.nextInt();
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
sc.close();
    }
}
