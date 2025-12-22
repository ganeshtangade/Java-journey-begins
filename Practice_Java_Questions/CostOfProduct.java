import java.util.*;
public class CostOfProduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Price Of Pencile:");
        float Pencile=sc.nextFloat();
        System.out.print("Enter Price Of Pen:");
        float Pen=sc.nextFloat();
        System.out.print("Enter Price Of Eraser:");
        float Eraser=sc.nextFloat();
        float Total=Pencile+Pen+Eraser;
        System.out.println("Total Bill:"+Total);
        //+ 18% gst 
        float With_gst=(Total+(18*Total/100));

        System.out.println("With_GST:"+With_gst);
        sc.close();
    }
    
}
