public class Ex14FindMaxInMountainArr {
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int peakIndex = findPeakIndex(arr);
        System.out.println("Peak index: " + peakIndex);
    }

    public static int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        // We need to end this loop when start == end, because at that point we have found the peak element
        while(start != end) {
            int mid = start + (end - start)/2;
            // means number is decreasing, then mid or previous part will contain answer
            if(arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
