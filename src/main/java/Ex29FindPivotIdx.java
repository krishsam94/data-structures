public class Ex29FindPivotIdx {
    // https://leetcode.com/problems/find-pivot-index/
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
    static int pivotIndex(int[] nums) {
        int totalSum = 0;
        // Find sum of all elements in array
        for(int i : nums) {
            totalSum += i;
        }
        int subSum = 0;
        // then subtract sum of elements from totalSum and check
        // if subSum == totalSum - subSum - nums[i], if yes return index
        for(int i=0; i<nums.length; i++) {
            if (subSum == (totalSum - subSum - nums[i])){
                return i;
            } else {
                subSum += nums[i];
            }
        }
        return -1;
    }
}
