// Strings

import java.util.*;
public class DAY_13 {

    static void PrintLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Declaration
        // String str="Hello";
        // String str01=new String("World!");
        // System.out.println(str+" "+str01);

        // Input
        // System.out.print("Enter your name here : ");
        // String name=sc.nextLine();
        // System.out.println(str+" "+name);

        // String length : String.length
        // System.out.println(name.length());

        // stringaname.charAt(index) method : to print the specific letters from string
        // System.out.println(str.charAt(0));

        String fullName="Soni Kumari";
        PrintLetters(fullName);

        sc.close();
    }
}
