import java.util.*;
public class Practice {
    // find the count of vowels
    static void count_vowels(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

    // find second largest number
    static void second_larg(int[] arr1, int[] arr2){
        int mergedArr[] = new int[arr1.length+arr2.length];
        int i;
        for(i=0; i<arr1.length; i++){
            mergedArr[i] = arr1[i];
        }
        for(int j=0; j<arr2.length; j++){
            mergedArr[i] = arr2[j];
            i++;
        }
        System.out.print("Merged array : ");
        for(int j=0; j<mergedArr.length; j++){
            System.out.print(mergedArr[j]+" ");
        }
        System.out.println();
        Arrays.sort(mergedArr);
        System.out.println("Largest Number : "+mergedArr[mergedArr.length-1]);
        System.out.println("Second Largest Number : "+mergedArr[mergedArr.length-2]);
    }

    // find permutations of a String
    static void findPermutations(StringBuilder str, StringBuilder subStr, int i){
        if(str.length()==0){
            System.out.println(subStr);
            return;
        }
        if(i==str.length()){
            return;
        }
        char ch = str.charAt(i);
        subStr.append(ch);
        str.deleteCharAt(i);
        findPermutations(str, subStr, 0);
        subStr.deleteCharAt(subStr.length()-1);
        str.insert(i,ch);
        findPermutations(str, subStr, i+1);
    }

    public static void main(String[] args) {
        // find the count of vowels
        // String str = "Hello worled";
        // count_vowels(str);

        // find second largest number
        // int arr1[] = {2,6,9,1}; int arr2[] = {5,3,0,10};
        // second_larg(arr1, arr2);

        // find permutations of a string
        StringBuilder str1 = new StringBuilder("abcd");
        StringBuilder subStr = new StringBuilder("");
        findPermutations(str1, subStr, 0);
    }
}
