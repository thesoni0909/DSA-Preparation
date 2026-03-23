// Recursion - Part01

public class DAY_16 {
    // print numbers from n to 1
    static void printNto1(int n){
        if(n==1){
            System.out.println(n); return;
        }
        System.out.print(n+" ");
        printNto1(n-1);
    }

    // print numbers from 1 to n
    static void print1toN(int i, int n){
        if(i==n){
            System.out.println(n); return;
        }
        System.out.print(i+" ");
        print1toN(i+1, n);
    }

    // print factorial of n
    static int factorialOfn(int n){
        if(n==0){
            return 1;
        }
        int fact = n*factorialOfn(n-1);
        return fact;
    }

    // print sum of first n natural numbers
    static int sumOffirstN(int n){
        if(n==1){
            return 1;
        }
        return n+sumOffirstN(n-1);
    }

    // print nth fibonacci number
    static int nthFibonacciNum(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return nthFibonacciNum(n-1)+nthFibonacciNum(n-2);
    }

    // check if a given array is sorted or not?
    static boolean isSorted(int i, int[] arr){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<=arr[i+1]){
            return isSorted(i+1, arr);
        }
        return false;
    }

    // write a function to find the first occurence of an element in an array.
    static int firstOccur(int i, int[] arr, int key){
        if(i==arr.length){
            return -1;
        }
        else if(arr[i]==key){
            return i;
        }
        else{
            return firstOccur(i+1, arr, key);
        }
    }

    // write a function to find the last occurence of an element in an array

    // first method :
    // static int lastOcuur(int i, int[] arr, int key, int count){
    //     if(i==arr.length){
    //         return count;
    //     }
    //     else if(arr[i]==key){
    //         count = i;
    //     }
    //     return lastOcuur(i+1, arr, key, count);
    // }

    // second method
    static int lastOcuur(int i, int[] arr, int key){
        if(i==-1){
            return i;
        }
        else if(arr[i]==key){
            return i;
        }
        else{
            return lastOcuur(i-1, arr, key);
        }
    }

    // print x^n
    // method 01
    static int calcPowerXn(int x, int n){
        if(n==0){
            return 1;
        }
        return 2*calcPowerXn(x, n-1);
    }

    // optimised method
    static int calcPowerXn01(int x, int n){
        if(n==1){
            return x;
        }
        int halfPow = calcPowerXn01(x, n/2);
        int halfPowSq = halfPow*halfPow;
        if(n%2!=0){
            return x*halfPowSq;
        }
        return halfPowSq;
    }

    public static void main(String[] args) {
        int n = 10;
        printNto1(n);
        print1toN(1,n);

        System.out.println(factorialOfn(5));
        System.out.println(sumOffirstN(5));
        System.out.println(nthFibonacciNum(8));

        int arr[] = {1,2,2,2,2};
        System.out.println(isSorted(0, arr));
        
        int result = firstOccur(0, arr, 5);
        if(result!=-1){
            System.out.println("The key is present at index: "+result);
        }
        else{
            System.out.println("The key is not found!");
        }

        // first method :
        // int result01 = lastOcuur(0, arr, 2, -1);
        // if(result01!=-1){
        //     System.out.println("The key is present at index: "+result01);
        // }
        // else{
        //     System.out.println("The key is not found!");
        // }

        // 2nd method :
        int result01 = lastOcuur(arr.length-1, arr, 2);
        if(result01!=-1){
            System.out.println("The key is present at index: "+result01);
        }
        else{
            System.out.println("The key is not found!");
        }

        System.out.println(calcPowerXn(2, 5));
        System.out.println(calcPowerXn01(2, 5));
    }
}
