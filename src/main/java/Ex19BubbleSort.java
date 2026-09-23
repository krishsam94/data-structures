public class Ex19BubbleSort {
    // https://leetcode.com/problems/sort-colors/description/
    public static void main(String[] args) {
      int[] arr = {3, 65, 2, 5, 23, 76, 32};
      for(int i=0; i<arr.length-1; i++) {
        for(int j=0; j<arr.length-1; j++) {
          // In bubble sorting, we need to compare current & next ele of current loop
          if(arr[j] > arr[j+1]) {
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;
          }
        }
      }
      for(int i=0; i<arr.length; i++) {
        System.out.println(arr[i]);
      }
    }
}
