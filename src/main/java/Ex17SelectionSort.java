public class Ex17SelectionSort {
    public static void main(String[] args) {
      int[] arr = {5, 23, 7, 65, 9, 2, 54};

      for(int i=0; i<arr.length-1; i++) {
        int minIdx = i;
        for(int j=i+1; j<arr.length; j++) {
          if(arr[j] < arr[minIdx]) {
            minIdx = j;
          }
        }
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp; 
      }
      for(int i=0; i<arr.length; i++) {
        System.out.println(arr[i]);
      }
    }
}
