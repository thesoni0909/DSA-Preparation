//  2D ARRAYS

import java.util.*;
public class DAY_12 {

    // Searching specific element in 2D Array
    static void SearchElement(int[][] arr, int target){
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==target){
                    System.out.println("Element is found at index ("+i+", "+j+")");
                    return;
                }
            }
        }
        System.out.println("Element is not found");
    }

    // Finding largest element in 2D Array
    static void LargestElement(int [][] arr){
        int n=arr.length; int m=arr[0].length; int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println("The Largest Element in 2D Array : "+max);
    }

    // Finding smallest element in 2D Array
    static void SmallestElement(int [][] arr){
        int n=arr.length; int m=arr[0].length; int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(min>arr[i][j]){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("The Smallest Element in 2D Array : "+min);
    }

    // Printing first row of 2D Array
    static void FirstRow(int [][] arr){
        int n=arr.length; int m=arr[0].length;
        for(int i=0; i<=n-3; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println("");
        }
    }

    // Spiral Matrix
    static void SpiralMatrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int sR = 0;
        int eR = n - 1;
        int sC = 0;
        int eC = m - 1;
        while (sR <= eR && sC <= eC) {
            if (sR == eR && sC == eC){
                System.out.print(arr[sR][sC]+" ");
                break;
            }
            // starting row
            for (int j = sC; j <= eC - 1; j++) {
                System.out.print(arr[sR][j]+" ");
            }
            // ending column
            for(int j=sR; j<=eR-1; j++){
                System.out.print(arr[j][eC]+" ");
            }
            // ending row
            for(int j=eC; j>=sC+1; j--){
                System.out.print(arr[eR][j]+" ");
            }
            // starting column
            for(int j=eR; j>=sR+1; j--){
                System.out.print(arr[j][sC]+" ");
            }

            sR++;
            eC--;
            eR--;
            sC++;
        }
        System.out.println(" ");
    }

    // Print the sum of diagonals of 2D array of size n*m where n==m.
    static int DiagonalsSum(int[][] arr){
        int n=arr.length;
        int m=arr[0].length;
        int primary=0; int secondary=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    primary=primary+arr[i][j];
                }
                if((i+j)==(n-1)&&i!=j){
                    secondary=secondary+arr[i][j];
                }
            }
        }
        return primary+secondary;
    }

    // sum of diagonals : optimised code (of time complexity O(n))
    static int DiagonalsSum01(int[][] arr){
        int n=arr.length;
        int primary=0; int secondary=0;
        for(int i=0;i<n;i++){
            primary+=arr[i][i];
            if(i!=(n-1-i)){
                secondary+=arr[i][n-1-i];
            }
        }
        return primary+secondary;
    }

    // Search in sorted matrix : Staircase Search
    // using (0,m-1) cell value
    static void StaircaseSearch(int [][] arr, int key){
        int n=arr.length; int m=arr[0].length;
        int i=0; int j=m-1;
        while((i<=n-1)&&(j>=0)){
            if(key==arr[i][j]){
                System.out.println("Element is found at index ("+i+", "+j+")");
                return;
            }
            else if(key<arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Element is not found!");
    }

    // using (n-1,0) cell value
    static void StaircaseSearch01(int [][] arr, int key){
        int n=arr.length; int m=arr[0].length;
        int i=n-1; int j=0;
        while((j<=m-1)&&(i>=0)){
            if(key==arr[i][j]){
                System.out.println("Element is found at index ("+i+", "+j+")");
                return;
            }
            else if(key<arr[i][j]){
                i--;
            }
            else{
                j++;
            }
        }
        System.out.println("Element is not found!");
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // creation
        // int matrix[][]=new int [3][3];
        // int n=matrix.length;
        // int m=matrix[0].length;

        // Input values of 2D Array
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         matrix[i][j]=sc.nextInt();
        //     }
        // }

        // Printing values of 2D Array
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // SearchElement(matrix,7);

        // int Arr2D[][]={{1,3,2,4},{9,10,12,11},{6,5,8,7}};
        // LargestElement(Arr2D);
        // SmallestElement(Arr2D);
        // FirstRow(Arr2D);

        int SpiralMatrix[][]={{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        SpiralMatrix(SpiralMatrix);
        System.out.println(DiagonalsSum(SpiralMatrix));
        System.out.println(DiagonalsSum01(SpiralMatrix));

        int SortedMatrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        StaircaseSearch(SortedMatrix,33);
        StaircaseSearch01(SortedMatrix, 45);

    }
}
