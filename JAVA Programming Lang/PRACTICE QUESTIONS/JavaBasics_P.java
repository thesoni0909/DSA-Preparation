import java.util.*;
public class JavaBasics_P {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        // ----- PRACTICE QUESTIONS ------
        // VARIABLES & DATA TYPES QUESTIONS

        // Question1:In a program,input 3 numbers:A,BandC.You have to output the average of these 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N)

        System.out.println("Enter Your First Number :");
        double A=sc.nextDouble();
        System.out.println("Enter Your Second Number :");
        double B=sc.nextDouble();
        System.out.println("Enter Your Third Number :");
        double C=sc.nextDouble();
        double Avg_Num=(A+B+C)/3;
        System.out.println("Average of these 3 Numbers :"+Avg_Num);

        // Question2 : In a program,input the side of a square.You have to output the area of the square.(Hint : area of a square is (side x side))

        System.out.println("Enter the side of square :");
        double sideOfsq=sc.nextDouble();
        double areaOfsq=sideOfsq*sideOfsq;
        System.out.println("Area of square is "+areaOfsq);

        //Question3:Enter cost of 3 items from the user (usingfloatdatatype)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.
        //(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

        System.out.println("Cost of pencil item :");
        float item01=sc.nextFloat();
        System.out.println("Cost of pen item :");
        float item02=sc.nextFloat();
        System.out.println("Cost of eraser item :");
        float item03=sc.nextFloat();
        float total_cost=item01+item02+item03;
        System.out.println("Your total bill for the items you purchased without 18% GST :"+total_cost);
        float gst=0.18f*total_cost;
        float totalPrice=gst+total_cost;
        System.out.println("Your total bill for the items you purchased with 18% GST : "+totalPrice+" Rupees");

        //Question 4:What will be the type of result in the following Java code?
        /* byte b=4;
        char c='a';
        short s=512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;

        result=(f*b)+(i%c)-(d*s);
         */

        //answer : the type of the result var is double

        //Question 5:(Advanced)Will the following statement give any error in Java? 
        // int$=24;

        int $=24;
        System.out.println($);

        //No, the statement will not give any error. Names of variables are called identifiers in Java.
        // Identifier rule says,identifiers can start with any alphabet or underscore (“_”) or dollar (“$”).According to the rule the given variable name is a valid identifier.

        sc.close();
    }
}
