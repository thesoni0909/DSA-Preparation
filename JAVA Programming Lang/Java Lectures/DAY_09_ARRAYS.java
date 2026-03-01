// ARRAYS Part 01

import java.util.*;
public class DAY_09_ARRAYS {

    //updating the 'numbers' array's values by 1
    static void updateArray(int numbers[]){
        int len=numbers.length;
        for(int i=0;i<len;i++){
            numbers[i]=numbers[i]+1;
        }
    }

    //Linear Search
    //write a func to search a specific integer value in array and return the index of that key
    static int LinearSearch(int StudentMarks[]){
        int len = StudentMarks.length;
        for(int i=0;i<len; i++){
            if(StudentMarks[i]==16){
                return i;
            }
        }
        return -1;
    }

    //write a func to search a specific string value in an array and return the index of that key
    static int LinearSearch(String Dishes[]){
        int len=Dishes.length;
        for(int i=0;i<len;i++){
            if(Dishes[i]=="Chole kulche"){
                return i;
            }
        }
        return -1;
    }

    //write a func to find largest number in a given array
    static int LargestNumber(int num[]){
        int len = num.length;
        int largestNum=Integer.MIN_VALUE; //integer.MIN_VALUE==minus infinity
        for(int i=0;i<len;i++){
            if(num[i]>largestNum){
                largestNum=num[i];
            }
        }
        return largestNum;
    }

    //write a func to find smallest number in a given array
    static int SmallestNumber(int num[]){
        int len=num.length;
        int SmallestNum=Integer.MAX_VALUE; //integer.MAX_VALUE == +infinity
        for(int i=0;i<len;i++){
            if(num[i]<SmallestNum){
                SmallestNum=num[i];
            }
        }
        return SmallestNum;
    }

    //Binary Search
    //write a func to search specific value '10'  in sorted array
    static int BinarySearch(int arr[],int key){
        int len=arr.length; int start=0; int end=len-1; int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    //Reverse an array

    //by creating a new array
    static int[] ReverseArray(int arr[]){
        int len = arr.length; int reversedarr[]= new int[len]; int j=0;
        for(int i=len-1;i>=0;i--){
            reversedarr[j]=arr[i];
            j++;
        }
        return reversedarr;
    }

    //by reversing original array
    static int[] ReverseArray01(int arr[]){
        int len=arr.length; int start=0; int end=len-1; int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++; end--;
        }
        return arr;
    }

    //Pairs in array
    static void pairs_in_arr(int arr[]){
        int total_pairs=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+", ");
                total_pairs++;
            }
            System.out.println("");
        }
        System.out.println("The total Pairs found in this array is "+total_pairs);
    }

    //Brute Force
    //print subarrays of array.
    static void subarrays(int arr[]){
        int k=0; int total_subarrays=0;
        while(k<arr.length){
            for(int i=k;i<arr.length;i++){
                for(int j=k;j<=i;j++){
                    System.out.print(arr[j]+" ");
                }
            total_subarrays++;
            System.out.println("");
            }
        System.out.println("");
        k++;
        }
    System.out.println("The total subarrays found in this array is "+total_subarrays);
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Creation of array
        int marks[]=new int[50];

        //input in array
        System.out.println("Enter Your marks here : ");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        //output in array
        System.out.println("Physics : "+marks[0]);
        System.out.println("Chemistry : "+marks[1]);
        System.out.println("Maths : "+marks[2]);

        //update values in array
        marks[2]=100;
        marks[2]=marks[2]+1;
        System.out.println("Updated Marks of Maths : "+marks[2]);

        //Calculate percentage of marks in all subjects
        double total_marks=marks[0]+marks[1]+marks[2];
        double percentage=((total_marks/300)*100);
        System.out.print("The percentage : "+percentage+ " %"+"\n");

        //Calculation length of array marks
        System.out.println("The length of marks array : "+marks.length);

        //array as a function argument
        int numbers[]={23,33,43};
        updateArray(numbers);
        //verifying that values in array are updated or not?
        int len=numbers.length;
        for(int i=0;i<len;i++){
            System.out.print(numbers[i]+ ", ");
        }
        System.out.println("");

        //Linear Search
        int StudentMarks[]={2,4,6,8,10,12,14,16};
        int result = LinearSearch(StudentMarks);
        if(result==-1){
            System.out.println("Element is not found.");
        }
        else{
            System.out.println("Element is found at index "+result+".");
        }

        String Dishes[]={"Dosa", "Chole Bhature", "Samosa", "Sandwitch", "Coke"};
        int result01=LinearSearch(Dishes);
        if(result01==-1){
            System.out.println("This Dish is not in the menu, Please choose other dish. Thank You!");
        }
        else{
            System.out.println("This dish is found at "+result01+". Please Order.");
        }

        //Largest Number
        int num[]={1,2,6,3,5};
        int largestNum=LargestNumber(num);
        System.out.println("The largest number in given array : "+largestNum);
        int SmallestNum=SmallestNumber(num);
        System.out.println("The largest number in given array : "+SmallestNum);

        //Binary Search
        int arr[]={2,4,6,8,10,12,14};
        int target=8;
        int result02=BinarySearch(arr, target);
        if(result02==-1){
            System.out.println("The Target value "+target+ " is not found in arr.");
        }
        else{
            System.out.println("The Target value "+target+" is at index "+result02+" in arr.");
        }

        int arr01[]={1,2,3,4,5};
        int target01=5;
        int result03=BinarySearch(arr01, target01);
        if(result03==-1){
            System.out.println("The Target value "+target01+ " is not found in arr01.");
        }
        else{
            System.out.println("The Target value "+target01+" is at index "+result03+" in arr01.");
        }

        //reverse an array
        int arr02[]={2,4,6,8,10};
        int reversedarr[]=ReverseArray(arr02);
        for(int i=0;i<reversedarr.length;i++){
            System.out.println(reversedarr[i]);
        }

        int arr03[]={5,7,4,1,9,6};
        ReverseArray01(arr03);
        for(int i=0;i<arr03.length;i++){
            System.out.println(arr03[i]);
        }

        //pairs in array
        pairs_in_arr(arr02);

        //subarrays in array
        subarrays(arr02);

        sc.close();
    }
}