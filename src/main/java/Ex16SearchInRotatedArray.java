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
        if (nums[start] == target)
            return start;
        if (nums[end] == target)
            return end;
        // find largest number first
        while(start != end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) return mid;
            if(nums[mid] > nums[mid+1]){ // if mid is > mid + 1, then mid is Largest Number
                start = mid;
                break;
            } else if(nums[mid] < nums[start]) { // if Mid is < start, then largest should lie between start & mid
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        largestIdx = start;
        if(nums[largestIdx] == target) return largestIdx;
        // if first Ele is greater than target, then result lies in second part of array
        if(nums[0] > target) {
            // Search in second part, starting from largestIdx + 1
            start = largestIdx + 1;
            end = nums.length -1;
        } else {
            // Search in first part of array till largest number
            start = 0;
            end = largestIdx - 1;
        }
        return doBinarySearch(nums, target, start, end);
    }
    static int doBinarySearch(int[] nums, int target, int start, int end) {
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
