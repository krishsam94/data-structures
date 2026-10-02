public class Ex17SelectionSort {
    public static void main(String[] args) {
      int[] arr = {5, 23, 7, 65, 9, 2, 54};

      // Finding Min and swapping
//      for(int i=0; i<arr.length-1; i++) {
//        int minIdx = i;
//        for(int j=i+1; j<arr.length; j++) {
//          if(arr[j] < arr[minIdx]) {
//            minIdx = j;
//          }
//        }
//        int temp = arr[minIdx];
//        arr[minIdx] = arr[i];
//        arr[i] = temp;
//      }
//      for (int j : arr) {
//          System.out.println(j);
//      }

      // Find max and swap
      for(int i=0; i<arr.length-1; i++) {
        int arrEnd = arr.length-i-1;
        int maxIdx = arrEnd;
        for(int j=0; j<arrEnd; j++) {
          if(arr[j] > arr[maxIdx]) {
            maxIdx = j;
          }
        }
        int temp = arr[maxIdx];
        arr[maxIdx] = arr[arrEnd];
        arr[arrEnd] = temp;
      }
      for (int j : arr) {
        System.out.println(j);
      }
    }
}
