public class Ex20RotatedArrWithDuplicates {
    public static void main(String[] args) {
      int[] nums = {1, 0, 1, 1, 1};
      System.out.println(search(nums, 0));
    }
    static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int largestIdx = 0;
        if (nums[start] == target)
            return true;
        if (nums[end] == target)
            return true;
        // find largest number first
        while(start != end) {
            int mid = start + (end - start)/2;
            if (nums[mid] == target) return true;
            if(nums[mid] > nums[mid+1]){ // if mid is > mid + 1, then mid is Largest Number
                start = mid;
                break;
            } else if (nums[start] == nums[start+1]) start++; // if start and start+1 are same, increase start by 1
            else if (nums[end] == nums[end-1]) end--; // if end and prev values are same, decrease end by 1
            else if(nums[mid] < nums[start]) { // if Mid is < start, then largest should lie between start & mid
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        largestIdx = start;
        if(nums[largestIdx] == target) return true;
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
    static boolean doBinarySearch(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                return true;
            } else if(nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

}
