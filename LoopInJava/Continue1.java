package LoopInJava;

public class Continue1 {
     public static void main(String[] args) {
        int i=1;
        while(i<=20){
            if(i%10==0){
                continue;
            }
            i++;
            System.out.println(i);
        }
    }
    
}
