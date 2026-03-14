// -----Practice Questions ------
// Strings

import java.util.*;
public class DAY_13_P {

    //Count lower case vowels
    static void CountLowerCase(String str){
        int n=str.length(); int count=0;
        for(int i=0; i<n; i++){
            char ch=str.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    count++;
                }
        }
        System.out.println("Given string contains "+count+" lowercase vowels.");
    }

    // Anagrams or not
    static void isAnagrams(String s1, String s2){
        s1=s1.toLowerCase(); s2=s2.toLowerCase();
        if(s1.length()==s2.length()){
            char[] s1CharArr=s1.toCharArray();
            char[] s2CharArr=s2.toCharArray();
            Arrays.sort(s1CharArr);
            Arrays.sort(s2CharArr);
            boolean result = Arrays.equals(s1CharArr, s2CharArr);
            if(result){
                System.out.println(s1+" & "+s2+" are anagrams of each other.");
            }
            else{
                System.out.println(s1+" & "+s2+" are not anagrams of each other.");
            }
        }
        else{
            System.out.println(s1+" & "+s2+" are not anagrams of each other.");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /*
        Question 1:Count how many times lowercase vowels occurred in a String entered by the user.
        */
        System.out.print("Enter a word/sentence here : ");
        String str = sc.nextLine();
        CountLowerCase(str);

        /*
        Question 2 : What will be the output of the following code?
        public class Solution{
        public static void main(String args[]) {
        String str="ShradhaDidi";
        String str1="ApnaCollege";
        String str2="ShradhaDidi";
        System.out.println(str.equals(str1) +" "+str.equals(str2));
        }
        }
        */

        // Solution : false true

        /*
        Question 3 : What will be the output of the following code?
        public class Solution{
        public static void main(String args[]) {
        String str="ApnaCollege".replace("l","");
        System.out.println(str);
        }}
        */

        // Solution : ApnaCoege

        /*
        Question 4 : Determine if 2 Strings are anagrams of each other.
        What are anagrams?If two strings contain the same characters but in a different order,
        they can be said to be anagrams.Consider race and care. In this case, race's characters can b formed 
        into a care,or care's characters can be formed into race.
        */
        String s1="race";
        String s2="care";
        isAnagrams(s1, s2);

        sc.close();
    }
}
