// -----Practice Questions ------
// Bit Manipulatioin

import java.util.*;
public class DAY_14_P {

    // swap two numbers
    static void Swap2Num(int x, int y){
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("After Swapping : x = "+x+" and y = "+y);
    }

    // Add 1 to an integer
    static void Add1toAnInt(int x){
        System.out.println(x+" + 1 = "+(x=-~x));
    }

    // Uppercase to Lowercase
    static void Lowercase(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            char lower = (char)(ch|32);
            newStr.append(lower);
        }
        System.out.println(str+" is converted into "+newStr);
    }

    // Lowercase to Uppercase
    static void Uppercase(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            char upper = (char)(ch&(~32));
            newStr.append(upper);
        }
        System.out.println(str+" is converted into "+newStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        // Question 1 : What is the value of x^x for any value of x?
        // Solution : x XOR x => x^x = 0. Because xor operator gives 0 when bits are same.
        // And in this example, x^x, suppose x = 2, 2^2 => 10^10 = 0 
        // 1^1=0 and 0^0=0 hence, 10^10=0.

        // Question 2 :Swap two numbers without using any third variable.
        System.out.println("Enter two numbers x and y here : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before Swapping : x = "+x+" and y = "+y);
        Swap2Num(x, y);

        /*
        Question 3 : Add 1 to an integer using Bit Manipulation.
        (Hint: try using Bitwise NOT Operator)
        */
        int z = 99;
        Add1toAnInt(z);

        /*
        Question 4 : This question is based on a trick, please directly look at the solution.
        Convert uppercase characters to lowercase using bits.
        */
        System.out.print("Enter any word in capital letters here : ");
        String word = sc.nextLine();
        Lowercase(word);
        
        System.out.print("Enter any word in small letters here : ");
        String word01 = sc.nextLine();
        Uppercase(word01);

        sc.close();
    }
}
