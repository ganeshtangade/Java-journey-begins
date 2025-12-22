package ConditionalStatement;
import java.util.*;
public class Adult {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int age;
        System.out.print("Enter Age:");
        age=sc.nextInt();
        if(age>=18){
            System.out.println("Adult:1.Eligible for voting\n2.Eligible for Driving\n");
        }
        else if ((age>13)&&(age<18)){
            System.out.println("School Student");
        }
        else{
            System.out.println("Childern");
        }
        sc.close();
    }
}
