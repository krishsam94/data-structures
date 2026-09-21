public class Ex16SearchInRotatedArray {
    // https://leetcode.com/problems/search-in-rotated-sorted-array/
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int largestIdx = 0;
        // find largest number first
        while(start != end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) return mid;
            if(nums[mid] > nums[mid+1]){
                end = mid;
            } else if(nums[mid] < nums[start]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        largestIdx = start;
        if(nums[largestIdx] == target) return largestIdx;
        // Search in first part of array till largest number
        start = 0;
        end = largestIdx - 1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        // Search in second part, starting from largestIdx + 1
        start = largestIdx + 1;
        end = nums.length -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
