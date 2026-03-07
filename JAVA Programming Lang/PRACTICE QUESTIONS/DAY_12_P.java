// -----Practice Questions ------
// 2D Arrays

public class DAY_12_P {

    // Count the number 7.
    static void countnumber7(int[][] arr){
        int n=arr.length; int m=arr[0].length; int count=0;
        for(int i=0;i<n;i++){
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("The number 7 appears in given array is "+count+" times.");
    }

    // Sum of second row
    static void sumOfsecondRow(int[][] arr){
        int m=arr[0].length; int sum=0;
            for (int j = 0; j < m; j++) {
                sum+=arr[1][j];
            }
        System.out.println("The sum of elements of second row is "+sum);
    }

    // Transpose of a matrix
    static void  TransposeofMatrix(int[][] arr){
        int n=arr.length; int m=arr[0].length;
        int[][] TransposedMatrix=new int[m][n];
        for(int i=0;i<m; i++){
            for(int j=0; j<n; j++){
                TransposedMatrix[i][j]=arr[j][i];
            }
        }
        for(int i=0;i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(TransposedMatrix[i][j]+" ");
            }
        System.out.println(" ");
        }
    }

    public static void main(String[] args) {

        /*
        Question 1 : Print the number of 7's that are in the 2d array.
        Example :Input - int[][] array = { {4,7,8},{8,8,7} };
        Output - 2
        */

        int[][] array={{4,7,8},{8,8,7}};
        countnumber7(array);

        /*
        Question 2 : Print out the sum of the numbers in the second row of the “nums” array.
        Example :Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        Output - 18
        */

        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        sumOfsecondRow(nums);

        /*
        Question 3 : Write a program to Find Transpose of a Matrix.
        What is Transpose? Transpose of a matrix is the process of swapping the rows to columns. For a 2x3 matrix,
        Matrix
        a11    a12    a13
        a21    a22    a23
        Transposed Matrix
        a11    a21
        a12    a22
        a13    a23
        */

        int[][] matrix={{1,2,3},{4,5,6}};
        TransposeofMatrix(matrix);
    }
}
