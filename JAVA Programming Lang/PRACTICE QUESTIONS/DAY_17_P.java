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
    static void countOfsubStr(String str){
        int k=0; String str1 = "";
        
    }

    public static void main(String[] args) {
        /*
        Question 1: For a given integer array of size N. You have to find all the occurrences(indices)
        of a given element(Key) and print them. Use a recursive function to solve this problem.
        Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
        Sample Output: 1 5 7 8
        */
        // int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // printIndices(arr, 0, 2);
        // System.out.println();

        // Question 3 : Write a program to find Length of a String using Recursion.
        // findLengthOfStr("Vivek Sharma",0, 0);

        /*
        Question 4 : We are given a string S, we need to find the count of all contiguous substrings
        starting and ending with the same character.
        Sample Input 1: S = "abcab"
        Sample Output 1: 7
        There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
        Out of the above substrings, there are 7 substrings:a,abca,b,bcab,c,aandb.
        So,only 7 contiguous substrings start and end with the same character.
        */
        countOfsubStr("abcab");

    }
}
