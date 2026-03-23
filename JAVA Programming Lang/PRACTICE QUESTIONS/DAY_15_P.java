// -----Practice Questions ------
// OOPS - Object Oriented Programming Language

import java.util.*;
public class DAY_15_P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the real & img part of 1st complex number here : ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        System.out.println("Enter the real & img part of 2nd complex number here : ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex();
        c1.sum(r1, i1, r2, i2);
        c1.subtraction(r1, i1, r2, i2);
        c1.multiplication(r1, i1, r2, i2);

        sc.close();
    }
}

// Question1:Print the sum,difference and product of two complex numbers by creating a classnamed 'Complex'
// with separate methods for each operation whose real and imaginary parts are entered by the user.

class Complex{
    void sum(int r1, int i1, int r2, int i2){
        int sumofreal  = r1+r2;
        int sumofimg = i1+i2;
        if(sumofimg<0){
            System.out.println(sumofreal+""+sumofimg+"i");
        }
        else{
        System.out.println(sumofreal+"+"+sumofimg+"i");}
    }
    void subtraction(int r1, int i1, int r2, int i2){
        int subofreal  = r1-r2;
        int subofimg = i1-i2;
        if(subofimg<0){
            System.out.println(subofreal+""+subofimg+"i");
        }
        else{
        System.out.println(subofreal+"+"+subofimg+"i");}
    }
    void multiplication(int r1, int i1, int r2, int i2){
        int m1 = r1*r2;
        int m2 = r1*i2;
        int m3 = i1*r2;
        int m4 = i1*i2;
        int Part01 = m1-m4;
        int Part02 = m2+m3;
        if(Part02<0){
            System.out.println(Part01+""+Part02+"i");
        }
        else{
            System.out.println(Part01+"+"+Part02+"i");
        }
    }
}

// Question 2 :What is the output of the following program?
// class Automobile{
//     private String drive(){
//         return "Driving Vehicle";
//     }
// }
// class Car extends Automobile{
//     protected String drive(){
//         return "Driving Car";
//     }
// }
// public class ElectricCar extends Car{
//     @Override
//     public final String drive(){
//         return "Driving Electric Car";
//     }
//     public static void main(String[] args) {
//         final Car car = new ElectricCar();
//         System.out.println(car.drive());
//     }
// }
// Options :
// A. Driving vehicle
// B. Driving electric car
// C. Driving car
// D. The code does not compile

// Solution : Driving Electric Car
// ------------------------------------------------------------------------------------------------------------------------------------//

// Question 3 :Look at the following code and choosethe right option for the word:

// Shape.java
// public class Shape{
//     protected void display(){
//         System.out.println("Display-Base");
//     }
// }

// Circle.java
// public class Circle extends Shape{
//     < access - modifier > void display(){
//         System.out.println("Display-Derived");
//     }
// }
// Options :
// a. Only protected can be used.
// B. public and protected both can be used.
// C. public, protected, and private can be used.
// d. Only public can be used.

// Solution : public and protected both can be used.
// ----------------------------------------------------------------------------------------------------------------------------------------------------//


