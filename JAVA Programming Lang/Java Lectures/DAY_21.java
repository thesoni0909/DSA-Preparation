// ArraysLists

import java.util.*;
public class DAY_21 {
    // revering an ArrayList
    static void reverseArrList(ArrayList<Character> chars){
        int si = 0;
        int ei = chars.size()-1;
        while(si<ei){
            char ch = chars.get(si);
            chars.set(si, chars.get(ei));
            chars.set(ei, ch);
            si++; ei--;
        }
    }

    // find largest number in an ArrayList
    static int findMax(ArrayList<Integer> list1){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list1.size(); i++){
            if(list1.get(i)>max){
                max = list1.get(i);
            }
        }
        return max;
    }

    // swap two numbers
    static void swap(ArrayList<Integer> list1, int i1, int i2){
        int temp = list1.get(i1);
        list1.set(i1, list1.get(i2));
        list1.set(i2, temp);
    }

    // containeer with most water
    // 1. using arrays(brute force approach)
    static void contWithMostWater(int[] heights){
        int maxWater = 0; int line1 = 0; int line2 = 0;
        for(int i=0; i<heights.length-1; i++){
            for(int j=i+1; j<heights.length; j++){
                int min = Math.min(heights[i], heights[j]);
                int water = min*(j-i);
                if(water > maxWater){
                    maxWater = water;
                    line1 = i;
                    line2 = j;
                }
            }
        }
        System.out.println("Maximum Water Stored : "+maxWater);
        System.out.println("Two Lines on x-axis forms a containeer that holds maximum water : "+heights[line1]+", "+heights[line2]);
    }

    // 2. using arraylists(brute force approach)
    static void contWithMostWater(ArrayList<Integer> list){
        int maxWater = 0; int line1 = 0; int line2 = 0;
        for(int i=0; i<list.size()-1; i++){
            for(int j=i+1; j<list.size(); j++){
                int min = Math.min(list.get(i), list.get(j));
                int water = min*(j-i);
                if(water > maxWater){
                    maxWater = water;
                    line1 = i;
                    line2 = j;
                }
            }
        }
        System.out.println("Maximum Water Stored : "+maxWater);
        System.out.println("Two Lines on x-axis forms a containeer that holds maximum water : "+list.get(line1)+", "+list.get(line2));
    }

    // 3. using arrays (Two Pointer Approach)
    static void contWM(int[] heights){
        int maxWater = 0; int si=0; int ei=heights.length-1; int line1 = 0; int line2 = 0;
        while(si<ei){
            int hght = Math.min(heights[si], heights[ei]);
            int water = hght*(ei-si);
            if(water > maxWater){
                    maxWater = water;
                    line1 = si;
                    line2 = ei;
                }
            if(heights[si]<heights[ei]){
                si++;
            }
            else{
                ei--;
            }
        }
        System.out.println("Maximum Water Stored : "+maxWater);
        System.out.println("Two Lines on x-axis forms a containeer that holds maximum water : "+heights[line1]+", "+heights[line2]);
    }

    // Pair Sum01 : Brute force approach
    // static boolean pairSum01(int[] nums, int target){
    //     for(int i=0; i<nums.length-1; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i]+nums[j] == target){
    //                 System.out.println(nums[i]+" + "+nums[j]+" = "+target);
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // Pair Sum01 : Two Pointer approach
    static boolean pairSum01(int[] nums, int target){
        int si=0; int ei=nums.length-1;
        while(si<ei){
            if(nums[si]+nums[ei] == target){
                System.out.println(nums[si]+" + "+nums[ei]+" = "+target);
                return true;
            }
            if(nums[si]+nums[ei]<target){
                si++;
            }
            else{
                ei--;
            }
        }
        return false;
    }

    // Pair Sum02
    static boolean pairSum02(ArrayList<Integer> list, int target){
        // find breaking point
        int lp = 0; int rp = 0; int n = list.size();
        for(int i=0; i<n-1; i++){
            if(list.get(i)>list.get(i+1)){
                rp = i;
                lp = i+1;
                break;
            }
        }
        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println(list.get(lp)+" + "+list.get(rp)+" = "+target);
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }
            else{
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        // adding values into ArrayList
        list.add(1); list.add(2); list.add(3); list.add(4);
        // printing ArrayList list
        System.out.println(list);

        // get element of specific index from ArrayList
        System.out.println(list.get(0));

        // removing an element completely from an ArrayList
        list.remove(1);
        System.out.println(list);

        // setting element at specifc index
        list.set(1, 9);
        System.out.println(list);

        // contains element or not?
        System.out.println(list.contains(4));
        System.out.println(list.contains(10));

        // adding element at specific index
        list.add(1,8);
        System.out.println(list);

        // getting the size of ArrayList list
        System.out.println(list.size());

        // reversing an ArrayList
        ArrayList<Character> chars = new ArrayList<>();
        System.out.print("Enter the size of ArrayList chars : ");
        int n = sc.nextInt();
        System.out.println("Now, Enter the values that can be stored into ArrayList chars");
        for(int i=0; i<n; i++){
            chars.add(i, sc.next().charAt(0));
        }
        System.out.println("Original ArrayList : "+chars);
        reverseArrList(chars);
        System.out.println("Reversed ArrayList : "+chars);
        
        // maximum number in ArrayList
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2); list1.add(5); list1.add(9); list1.add(3); list1.add(6);
        System.out.println("The maximum number in list1 ArraysList : "+findMax(list1));

        // swap two numbers
        System.out.print("Before Swapping : "+list1+"\n");
        swap(list1,1,3);
        System.out.print("After Swapping : "+list1+"\n");

        // sorting an ArrayList list1
        Collections.sort(list1);
        System.out.println("Sorted ArrayList in ascending order : "+list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("Sorted ArrayList in descending order : "+list1);

        // Multidimensional ArrayList
        // 1st multidimensional arraylist
        ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter the 4 integer values for Inner ArrayList nums");
        for(int i=0; i<4; i++){
            nums.add(sc.nextInt());
        }
        System.out.println("Enter the 4 integer values for Inner ArrayList nums1");
        ArrayList<Integer> nums1 = new ArrayList<>();
        for(int i=0; i<4; i++){
            nums1.add(sc.nextInt());
        }
        System.out.println("Multidimensional ArrayList mainList : ");
        mainList.add(nums); mainList.add(nums1);
        System.out.println(mainList);

        // 2nd multidimensional arraylist
        ArrayList <ArrayList<Integer>> mainList1 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();
        for(int i=1; i<=5; i++){
            list3.add(i);  //1 2 3 4 5
            list4.add(2*i); //2 4 6 8 10
            list5.add(3*i); //3 6 9 12 15
        }
        mainList1.add(list3); mainList1.add(list4); mainList1.add(list5);
        System.out.println("mainList1 Multidimensional ArrayList");
        for(int i=0; i<mainList1.size(); i++){
            ArrayList<Integer> Currlist = mainList1.get(i);
            for(int j=0; j<Currlist.size(); j++){
                System.out.print(Currlist.get(j)+" ");
            }
            System.out.println();
        }

        // Containeer with most water using arrays(brute force approach)
        int heights[] = {1,8,6,2,5,4,8,3,7};
        contWithMostWater(heights);

        // Containeer with most water using arraylists(brute force approach)
        ArrayList<Integer> heights1 = new ArrayList<>();
        heights1.add(1); heights1.add(8); heights1.add(6);
        heights1.add(2); heights1.add(5); heights1.add(4);
        heights1.add(8); heights1.add(3); heights1.add(7);
        contWithMostWater(heights1);

        // Two pointer approach
        contWM(heights);

        // Pair sum01
        int nums2[] = {1,2,3,4,5,6}; int target = 12;
        if(pairSum01(nums2,target)==true){
            System.out.println("Pair exists whose sum is equal to "+target);
        }
        else{
            System.out.println("Pair does not exist whose sum is equal to "+target);
        }

        // Pair sum02
        ArrayList<Integer> list2 = new ArrayList<>();
        int sum = 16;
        list2.add(11); list2.add(15); list2.add(6);
        list2.add(8); list2.add(9); list2.add(10);
        if(pairSum02(list2,sum)==true){
            System.out.println("Pair exists whose sum is equal to "+sum);
        }
        else{
            System.out.println("Pair does not exist whose sum is equal to "+sum);
        }

        sc.close();
    }
}
