//conditional statements

import java.util.*;
public class DAY_04 {
    public static void main(String[] args) {
        System.out.println("Welcome to your coding journey");
        Scanner sc=new Scanner(System.in);


        //if-else statement and else if statement
        System.out.print("Enter Your age :");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("you are eligible to vote");
        }
        else if(age>13 && age<18){
            System.out.println("teenager");
        }
        else{
            System.out.println("you are not eligible to vote");
        }

        //print the largest of 2 numbers
        System.out.print("enter first number : ");
        int num1=sc.nextInt();
        System.out.print("enter the second number : ");
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println(  num1 + " is greater number");
        }
        else if(num1==num2){
            System.out.println("both numbers are same");
        }
        else{
            System.out.println(num2 + " is greater number");
        }

        //Print if a number is even or odd
        System.out.print("enter a number : ");
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println(x + " is a even number");
        }
        else{
            System.out.println(x + " is a odd number");
        }

        //income tax calculator
        System.out.print("Enter Your Amount per Year : ");
        int income=sc.nextInt();
        int total_tax=0;
        if(income<500000){
            System.out.println("No Tax on the amount less than 5 Lakhs\n" + "Total Tax : " + total_tax + " Rupees");
        }
        else if(income>=500000 && income <=1000000){
            total_tax=(int) (0.20*income);
            System.out.println("Your tax on amount you have given : " + total_tax + " Rupees");
        }
        else{
            total_tax=(int) (0.30*income);
            System.out.println("Your tax on amount you have given : " + total_tax + " Rupees");
        }

        //print the largest of three numbers
        System.out.print("Enter the first number : ");
        int first_num=sc.nextInt();
        System.out.print("Enter the second number : ");
        int second_num=sc.nextInt();
        System.out.print("Enter the third number : ");
        int third_num=sc.nextInt();

       if(first_num>second_num){
            if(first_num>third_num){
                System.out.println(first_num + " is largest of the 3 numbers.");
            }
            else{
                System.out.println(third_num + " is largest of the 3 numbers.");
            }
        }
        else{
            if(second_num>third_num){
                System.out.println(second_num + " is largest of the 3 numbers.");
            }
            else{
                System.out.println(third_num + " is largest of the 3 numbers");
            }
        }

        //ternary operator
        //checks number is even or oddd?
        System.out.print("Enter the number you want to check : ");
        int num3=sc.nextInt();
        String evenOrodd=((num3%2)==0)?"Even":"Odd";
        System.out.println(num3 + " is " + evenOrodd + " number");

        //checks if a student will pass or fail?
        System.out.print("Enter your marks here : ");
        double marks=sc.nextDouble();
        String passORfail=(marks>=33)?"Pass":"Fail";
        System.out.println("Your marks is : " + marks + "\n" + "You are " + passORfail );

        //switch statement
        //execute block of code which matches to given variable number

        int number=20;
        switch(number){
            case 12 : System.out.println("Case 1 is executed"); break;
            case 20 : System.out.println("Case 2 is executed"); break;
            case 32 : System.out.println("Case 3 is executed"); break;
            default : System.out.println("Default case is executed");
        }

        //checks number is even or odd
        System.out.print("Enter : ");
        int a=sc.nextInt();
        switch(a%2){
            case 0 : System.out.println(a + " is even number");
                     break;
            case 1 : System.out.println(a + " is odd number");
                     break;
        }

        //make a calculator using using binary operator +,-,/,%,* only using switch statement
        System.out.print("Enter first number : ");
        int number1=sc.nextInt();
        System.out.print("Enter second number : ");
        int number2=sc.nextInt();
        System.out.print("Enter the binary operator : ");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+' :
                System.out.println(number1 + " +" + " " + number2 + "=" + (number1+number2));
                break;
            case '-' :
                System.out.println(number1 + " -" + " " + number2 + "=" + (number1-number2));
                break;
            case '*' :
                System.out.println(number1 + " *" + " "+number2 + "=" + (number1*number2));
                break;
            case '/' :
                System.out.println(number1 + " /" + " " +number2 + "=" + (number1/number2));
                break;
            case '%' :
                System.out.println(number1 + " %" + " "+number2 + "=" + (number1%number2));
                break;
            default :
                System.out.println("You entered a invalid operator");
        }
        sc.close();
    }
}
