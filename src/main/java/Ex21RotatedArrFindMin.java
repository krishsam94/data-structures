public class Ex21RotatedArrFindMin {
    // https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
    public static void main(String[] args) {
      int[] nums = {3,4,5,1,2};
      // int[] nums = {4,5,6,7,0,1,2};
      // int[] nums = {11,13,15,17};
      // int[] nums = {2,1};
      System.out.println(findMin(nums));
    }
    static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        // is start < end, then array is not rotated or rotated 'n' times
        if(nums[start] < nums[end]) return nums[start];
        // find smallest number
        while(start < end) {
            int mid = start + (end - start)/2;
            if(start < mid && nums[mid-1] > nums[mid]){ // if mid-1 is > mid, then mid is Smallest Number
                return nums[mid];
            } else if(end > mid && nums[mid+1] < nums[mid]) { // if mid+1 is < mid, then mid is largest Number, so mid+1 is smallest
                return nums[mid+1];
            } else if(nums[mid] > nums[start]) { // if Mid is > start, then smallest should lie between mid+1 & end
                // mid > start, array is still increasing
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }
}
