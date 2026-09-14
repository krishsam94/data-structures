public class Ex7NumOfSmallerNumbers {
    public static void main(String[] args) {
        int[] nums = {6,5,4,8};
        int[] result = smallerNumbersThanCurrent2(nums);
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    // Approach 1: Brute Force
    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] res = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int greaterCount = 0;
            for(int j=0; j<nums.length; j++) {
                if(i != j && nums[j] < nums[i]){
                    greaterCount++;
                }
            }
            res[i] = greaterCount;
        }
        return res;
    }
    // Approach 2: Optimized - Counting Sort / Prefix Sum approach
    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        // Since array contains numbers between 0 and 100, we are taking array of 101
        // Covers indices 0 through 100
        int[] allNums = new int[101];

        // Result array. res[i] = count of numbers strictly smaller than nums[i].
        int[] res = new int[nums.length];

        // Capture number of occurrences of each integer in an array
        // Standard frequency count description.
        for (int num : nums) {
            allNums[num]++;
        }

        // Now, add number of prev instances to current value, this will store the count of numbers strictly smaller than current index
        // Running sum: allNums[i] now stores the count of numbers <= i
        for (int i = 1; i < 101; i++) {
            allNums[i] += allNums[i - 1];
        }


        // 3) Compute result
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                // If value is 0, no smaller numbers exist
                res[i] = 0;
            } else {
                // Otherwise, count of numbers strictly less than nums[i]
                res[i] = allNums[nums[i] - 1];
            }
        }
        return res;
    }
}
