import java.util.*;
public class DAY_04_P {
    public static void main(String[] args) {
        System.out.println("Welcome to your coding journey");
        Scanner sc=new Scanner(System.in);

        // -----Practice Questions ------
        // conditional statements

        // Question1:Write a Java program to get a number from the user and print whether it is positive or negative.
        System.out.print("Enter an integer : ");
        long num1=sc.nextLong();
        String negORpos=(num1>=0)?"Positive":"Negative";
        System.out.println(num1 + " is " + negORpos + " number");

        //Question2: Finish the following code so that it prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
        System.out.print("Enter your body temperature : ");
        double temp=sc.nextDouble();
        if(temp>100){
            System.out.println("You have fever. Kindly take appointment with doctor");
        }
        else{
            System.out.println("Congratulations, you do not have fever.");
        }

        //Question3: Write a Java program to input week number(1-7) and print day of week name using switch case.
        System.out.print("Enter number of day in a week : ");
        int week_number=sc.nextInt();
        switch(week_number){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default :
                System.out.println("You haven't entered the week number");
        }

        //Question 4 :What will be the value of x & y in the following program:
        /*
        int a=63 , b=36;
        boolean x=(a<b)?true:false;
        int y=(a>b)?a:b;
        system.out.println(x + " , " + y);
        */

        //Answer : false , 63

        // Question5: Write a Java program that takes a year from the user and print whether that year is a leap year or not.
        System.out.print("Enter a year : ");
        int year=sc.nextInt();
        if(year%400==0){
            System.out.println(year + " is a leap year.");
        }
        else if((year%4==0)&&(year%100!=0)){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
        sc.close();
    }
}
