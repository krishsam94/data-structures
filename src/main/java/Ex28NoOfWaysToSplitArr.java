public class Ex28NoOfWaysToSplitArr {
    // https://leetcode.com/problems/number-of-ways-to-split-array/
    public static void main(String[] args) {
        int[] nums = {10,4,-8,7};
        System.out.println(waysToSplitArray(nums));
    }
    static int waysToSplitArray(int[] nums) {
        int count = 0;
        int totalSum = 0;
        int sumOfI = 0;
        // First find sum of all elements in array
        for (int num : nums) {
            totalSum += num;
        }
        // then subtract sum of elements from totalSum and check
        // if sumOfI >= totalSum - sumOfI, if yes increment count
        for(int i=0; i<nums.length-1; i++) {
            sumOfI += nums[i];
            if (sumOfI >= (totalSum - sumOfI)) {
                count++;
            }
        }
        return count;
    }
}
