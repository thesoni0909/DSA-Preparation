// Divide and Conquer

public class DAY_18 {
    // Merge Sort
    static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = (si+ei)/2;
        // Left Part call
        mergeSort(arr, si, mid);
        // Right Part call
        mergeSort(arr, mid+1, ei);
        // merge both part
        merge(arr,si,mid,ei);
    }
    static void merge(int arr[], int si, int mid, int ei){
        int temp[] = new int[ei-si+1];
        int i=si; int j=mid+1;  int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    // Quick Sort
    static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pivotIdx = partition(arr, si, ei);
        // left part call
        quickSort(arr, si, pivotIdx-1);
        // right part call
        quickSort(arr, pivotIdx+1, ei);
        
    }
    
    static int partition(int arr[], int si, int ei) {
        int i = si - 1;
        int j = si;
        int pivotIdx = ei;
        while (j <= pivotIdx) {
            if (arr[j] <= arr[pivotIdx]) {
                i++;
                if (i != j) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            j++;
        }
        pivotIdx = i;
        return pivotIdx;
    }

    // Search in rotated sorted array using recursion
    static int rotSortSearch(int arr[], int si, int ei, int target){
        if(si>ei){
            return -1;
        }
        int midIdx = (si+ei)/2;
        // compare midvalue with target
        if(arr[midIdx]==target){
            return midIdx;
        }
        // midvalue on line 1
        else if(arr[si]<=arr[midIdx]){
            // case a : check target value on the left side of line 1, if it lies in between si and mid
            if(arr[si]<=target && target<=arr[midIdx]){
                return rotSortSearch(arr, si, midIdx-1, target);
            }
            // case b : check target value on the right side of the mid, if it lies between mid and ei
            else{
                return rotSortSearch(arr, midIdx+1, ei, target);
            }
        }
        // midvalue on line 2
        else{
            // case c : check target value on the right side of line 2, if it lies in between mid and ei
            if(arr[midIdx]<=target && target<=arr[ei]){
                return rotSortSearch(arr, midIdx+1, ei, target);
            }
            // case d : check target value on the left side of the mid, if it lies in between si and mid
            else{
                return rotSortSearch(arr, si, midIdx-1, target);
            }
        }
    }

    // Search in rotated sorted array using loop
    static int rotSortSearch1(int arr[], int si, int ei, int target){
        while(si<=ei){
            int midIdx = (si+ei)/2;
            // compare midvalue with target
            if(arr[midIdx]==target){
                return midIdx;
            }

            // midvalue on line 1
            else if (arr[si] <= arr[midIdx]) {
                // case a : check target value on the left side of line 1, if it lies in between
                // si and mid
                if (arr[si] <= target && target <= arr[midIdx]) {
                    ei = midIdx-1;
                }
                // case b : check target value on the right side of the mid, if it lies between
                // mid and ei
                else{
                    si=midIdx+1;
                }
            }

            // midvalue on line 2
            else {
                // case c : check target value on the right side of line 2, if it lies in
                // between mid and ei
                if (arr[midIdx] <= target && target <= arr[ei]) {
                    si=midIdx+1;
                }
                // case d : check target value on the left side of the mid, if it lies in
                // between si and mid
                else {
                    ei = midIdx-1;
                }
            }
        }
        return -1;
    }

    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,5,5};

        mergeSort(arr, 0, arr.length-1);
        printArr(arr);

        quickSort(arr, 0, arr.length-1);
        printArr(arr);

        int arr1[] = {4,5,6,7,0,1,2};
        System.out.println("The target value lies on the index : "+rotSortSearch(arr1, 0, arr1.length-1, 5));

        System.out.println("The target value lies on the index : "+rotSortSearch1(arr1, 0, arr1.length-1, 5));
    }
}
