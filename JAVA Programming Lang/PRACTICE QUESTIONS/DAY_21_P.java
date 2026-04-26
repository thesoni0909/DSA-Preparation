// -----Practice Questions ------
// ArrayLists

import java.util.ArrayList;
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
    static ArrayList<Integer> lonely_nums(){
        
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
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1); nums.add(3); nums.add(2); nums.add(1);
        if(monoTonic_AL(nums)){
            System.out.println("Given ArrayList is Monotonic ArrayList.");
        }
        else{
            System.out.println("Given ArrayList is not a Monotonic ArrayList.");
        }

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
    }
}
