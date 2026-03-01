// ARRAYS Part 02

public class DAY_10_ARRAYS {

    //Brute Force
    //print subarrays in array and find the sum of each subarrays and then find the maximum sum out of everys sums of subarrays.
    static void subarrays(int arr[]){
        int k=0; int sum; int maxSum=Integer.MIN_VALUE;
        while(k<arr.length){
            for(int i=k;i<arr.length;i++){
            sum=0;
                for(int j=k;j<=i;j++){
                    System.out.print(arr[j]+" ");
                    sum=sum+arr[j];
                }
            System.out.println("");
            System.out.println("sum = "+sum);
            if(sum>maxSum){
                maxSum=sum;
            }
            }
        System.out.println("");
        k++;
        }
    System.out.println("Maxsum = "+maxSum);
    }

    // Prefix Sum(optimised solution)
    //find max sum of subarrays by creating an arrays which stores sum of values till 'i'th element in array
    static void maxSum(int arr[]){
        int prefix_array[]=new int[arr.length]; int sum=0; int currSum; int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            prefix_array[i]=sum;
            // System.out.println(prefix_array[i]);
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = (i==0)?prefix_array[j]:prefix_array[j]-prefix_array[i-1];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("The maximum value of sum of subarrays of a array is "+maxSum);
    }

    //Kadane's Algorithm(very optimised solution) : finds maximum value of sum of subarrays found in an array.
    static void kadanes(int arr[]){
        int cs=0; int ms=0;
        for(int i=0;i<arr.length;i++)
    }

    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        subarrays(numbers);
        maxSum(numbers);
    }
}
