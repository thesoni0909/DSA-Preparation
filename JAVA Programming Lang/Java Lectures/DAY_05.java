// loops
import java.util.*;
public class DAY_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //while loop

        //prints "hello world" 5 times
        int i=1;
        while(i<=5){
            System.out.println("Hello World");
            i=i+1;
        }

        //print numbers from 1 to 10
        int numbers=1;
        while(numbers<=10){
            System.out.println(numbers);
            numbers++;
        }

        //print numbers from 1 to n
        System.out.print("Enter a number n : ");
        int n=sc.nextInt();
        int counter=1;
        while(counter<=n){
            System.out.print(counter + " " + "\n");
            counter++;
        }

        //print sum of first n natural numbers
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
        int counter1=1;
        int sum=0;
        while(counter1<=num){
            sum=sum+counter1;
            counter1++;
        }
        System.out.println(sum + " is the sum of first " + num + " natural number");

        //for loop
        //print hello world 5 times using for loop
        int j;
        for(j=1;j<=5;j++){
            System.out.println("hello world");
        }

        //print square pattern
        int k;
        for(k=1;k<=4;k++){
            System.out.println("****");
        }

        //print reverse of number
        System.out.print("Enter a number : ");
        int input_num=sc.nextInt();
        int last_digit;
        while(input_num!=0){
            last_digit=input_num%10;
            System.out.print(last_digit);
            input_num/=10;
        }

        //reverse the given number  and then print complete reverse number
        int rev=0; int digit_last;
        System.out.print("Enter a number here : ");
        for(int user_ip=sc.nextInt();user_ip!=0;user_ip/=10){
            digit_last=user_ip%10;
            rev=rev*10+digit_last;
        }
        System.out.println(rev);

        //do while loop
        int r=1;
        do{
            System.out.println("hello world");
            r++;
        }while(r<=10);

        // keep entering the numbers till user enters multiple of 10
        
        // while(true){
        //     System.out.print("Enter any number : ");
        //     int no=sc.nextInt();
        //     if((no%10)==0){
        //         break;
        //     }
        // }
        // System.out.println("You entered multiple of 10");

        //print numbers 1 to 5 except 3
        int num_3;
        for(num_3=1;num_3<=5;num_3++){
            if(num_3==3){
                continue;
            }
            System.out.println(num_3);
        }

        //display all the numbers entered by user excepts multiples of 10;

        // do{
        //     System.out.print("Enter any number : ");
        //     int ip_num=sc.nextInt();
        //     if(ip_num%10==0){
        //         continue;
        //     }
        //     System.out.println(ip_num);
        // }
        // while(true);

        //check if a number is prime or not?
        //1st method(good for small numbers like 1 to 50....and more)

        //     System.out.println("Enter natural number here : ");
        //     int nat_num=sc.nextInt();
        //     int div;
        //     if(nat_num==1){
        //         System.out.println(nat_num + " is a not prime number.");
        //     }
        //     else if(nat_num==2){
        //         System.out.println(nat_num + " is a prime number.");
        //     }
        //     else{
        //     for (div=2;div<=nat_num-1;div++){
        //         if(nat_num%div==0){
        //             System.out.println(nat_num + " is a not prime number.");
        //             break;
        //         }
        //     }
        //     if(div==nat_num){
        //     System.out.println(nat_num  + " is a prime number.");
        //     }
        // }

        // or ......

        // System.out.print("Enter any natural number here : ");
        // int n=sc.nextInt();
        // int div;
        // boolean isPrime=true;
        // for(div=2;div<=n-1;div++){
        //     if(n%div==0){
        //         isPrime=false;
        //         break;
        //     }
        // }
        // if(isPrime==true){
        //     System.out.println("Prime Number");
        // }
        // else{
        //     System.out.println("Not Prime Number");
        // }

        //2nd method(optimised)
        System.out.print("Enter natural number here : ");
        int nat_num=sc.nextInt();
        int div;
        int limit=(int)(Math.sqrt(nat_num));          //math.sqrt of num can return double value 
        if(nat_num==1){
            System.out.println(nat_num + " is a not prime number.");
        }
        else if(nat_num==2){
            System.out.println(nat_num + " is a prime number.");
        }
        else{
            for(div=2;div<=limit;div++){
                if(nat_num%div==0){
                    System.out.println(nat_num + " is a not prime number.");
                    break;
                }
            }
            if(div>limit){
                System.out.println(nat_num + " is a prime number.");
            }
        }
        sc.close();
}
}