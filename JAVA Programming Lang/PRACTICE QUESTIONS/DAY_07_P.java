// -----Practice Questions ------
// Functions or Methods

import java.util.Scanner;
public class DAY_07_P {
    // Question 1 :Write a Java method to compute the averageof three numbers.
    static double CalcAvgNum(double a, double b, double c){
        return (a+b+c)/3;
    }

    // Question2:Write a method named isEven that accepts an int argument.The method should return true if the argument is even,or false otherwise.Also write a program to test your method.
    static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    // Question3:Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)
    /*
    A number is called a palindrome if the number is equal to the reverse of a number e.g.,121 is a
    palindrome because the reverse of 121 is 121 itself.On the other hand,321 is not a 
    palindrome because the reverse of 321 is 123, which is not equal to 321.
     */

    //function for calculating reverse of a number.
    static int Calcreverse(int number){
        int lastDigit; int rev=0;
        while(number!=0){
            lastDigit=number%10;
            rev=(rev*10)+lastDigit;
            number=number/10;
        }
        return rev;
    }

    //function for checking number is a palindrome?
    static void isPalindrome(int number){
        int rev_num=Calcreverse(number);
        if(number<0){
            System.out.println("The "+number+" is not a Palindrome number");
        }
        else{
        if(number==rev_num){
            System.out.println("The "+number+" is Palindrome number.");
        }
        else{
            System.out.println("The "+number+" is not Palindrome number.");
        }}
    }

    //Question 5 : Write a Java method to compute the sum of the digits in an integer.
    static int sumOf_digitsinInt(int integer){
        int lastDigit; int sum=0;
        while(integer!=0){
            lastDigit=integer%10;
            sum=sum+lastDigit;
            integer=integer/10;
        }
        return sum;
    }

    //Question 4 :  use the following methods of the Math class in Java:
    /*
    a.Math.min( ) : The Math.min(x,y) method can be used to find the lowest value of x and y.
    b.Math.max( ) : The Math.max(x,y) method can be used to find the highest value of x and y.
    c.Math.sqrt( ) : The Math.sqrt(x) method returns the square root of x.
    d.Math.pow( ) : The Math.pow(x, y) method returns the value of x raised to the power of y.
    e.Math.abs( ) : The Math.abs(x) method returns the absolute (positive) value of x.
    */
    static void math_class(int x, int y){
    System.out.println(Math.min(x, y));
    System.out.println(Math.max(x, y));
    System.out.println(Math.sqrt(x));
    System.out.println(Math.pow(x, y));
    System.out.println(Math.abs(y));
    }

    //main function
    public static void main(String[] args) {
        System.out.println("Welcome to your coding journey");
        Scanner sc=new Scanner(System.in);
        
        // System.out.println("The Average of three numbers : " + CalcAvgNum(2, 4, 6));
        // System.out.print("Enter a number here : ");
        // int number=sc.nextInt();
        // if(isEven(number)){
        //     System.out.println("The number "+number+" is Even.");
        // }
        // else{
        //     System.out.println("The number "+number+" is Odd.");
        // }
        // System.out.println("The reverse number for given number: "+ Calcreverse(1234));
        // isPalindrome(121);
        // System.out.println("The sum of all digits in given integer is : "+sumOf_digitsinInt(1002));
        // math_class(9, -3);

        sc.close();
    }
}
