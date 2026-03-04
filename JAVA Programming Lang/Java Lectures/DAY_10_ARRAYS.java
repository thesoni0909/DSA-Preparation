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
    //works only for an array which consists of  positive and combination of positive and negative numbers but not for an array which consists negative numbers only
    static void kadanes(int arr[]){
        int cs=0; int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(ms, cs);
        }
        System.out.println("The maximum sum of subarrays found in an array : "+ms);
    }

    //works for every type of integer array
    static void kadane_forall(int arr[]){
        int cs=0; int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=Math.max(arr[i], cs+arr[i]);
            ms=Math.max(ms, cs);
        }
        System.out.println("The maximum sum of subarrays found in an array : "+ms);
    }

    //Trapping Rainwater 
    //Brute force approach
    static void trapped_water(int arr[]){
        int len=arr.length; int total_tw=0; int maxright; int maxleft;
        int waterLevel; int tw;
        for(int i=0;i<len;i++){
            maxright=0;
            maxleft=0;
            for(int j=i+1;j<len;j++){
                if(arr[j]>maxright){
                    maxright=arr[j];
                }
            }
            for(int j=i-1;j>=0;j--){
                if(arr[j]>maxleft){
                    maxleft=arr[j];
                }
            }
            waterLevel=Math.min(maxleft, maxright);
            tw=(waterLevel-arr[i])*1;
            if(tw<0){
                tw=0;
            }
            System.out.print("tw = "+tw+", ");
            total_tw=total_tw+tw;
        }
        System.out.println("");
        System.out.println("The total trapped water = "+total_tw);
    }

    //Optimised approach
    static void trapped_water01(int arr[]){
        int len=arr.length; int total_tw=0; int tw; int waterLevel;
        //calculate maxleft for each values of given array and then store it in array
        int maxleft[]=new int[arr.length];
        maxleft[0]=arr[0];
        for(int i=1;i<len;i++){
            maxleft[i]=Math.max(maxleft[i-1],arr[i]);
        }
        //calculate maxright for each values of given array and then store it in array
        int maxright[]=new int[arr.length];
        maxright[len-1]=arr[len-1];
        for(int i=len-2;i>=0;i--){
            maxright[i]=Math.max(arr[i],maxright[i+1]);
        }
        //calculate total trapped water of given array
        for(int i=0;i<len;i++){
            waterLevel=Math.min(maxright[i],maxleft[i]);
            tw=waterLevel-arr[i];
            total_tw+=tw;
        }
        System.out.println("The total trapped water = "+total_tw);
    }

    //Buy and Sell Stocks
    static int stocks(int arr[]){
        int len=arr.length; int total_profit=0; int minstock=arr[0]; int maxprofit=0;
        for(int i=1;i<len;i++){
            minstock=Math.min(minstock,arr[i]);
            total_profit=arr[i]-minstock;
            maxprofit=Math.max(total_profit,maxprofit);
        }
        return maxprofit;
    }


    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        subarrays(numbers);
        maxSum(numbers);
        kadanes(numbers);
        kadane_forall(numbers);
        int height[]={4,2,0,6,3,2,5};
        trapped_water(height);
        trapped_water01(height);
        int prices[]={7,1,5,3,6,4};
        int profit=stocks(prices);
        System.out.println("The profit you gain from the stock you have purchased is "+profit);

    }
}
