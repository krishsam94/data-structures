import java.util.Arrays;

public class Ex26QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 8, 1, 2};
        // int[] arr = {7, 3, 43, 6, 2, 1, 12, 5};
        // int[] arr = {1, 2, 3, 4, 5, 6};
        quickSort2(arr, 0, arr.length-1);
    }
    // Hoare's partition scheme
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        // Step 1: take mid as pivot
        int start = low;
        int end = high;
        int mid = start + (end-start)/2;
        int pivot = arr[mid];
        while(start < end) {
            // Step 2: See if element at start is less than pivot
            // If yes, increment start else break the loop
            while(arr[start] < pivot) {
                start++;
            }
            // Step 3: Similarly check for end
            while(arr[end] > pivot) {
                end--;
            }
            // Step 4: check if start <= end,
            // Consider we are passing {1, 2, 3, 4, 5, 6}, this is already sorted
            // if below check is not done then swapping will be done for wrong elements
            if (start <= end) {
                // Step 5: Swap elements so that lower ele will be at left and higher ele at right
                int temp = arr[end];
                arr[end] = arr[start];
                arr[start] = temp;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
        // Step 6: After completing for one ele, continue recursion for (low, end) & (start, high)
        // why we are taking till (low, end)
        // because in above loop, end may be at middle or middle -1
        quickSort(arr, low, end);
        quickSort(arr, start, high);
    }

    // Lomuto's partition scheme
    static void quickSort2(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivot = arr[high];   // pivot = last element
        int pivotIndex = low;     // Start from low
        // ToDo: we can also take pivotIndex as high and reverse below loop with arr[j] >= pivot
        
        for (int j = low; j < high; j++) {
            // Increment the index of pivot if element is less than or equal to pivot
            if (arr[j] <= pivot) {
                int temp = arr[pivotIndex];
                arr[pivotIndex] = arr[j];
                arr[j] = temp;
                pivotIndex++;
            }
        }

        // place pivot in its correct final position
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[high];
        arr[high] = temp;

        System.out.println(Arrays.toString(arr));

        // recursion (excludes pivot since it's already in final position)
        quickSort2(arr, low, pivotIndex - 1);
        quickSort2(arr, pivotIndex + 1, high);
    }
}
