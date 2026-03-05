// Sorting

import java.util.Arrays;   // or import java.util.*;  <--- it loads all classes and packages,,hence no need to import arrays package separately
import java.util.Collections;
public class DAY_11_Sorting {

    // Bubble Sort
    static void Bubble_Sort(int arr[]){
        System.out.println("This is Bubble sort.");
        int n=arr.length;
        int n2=n-2;
        int temp;
        for(int i=0;i<n;i++){
            int swap=0;
            for(int j=0;j<=n2;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap==0){
                System.out.println("The array is sorted in "+(i+1)+" turns.");
                return;
            }
            n2--;
        }
    }

    //Selection Sort
    static void Selection_Sort(int[] arr){
        System.out.println("This is selection sort.");
        int n=arr.length; int smallest; int temp;
        for(int i=0;i<=n-2;i++){
            smallest=i;
            for(int j=i;j<=n-2;j++){
                if(arr[smallest]>arr[j+1]){
                    smallest=j+1;
                }
            }
            temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
    }

    //Insertion Sort
    static void Insertion_Sort(int[] arr){
        System.out.println("This is insertion sort.");
        int n=arr.length; int temp;
        for(int i=1;i<n;i++){
            for(int j=i;j>0;j--){
            if(arr[j]<arr[j-1]){
                temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
            else{
                break;
            }
            }
        }
    }

    //Counting Sort
    static void Counting_Sort(int[] arr){
        int n=arr.length; int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //creating count array
        int count[]=new int[max+1];
        for(int i=0;i<n; i++){
            int j=arr[i];
            count[j]=count[j]+1;
        }
        //sorting the array
        int x=0;
        for(int j=0;j<count.length;j++){
            while(count[j]!=0){
                arr[x]=j;
                count[j]=count[j]-1;
                x++;
            }
        }
    }

    //printing the elements of above arrays after sorting
    static void print_elements(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        int arr01[]={5,4,1,3,2};
        Bubble_Sort(arr01);
        print_elements(arr01);
        Selection_Sort(arr01);
        print_elements(arr01);
        Insertion_Sort(arr01);
        print_elements(arr01);
        int arr02[]={1,4,1,3,2,4,3,7};
        Counting_Sort(arr02);
        print_elements(arr02);

        //inbuilt sorting
        int arr03[]={3,4,2,0,6,5};
        // Arrays.sort(arr03);
        // print_elements(arr03);
        Arrays.sort(arr03,0,3);
        print_elements(arr03);
        Integer arr04[]={4,4,0,2,9,6};
        // Arrays.sort(arr04,Collections.reverseOrder());
        // for(int i=0;i<arr04.length;i++){
        //     System.out.print(arr04[i]+", ");
        // }
        Arrays.sort(arr04,0,4,Collections.reverseOrder());
        for(int i=0;i<arr04.length;i++){
            System.out.print(arr04[i]+", ");
        }
    }
}
