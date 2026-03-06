// -----Practice Questions ------
// Sorting

public class DAY_11_P {

    // Bubble Sort
    static void BubbleSort(int[] arr) {
        System.out.println("This is Bubble Sort.");
        int n = arr.length;
        int temp;
        int n2 = n - 2;
        for (int i = 0; i <= n - 2; i++) {
            int swap = 0;
            for (int j = 0; j <= n2; j++) {
                if (arr[j + 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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

    // Selection Sort
    static void SelectionSort(int[] arr) {
        System.out.println("This is Selection Sort.");
        int n = arr.length;
        int temp;
        int min;
        for (int i = 0; i <= n - 2; i++) {
            min = i;
            for (int j = i; j <= n - 2; j++) {
                if (arr[j + 1] > arr[min]) {
                    min = j + 1;
                }
            }
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    // Insertion Sort
    static void InsertionSort(int[] arr) {
        System.out.println("This is Insertion Sort.");
        int n = arr.length;
        int temp;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Counting Sort
    static void CountingSort(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n - 2; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int count[] = new int[max + 1];
        for (int i = 0; i < n; i++) {
            int j = arr[i];
            count[j]++;
        }

        int j = arr.length - 1;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j--;
            }
        }
    }

    //Print elements of arrays
    static void PrintElement(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        
        /*
        Question : Use the following sorting algorithms to sort an array in DESCENDING order :
        a.Bubble Sort
        b.Selection Sort
        c.Insertion Sort
        d.Counting Sort
        You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]
        */

        int arr[]={3,6,2,1,8,7,4,5,3,1};

        // Bubble Sort
        // BubbleSort(arr);
        // PrintElement(arr);
        
        // Selection Sort
        // SelectionSort(arr);
        // PrintElement(arr);

        // Insertion Sort
        // InsertionSort(arr);
        // PrintElement(arr);

        // Counting Sort
        CountingSort(arr);
        PrintElement(arr);


    }
}
