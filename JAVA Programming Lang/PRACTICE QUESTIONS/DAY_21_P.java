// -----Practice Questions ------
// ArrayLists

import java.util.ArrayList;
import java.util.Collections;
public class DAY_21_P {
    // Question 1 :
    static boolean monoTonic_AL(ArrayList<Integer> nums){
        boolean inc = true;
        boolean dec = true;
        for(int i=0; i<nums.size()-1; i++){
            if(nums.get(i)>nums.get(i+1)){
                dec = false;
            }
            if(nums.get(i)<nums.get(i+1)){
                inc = false;
            }
        }
        return inc||dec;
    }

    // Question 2 :
    static ArrayList<Integer> lonely_nums(ArrayList<Integer> nums){
        ArrayList<Integer> L = new ArrayList<>();

        // 1st method : brute force
        // for(int i=0; i<nums.size(); i++){
        //     int n = nums.get(i);  boolean bool = true;
        //     for (int j = 0; j < nums.size(); j++) {
        //         int m = nums.get(j);
        //         if (i == j) {
        //             continue;
        //         }
        //         if (m == n || m == n - 1 || m == n + 1) {
        //             bool = false;
        //             break;
        //         }
        //     }
        //     if(bool){
        //         L.add(n);
        //     }
        // }
        // return L;

        // 2nd method : sorting approach
        Collections.sort(nums); int last = nums.size();
        // when nums AL is of length 1
        if(nums.size()==1){
            L.add(nums.get(0));
            return L;
        }
        // first element check
        if(nums.get(0)!=nums.get(1) && nums.get(0)+1 != nums.get(1)){
            L.add(nums.get(0));
        }
        // elements check from 1st index to last 2nd index
        for(int i=1; i<last-1; i++){
            int n=nums.get(i);
            // if(n!=nums.get(i-1) && n!=nums.get(i+1) && (n-1)!=nums.get(i-1) && (n+1)!=nums.get(i+1)){
            //     L.add(n);
            // }
            // OR
            if(n-nums.get(i-1)>1 && nums.get(i+1)-n>1){
                L.add(n);
            }
        }
        // last element check
        if(nums.get(last-1)!=nums.get(last-2) && nums.get(last-1)-1!=nums.get(last-2)){
            L.add(nums.get(last-1));
        }
        return L;
    }

    public static void main(String[] args) {
        /*
        Question 1 : Monotonic ArrayList(EASY)
        An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
        An Arraylist nums is monotone increasing if for all i<=j, nums.get(i)<=nums.get(j).
        An Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
        Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
        Sample Input 1: nums = [1,2,2,3], Output : true
        Sample Input 2: nums = [6,5,4,4], Output : true
        Sample Input 3: nums = [1,3,2], Output : false
        Constraints : 1<=nums.size()<=105 & -105<=nums.get(i)<=105
        */
        // ArrayList<Integer> nums = new ArrayList<>();
        // nums.add(1); nums.add(3); nums.add(2); nums.add(1);
        // if(monoTonic_AL(nums)){
        //     System.out.println("Given ArrayList is Monotonic ArrayList.");
        // }
        // else{
        //     System.out.println("Given ArrayList is not a Monotonic ArrayList.");
        // }

        /*
        Question 2 : Lonely Numbers in ArrayList(MEDIUM)
        You are given an integer arraylist nums.A number x is lonely when it appears only once, and
        no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
        Return all lonely numbers in nums. You may return the answer in any order.

        Sample Input 1: nums = [10,6,5,8], Output : [10,8]
        Explanation :-
        10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
        8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
        5 is not a lonely number since 6 appears in nums and vice versa.
        Hence, the lonely numbers in nums are [10, 8]. Note that [8, 10] may also be returned.
        
        Sample Input 2: nums = [1,3,5,3], Output : [1,5]
        Explanation :-
        1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
        5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
        3 is not a lonely number since it appears twice.
        Hence, the lonely numbers in nums are [1, 5]. Note that [5, 1] may also be returned.

        Constraints : 1<=nums.size()<=105 & 0<=nums.get(i)<=106
        */

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        ArrayList<Integer> result = lonely_nums(nums1);
        System.out.println(result);
    }
}
