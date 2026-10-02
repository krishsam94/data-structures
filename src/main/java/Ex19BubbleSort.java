public class Ex19BubbleSort {
    // https://leetcode.com/problems/sort-colors/description/
    public static void main(String[] args) {
      int[] arr = {3, 65, 2, 5, 23, 76, 32, 1, 8, 68};
      boolean swapped = false;
      // No need to compare last, because it will be automatically sorted if rem all are sorted
      for(int i=0; i<arr.length-1; i++) {
        swapped = false;
        // its enough to compare till arr length - i
        // because last i elements are already sorted in prev runs
        for(int j=0; j<arr.length-1-i; j++) {
          // In bubble sorting, we need to compare current & next ele of current loop
          if(arr[j] > arr[j+1]) {
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;
            swapped = true;
          }
        }
        // If arr is not swapped for entire loop of 'j', then arr is already sorted
        // so break the loop
        if(!swapped) {
          break;
        }
      }
      for (int j : arr) {
          System.out.println(j);
      }
    }
}
