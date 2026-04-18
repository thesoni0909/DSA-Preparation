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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // // creating an ArrayList
        // ArrayList<Integer> list = new ArrayList<>();
        // // adding values into ArrayList
        // list.add(1); list.add(2); list.add(3); list.add(4);
        // // printing ArrayList list
        // System.out.println(list);

        // // get element of specific index from ArrayList
        // System.out.println(list.get(0));

        // // removing an element completely from an ArrayList
        // list.remove(1);
        // System.out.println(list);

        // // setting element at specifc index
        // list.set(1, 9);
        // System.out.println(list);

        // // contains element or not?
        // System.out.println(list.contains(4));
        // System.out.println(list.contains(10));

        // // adding element at specific index
        // list.add(1,8);
        // System.out.println(list);

        // // getting the size of ArrayList list
        // System.out.println(list.size());

        // reversing an ArrayList
        // ArrayList<Character> chars = new ArrayList<>();
        // System.out.print("Enter the size of ArrayList chars : ");
        // int n = sc.nextInt();
        // System.out.println("Now, Enter the values that can be stored into ArrayList chars");
        // for(int i=0; i<n; i++){
        //     chars.add(i, sc.next().charAt(0));
        // }
        // System.out.println("Original ArrayList : "+chars);
        // reverseArrList(chars);
        // System.out.println("Reversed ArrayList : "+chars);
        
        // maximum number in ArrayList
        // ArrayList<Integer> list1 = new ArrayList<>();
        // list1.add(2); list1.add(5); list1.add(9); list1.add(3); list1.add(6);
        // System.out.println("The maximum number in list1 ArraysList : "+findMax(list1));

        // swap two numbers
        // System.out.print("Before Swapping : "+list1+"\n");
        // swap(list1,1,3);
        // System.out.print("After Swapping : "+list1+"\n");

        // sorting an ArrayList list1
        // Collections.sort(list1);
        // System.out.println("Sorted ArrayList in ascending order : "+list1);
        // Collections.sort(list1, Collections.reverseOrder());
        // System.out.println("Sorted ArrayList in descending order : "+list1);

        // Multidimensional ArrayList
        // 1st multidimensional arraylist
        // ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();
        // ArrayList<Integer> list1 = new ArrayList<>();
        // System.out.println("Enter the 4 integer values for Inner ArrayList list1");
        // for(int i=0; i<4; i++){
        //     list1.add(sc.nextInt());
        // }
        // System.out.println("Enter the 4 integer values for Inner ArrayList list2");
        // ArrayList<Integer> list2 = new ArrayList<>();
        // for(int i=0; i<4; i++){
        //     list2.add(sc.nextInt());
        // }
        // System.out.println("Multidimensional ArrayList mainList : ");
        // mainList.add(list1); mainList.add(list2);
        // System.out.println(mainList);

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
        sc.close();
    }
}
