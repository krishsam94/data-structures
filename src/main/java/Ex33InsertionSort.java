public class Ex33InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 10, 8, 3};
        doInsertionSort(arr);
        for (int j : arr) {
            System.out.println(j);
        }
    }
    static void doInsertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int iVal = arr[i];
            int j = i-1;
            // Run till 0 or arr Value greater than iVal
            while(j>=0 && arr[j]>iVal) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = iVal;
        }
    }
    static void doInsertionSort2(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int iVal = arr[i];
            int j;
            for(j=i-1; j>=0; j--) {
                if(arr[j] > iVal) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = iVal;
        }
    }
}
