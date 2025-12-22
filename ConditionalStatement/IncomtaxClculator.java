package ConditionalStatement;

import java.util.Scanner;

public class IncomtaxClculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int salary;
        int tax=0;
        System.out.print("Enter salary:");
        salary=sc.nextInt();
        if(salary<500000){
            tax= (salary*0);
        }
        else if((salary>500000)&&(salary<1000000)){
            tax=(int)(salary*0.2);
        }
        else if(salary>100000){
            tax=(int)(salary*0.3);
        }
        System.out.println("Total tax:"+tax);
        sc.close();
        

    }
}
