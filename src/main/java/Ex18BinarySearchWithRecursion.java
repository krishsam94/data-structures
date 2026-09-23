public class Ex18BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 9, 14, 23, 33, 67, 87, 90};
        int target = 1;
        int result = binarySearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        return doSearch(start, end, target, arr);
    }
    static int doSearch(int start, int end, int target, int[] arr) {
      if (start <= end) {
            int mid = start + (end -start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            return doSearch(start, end, target, arr);
        } else {
          return -1;
        }
    }
}
