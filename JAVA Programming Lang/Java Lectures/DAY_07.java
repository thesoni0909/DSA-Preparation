//Functions and methods
import java.util.*;
public class DAY_07 {

    //Write a function to print helloworld 5times
    public static void printHelloWorld(){
        for(int i=1;i<=5;i++){
            System.out.println("Hello World");
        }
    }

    //Write a func to calculate the sum of two numbers entered by user
    static int CalcSum(int a, int b){
        int sum=a+b;
        return sum;
    }

    //Write a func to swap two numbers entered by user
    static void SwapTwoNum(int a, int b){
        System.out.println("The value of a and b before swapping is " + a +", "+ b);
        int temp=a; a=b; b=temp;
        System.out.println("The value of a and b after swapping is  " + a + ", "+ b );
    }

    //Write a func to calculate product of two given numbers
    static double CalcMul(double a, double b){
        double product=a*b;
        return product;
    }

    //Write a func to calculate factorial of n 
    static long CalcFactorial(long n){
        if(n==0){
            return 1;
        }
        long fact=1;
        while(n>=1){
            fact=fact*n;
            n--;
        }
        return fact;
    }

    //Write a func to calculate binomial coffecient nCr=n!/r!(n-r)!
    static void CalcBinomialCoff(int n, int r){
        // long factOfn=1;
        // long factOfr=1;
        // long sub =n-r;
        // long factofsub=1;
        // while((n>=1) || (r>=1) || (sub>=1)){
        //     if(n>=1){
        //         factOfn=factOfn*n; n--;
        //     }

        //     if(r>=1){
        //         factOfr=factOfr*r; r--;
        //     }

        //     if(sub>=1){
        //         factofsub=factofsub*sub; sub--;
        //     }
        // }
        long factOfn=CalcFactorial(n);
        long factOfr=CalcFactorial(r);
        long factofsub=CalcFactorial(n-r);
        long BinomialCoff=factOfn/(factOfr*factofsub);
        System.out.println("The Binomial Coffecient of 8C3 (8,3) : " + BinomialCoff);
        }

        //Function Overloading
        //in terms of different no. of parameters

        //Write two functions of addition one for adding two values of same type and second one for adding three values of same types
        static int sum (int a, int b){
            return a+b;
        }

        static int sum(int a, int b, int c){
            return a+b+c;
        }

        //in terms of different type of parameters

        //Write two functions of addition one for adding two integer values and second one for adding two float values
        static int add (int a, int b){
            return a+b;
        }

        static float add (float a, float b){
            return (a+b);
        }

        //Write a function to check if number is prime or not?
        // static boolean checkPrime (int n){
        //     if(n==1){
        //         return false;
        //     }
        //     else if(n==2){
        //         return true;
        //     }
        //     else{
        //     for(int div=2;div<=n-1;){
        //         if(n%div==0){
        //             return false;
        //         }
        //         else{
        //             div=div+1;
        //         }
        //     }
        //     return true;
        // }
        // }

        //optimised
         static boolean checkPrime (int n){
            if(n==1){
                return false;
            }
            else if(n==2){
                return true;
            }
            else{
            for(int div=2;div<=Math.sqrt(n);){
                if(n%div==0){
                    return false;
                }
                else{
                    div=div+1;
                }
            }
            return true;
        }
        }

        //Write a function to print all prime numbers in a given range
        static void printAllPrimes(int n){
            for(int i=2;i<=n;i++){
            //     double div;
            //     double sqrtOfi=Math.sqrt(i);
            //     for(div=2;div<=sqrtOfi;div++){
            //         if(i%div==0){
            //             break;
            //         }
            //     }
            //     if(div>sqrtOfi){
            //     System.out.print(i + " ");
            //     }
                boolean isPrime=checkPrime(i);
                if(isPrime==true){
                    System.out.print(i + " ");
                }
            }
            System.out.println(" ");
        }

        //Write a function to convert binary number into decimal number
        static void DecConverter(int n){
            int x=n;
            int sum=0;
            int lastDigit;
            int decNumber=0;
            for(int i=0;n!=0;i++){
                lastDigit=n%10;
                decNumber=lastDigit*(int)(Math.pow(2, i));
                sum=sum+decNumber;
                n=n/10;
                }
            System.out.println("The Decimal number of " + x + " binary number is " + sum);
        }

        //Write a function to convert decimal number into binary number
        static void BinConverter(int n){
            int rem; int binNum=0; int i=1; int x=n;
            while(n!=0){
                rem=n%2;
                n=n/2;
                binNum=binNum+(i*rem);
                i*=10;} System.out.println("The Binary number of " + x + " is " + binNum);
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // printHelloWorld();
        // System.out.print("Enter first number : ");
        // int x=sc.nextInt();
        // System.out.print("Enter second number : ");
        // int y=sc.nextInt();
        // System.out.println("The Sum of two numbers : " + CalcSum(x, y));
        // System.out.print("Enter the value of a : ");
        // int a=sc.nextInt();
        // System.out.print("Enter the value of b : ");
        // int b=sc.nextInt();
        // SwapTwoNum(a, b);
        // System.out.println("The Product of two numbers : "+ CalcMul(3, 5));
        // System.out.print("Enter the number n : ");
        // long n=sc.nextInt();
        // long result=CalcFactorial(n);
        // System.out.println("The Factorial of given number : "+result);
        // CalcBinomialCoff(8, 3);
        // System.out.println("The sum of two given numbers : " + sum(3, 6));
        // System.out.println("The sum of three given numbers : " + sum(4, 6, 2));
        // System.out.println("The sum of two given numbers of int data type : " + add(3, 6));
        // System.out.println("The sum of two given numbers of float data type : " + add(3.8f, 6.8f));
        // System.out.println(checkPrime(5));
        // System.out.print("Enter a number here for range : ");
        // int range=sc.nextInt();
        // printAllPrimes(range);
        // DecConverter(1010);
        // BinConverter(9);
        sc.close();
    }
}
