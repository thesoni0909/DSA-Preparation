// -----Practice Questions ------
// Arrays Part 02

import java.util.*;
public class DAY_10_ARRAYS_P{
    // Question 01 Solution
    static boolean isDuplicate(int[] arr){
        // 1st method :
        // Arrays.sort(arr);
        // for(int i=0; i<arr.length-1; i++){
        //     if(arr[i]==arr[i+1]){
        //         return true;
        //     }
        // }
        // return false;

        // 2nd method :
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // Question 02 Solution
    static int findIndexOftarget(int[] arr, int target){
        int si = 0; int ei = arr.length-1;
        while(si<=ei){
            int mid = (si+ei)/2;
            // compare target value with the value at mid index
            if(arr[mid] == target){
                return mid;
            }
            // check value of mid index whether it lies on left sorted part or not?
            else if(arr[si]<=arr[mid]){
                if(arr[si]<=target && target<arr[mid]){
                    ei = mid-1;
                }
                else{
                    si = mid+1;
                }
            }
            // otherwise value of mid index will lie on right sorted part
            else{
                if(arr[mid]<target && target<=arr[ei]){
                    si = mid+1;
                }
                else{
                    ei = mid-1;
                }
            }
        }
        return -1;
    }

    // Question 05 Solution
    static void findTriplets(int arr[]){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            for(int j=i+1; j<arr.length-1; j++){
                if(j > i+1 && arr[j] == arr[j-1]) continue;
                for(int k=j+1; k<arr.length; k++){
                    if(k > j+1 && arr[k] == arr[k-1]) continue;
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }

    // Question 03 Solution
    static int buy_SellStock(int[] prices){
        int min = prices[0]; int buyDay = 0; int profit = 0; int maxProfit = 0; int sellDay = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]<min){
                min = prices[i];
                buyDay = i;
            }
        }
        System.out.println("Stock has bought on day "+(buyDay+1)+" at price "+min);
        for(int i=buyDay+1; i<prices.length; i++){
            if(prices[i]>min){
                profit = prices[i]-min;
                if(profit>maxProfit){
                    maxProfit = profit;
                    sellDay = i;
                }
            }
        }
        if(maxProfit==0){
            System.out.println("No Selling is done.");
        }
        else{
            System.out.println("Stock has sold on day "+(sellDay+1)+" at price "+prices[sellDay]);
        }
        return maxProfit;
    }

    static void trapped_water(int height[]){

        // 1st method : O(n^2)
        // int leftMax = Integer.MIN_VALUE; int rightMax = Integer.MIN_VALUE; int minheight = Integer.MAX_VALUE;
        // int Water = 0; int trapWater = 0;
        // for(int i=0; i<height.length; i++){
        //     leftMax = Integer.MIN_VALUE; rightMax = Integer.MIN_VALUE;
        //     // left maximum height
        //     for(int j=i; j>=0; j--){
        //         leftMax = Math.max(leftMax, height[j]);
        //     }
        //     // right maximum height
        //     for(int j=i; j<height.length; j++){
        //         rightMax = Math.max(rightMax, height[j]);
        //     }
        //     // waterlevel of each bars
        //     minheight = Math.min(leftMax, rightMax);
        //     // trapped water on each bars
        //     Water = minheight - height[i];
        //     // total trapped water
        //     trapWater = trapWater + Water;
        // }
        // System.out.println("Total trapped water : "+trapWater);

        // 2nd method : optimised O(n)
        int leftMax[] = new int[height.length]; int rightMax[] = new int[height.length];
        leftMax[0] = height[0]; rightMax[height.length-1] = height[height.length-1];
        int minheight = 0; int Water = 0; int trapWater = 0;
        // calculating left max of each height[i]
        for(int i=1; i<height.length; i++){
            if(height[i]>leftMax[i-1]){
                leftMax[i] = height[i];
            }
            else{
                leftMax[i] = leftMax[i-1];
            }
        }
        // calculating right max of each height[i]
        for(int i=height.length-2; i>=0; i--){
            if(height[i]>rightMax[i+1]){
                rightMax[i] = height[i];
            }
            else{
                rightMax[i] = rightMax[i+1];
            }
        }
        // calculating trapped rainwater
        for(int i=0; i<height.length; i++){
            // waterlevel
            minheight = Math.min(leftMax[i], rightMax[i]);
            // trapped rainwater on each bars
            Water = minheight - height[i];
            // total trapped rainwater
            trapWater = trapWater + Water;
        }
        System.out.println("Trapped rainwater : "+trapWater);
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
        int nums01[] = {5,6,7,0,1,2,4};
        int target = 4;
        if(findIndexOftarget(nums01, target)==-1){
            System.out.println("The target element "+target+" is not in the array.");
        }
        else{
            System.out.println("The target element "+target+" is at "+findIndexOftarget(nums01, target)+" index.");
        }

        /*
        Question 5: Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0
        Notice that the solution set must not contain duplicate triplets.
        Example 1: Input: nums = [-1, 0,  1, 2, -1, -4],  Output:   [ [-1, -1, 2] , [-1, 0, 1] ]
        Example 2: Input: nums = [ ], Output:   [ ]
        Example 3: Input: nums = [ 0 ], Output:   [ ]
        Constraints: 1. 0 <= nums.length <= 3000, 2. -105 <= nums [ i ] <= 105
        */
        int nums02[] = {-1, 0, 1, 2, -1, -4};
        findTriplets(nums02);

        /*
        Question 3: You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on the ith day.
        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
        Example 1: Input: prices = [7, 1, 5, 3, 6,  4], Output : 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
        Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

        Example 2: Input: Prices = [7, 6, 4,  3, 1], Output : 0
        Explanation: In this case, no transactions are done and the max profit = 0.

        Constraints: 1<=prices.length<=105, 0<=prices[i]<=104
        */
        int prices[] = {7};
        System.out.println("Maximum Profit earned : "+buy_SellStock(prices));

        /*
        Question 4: Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
        Example 1: Input: height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1], Output: 6
        Example 2: Input: height = [4, 2, 0, 3, 2, 5], Output : 9
        Constraints: n==height.length; 1<=n<=2*10^4; 0<=height[i]<=10^5
        */
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        trapped_water(height);
    }
}