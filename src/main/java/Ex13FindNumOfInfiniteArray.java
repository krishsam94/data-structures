public class Ex13FindNumOfInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 7, 8, 8, 10, 14, 18, 19, 20, 22, 25, 27, 29, 30, 32, 33, 34, 36, 38};
        // Consider arr as infinite
        int target = 29;
        int index = findNumInArr(arr, target);
        System.out.println(index);
    }
    static int findNumInArr(int[] arr, int target) {
        // Lets start with chunk of 2 & double it each time
        int start = 0;
        int end = 1;
        // check if target is greater than arr[end],
        // if yes, then no need to do binary search because it won't be there
        while(arr.length > end && target > arr[end]) {
            System.out.println("start ::" + start);
            System.out.println("end ::" + end);

            int doubleSize = (end - start + 1) * 2; // formula for calculating chunk size to double it
            start = end + 1;
            end =  end + doubleSize;
        }
        return doBinarySearch(start, end, arr, target);
    }
    static int doBinarySearch(int start, int end, int[] arr, int target) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
