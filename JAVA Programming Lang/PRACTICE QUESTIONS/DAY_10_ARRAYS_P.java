// -----Practice Questions ------
// Arrays Part 02

import java.util.*;
public class DAY_10_ARRAYS_P{
    // Question 01 Solution
    static boolean isDuplicate(int[] arr){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }

    // Question 02 Solution
    static int findIndexOftarget(int[] arr, int target){
        int len = arr.length-1;
        int mid = (0 + len)/2;
        int s=0; int e=mid; int s1=mid+1;
        while(s<=e){
            int m=(s+e)/2;
            if(arr[m]==target){
                return m;
            }
            else if(arr[m]>target){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        while(s1<=len){
            int m=(s1+len)/2;
            if(arr[m]==target){
                return m;
            }
            else if(arr[m]>target){
                len=m-1;
            }
            else{
                s1=m+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        /*
        Question 1: Given an integer array nums, return true if any value appears at least twice in the array, 
        and return false if every element is distinct.
        Example 1:
        Input : nums = [1, 2, 3, 1]
        Output: true
        Example 2:
        Input : nums = [1, 2, 3, 4]
        Output : false
        */
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(isDuplicate(nums));

        /*
        Question 2:There is an integer array nums sorted in ascending order (with distinct values).Prior to being passed
        to your function, nums is possibly rotated at an unknown pivot  index k (1  <=  k  <  nums.length)  such  that  the
        resulting  array  is [nums[k], nums[k+1],   ...,   nums[n-1], nums[0],   nums[1],   ...,   nums[k-1]] (0-indexed).
        For   example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
        Given the array nums after the possible rotation and an integer target,
        return the index of target if it is in nums, or -1   if it is not in nums.
        You must write an algorithm with O(log n) runtime complexity.
        Example 1 :
        Input : nums = [4,  5, 6, 7, 0, 1, 2],
        target = 0, Output: 4
        Example 2:
        Input:nums = [4,  5, 6, 7, 0, 1, 2],
        target = 3 , Output: -1
        */
        int nums01[] = {6,7,0,1,2,4,5};
        int target = 7;
        System.out.println(findIndexOftarget(nums01, target));
    }
}