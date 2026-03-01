import java.math.BigInteger;
import java.util.*;
public class DAY_05_P {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //----Practice Questions-----
        //Looops

        // Question 1 :How many times 'Hello' is printed?
        /*
        for(inti=0;i<5;i++) {
        System.out.println("Hello");
        i+=2;
        }
        */
        //Answer : 2 times

        //Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        int n;
        int choice=1;
        int evenSum=0;
        int oddSum=0;
        while(choice==1){
            System.out.print("Enter a number here : ");
            n=sc.nextInt();
            if(n%2==0){
                evenSum=evenSum+n;
            }
            else{
                oddSum=oddSum+n;
            }
            System.out.print("If you want to continue, write 1. If not, write 0 here : ");
            choice=sc.nextInt();
        }
        System.out.println("The sum of even numbers are : " + evenSum);
        System.out.println("The sum of odd numbers are : " + oddSum);

        //Question 3 :Write a program to find the factorial of any number entered by the user.
        /*
        Hint:factorial of a number n=n*(n-1)*(n-2)*(n-3)*......*1 and exists for positive numbers only. We write factorial as n! 
        So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.Note - Please do not confuse factorial with NOT EQUAL TO operator, 
        they are not the same)
        */

        // This code can calculate factorial from range  0 to 20 //Bcs long and int data type can hold the value of factorial from numbers 0 to 20 (for long) and 0 to 12 (for int)
        System.out.print("Enter a number x : ");
        long x=sc.nextInt();
        long fact=1;
        if(x==0){
            fact=1;
        }
        else{
        for(long i=1;i<=x;i++){
            fact=fact*i;
        }} System.out.println("The factorial of " + x + " is : " + fact);

        // This code can calculate factorial of any numbers
        System.out.print("Enter a number y : ");
        long y=sc.nextInt();
        BigInteger factorial=BigInteger.valueOf(1);
        if(y==0){
            factorial=BigInteger.ONE;
        }
        else{
        for(long i=1;i<=y;i++){
            factorial=factorial.multiply(BigInteger.valueOf(i));   //multiply the factorial=factorial*i but i is of long data type ,,,hence i is converted into biginteger
        }} System.out.println("The factorial of " + y + " is : " + factorial);

        //Question 4:Write a program to print the multiplication table of a number N,entered by the user
        System.out.print("Enter a number here : ");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            int table = num * i;
            System.out.print(num + " * " + i + " = " + table + "\n");
        }

        //Question 5 :What is wrong in the following program?
        /*
        for(inti=0;i<=5;i++ ) {
        System.out.println("i = "+i);
        }
        System.out.println("i after the loop = "+ i );
        */

        //answer : value of i can not be accessible after the for loop because i is declared inside the for loop.


        sc.close();
    }
}
