// -----Practice Questions ------
// Divide and Conquer

import java.util.*;
public class DAY_18_P {
    //Question 1 : merge sort to sort an array of strings
    static void mergeSort(String[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        // left part call
        mergeSort(arr, si, mid);
        // right part call
        mergeSort(arr, mid+1, ei);
        // merge both part
        merge(arr, si, mid, ei);
    }
    static void merge(String arr[], int si, int mid, int ei){
        String temp[]=new String[ei-si+1]; int i=si; int j=mid+1; int k=0;
        while(i<=mid && j<ei){
            if(arr[i].compareTo(arr[j])<=0){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    // print the values of an array
    static void printArr(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }

    // Question 2 : Majority Element
    static int majorityElement(int arr[]){
        Arrays.sort(arr);
        int count = 1; int majorityCount = 0; int majorityElement = arr[0];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }
            else{
                count = 1;
            }
            if(majorityCount<count){
                majorityCount=count;
                majorityElement = arr[i];
            }
        }
        if(majorityCount>arr.length/2){
            return majorityElement;
        }
        return -1;
    }

    // Question 3 : Inversion Count
    static int inversionCount(int[] arr, int si, int ei, int invCount){
        if(si>=ei){
            return 0;
        }
        int mid = (si+ei)/2;
        // left part call
        int leftIC = inversionCount(arr, si, mid, invCount);
        // right part call
        int rightIC = inversionCount(arr, mid+1, ei, invCount);
        // merging both part
        int temp[] = new int[ei-si+1]; int i = si; int j = mid+1; int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                invCount+=(mid-i+1);
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
        return invCount+rightIC+leftIC;
    }

    public static void main(String[] args) {
        /*
        Question 1: Apply Merge sort to sort an array of Strings.(Assume that all the characters in all the Strings are in lowercase). (EASY)
        Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
        Sample Output 1: arr = { "earth", "mars", "mercury","sun"}
        */
        String arr[]={"hello","hello","hey"};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);

        /*
        Question 2 : Given an array nums of size n, return the majority element. (MEDIUM)
        The majority element is the element that appears more than ⌊n/2⌋ times.You may assume that the majority element always exists 
        in the array.
        Sample Input 1: nums = [3,2,3]
        Sample Output 1: 3
        Sample Input 2: nums = [2,2,1,1,1,2,2]
        Sample Output 2: 2
        Constraints(extra Conditions):
        ● n == nums.length
        ● 1 <= n <= 5 * 104
        ● -109 <= nums[i] <= 109
        */
        int arr2[] = {1,1,2,2,3,3};
        if(majorityElement(arr2)>0){
            System.out.println("The majority element in this array : "+majorityElement(arr2));
        }
        else{
            System.out.println("There are no majority element in this array.");
        }

        /*
         * Question 3 : Given an array of integers. Find the Inversion Count in the array. (HARD)
         * Inversion Count: For an array, inversion count indicates how far(or close) the array is from being
         * sorted. If the array is already sorted then the inversion count is 0. If an array is sorted in
         * the reverse order then the inversion count is the maximum. Formally, two
         * elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.Sample
         * Input1: N = 5, arr[ ] = {2, 4, 1, 3, 5}
         * Sample Output1: 3, because it has 3 inversions -(2, 1), (4, 1), (4, 3).
         * Sample Input2: N = 5, arr[ ] = {2, 3, 4, 5, 6}
         * Sample Output2: 0, because the array is already sorted
         * Sample Input3: N = 3, arr[] = {5, 5, 5}
         * Sample Output3: 0,because all the elements of the array are the same & already in a sorted manner.
         */
        int[] arr1 =  {2, 4, 1, 3, 5};
        System.out.println("The inversion count : "+inversionCount(arr1, 0, arr1.length-1, 0));
    }

}
