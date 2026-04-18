// -----Practice Questions ------
// Recursion Basics(Part 2)

public class DAY_17_P {
    // Question 1:
    static void printIndices(int[] arr, int i, int key){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        printIndices(arr, i+1, key);
    }

    // Question 3:
    static void findLengthOfStr(String str, int i, int length){
        if(i==str.length()){
            System.out.println(length);
            return;
        }
        length++;
        findLengthOfStr(str, i+1, length);
    }

    // Questioin 4:
    static void countOfsubStr(String str, String newStr, int si, int ei, int count){
        if(si>ei){
            System.out.println(count);
            return;
        }
        for(int i=si; i<=str.length()-1; i++){
            newStr+=str.charAt(i);
            if(newStr.charAt(0)==newStr.charAt(newStr.length()-1)){
                count++;
            }
        }
        newStr="";
        countOfsubStr(str, newStr, si+1, ei, count);
    }

    // Question 2:
    static void convertIntoString(int num, String[] arr, StringBuilder newStr){
        if(num==0){
            System.out.println(newStr);
            return;
        }
        int lastDig = num%10;
        newStr.insert(0, arr[lastDig]+" ");
        convertIntoString(num/10, arr, newStr);
    }

    // Question 5 :
    static void towerOfhanoi(int n, String S, String H, String D){
        if(n==1){
            System.out.println(n+" Disk is Transferred from "+S+" to "+D);
            return;
        }
        // transfer top n-1 disks from src to helper using dest as 'helper'
        towerOfhanoi(n-1, S, D, H);
        // transfer nth(single disk left) from src to dest
        System.out.println(n+" Disk is Transferred from "+S+" to "+D);
        // transfer n-1 disks from helper to dest using src as 'helper
        towerOfhanoi(n-1, H, S, D);
    }

    public static void main(String[] args) {
        /*
        Question 1: For a given integer array of size N. You have to find all the occurrences(indices)
        of a given element(Key) and print them. Use a recursive function to solve this problem.
        Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
        Sample Output: 1 5 7 8
        */
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        printIndices(arr, 0, 2);
        System.out.println();

        // Question 3 : Write a program to find Length of a String using Recursion.
        findLengthOfStr("Vivek Sharma",0, 0);

        /*
        Question 4 : We are given a string S, we need to find the count of all contiguous substrings
        starting and ending with the same character.
        Sample Input 1: S = "abcab"
        Sample Output 1: 7
        There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
        Out of the above substrings, there are 7 substrings:a,abca,b,bcab,c,aandb.
        So,only 7 contiguous substrings start and end with the same character.
        */
        String str = "aba";
        countOfsubStr(str, "", 0, str.length()-1, 0);

        /*
         * Question 2 : You are given a number (eg - 2019), convert it into a String of
         * english like “two zero one nine”. Use a recursive function to solve this
         * problem.
         * NOTE-The digits of the number will only be in the range 0-9 and the last digit of a number can't be 0.
         */
        int num = 1947;
        String arr1[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        convertIntoString(num, arr1, new StringBuilder(""));

        // Question 5 : Tower of Hanoi
        int disks = 3;
        towerOfhanoi(disks, "Source", "Helper", "Destination");
    }
}
