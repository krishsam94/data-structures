public class Ex27FindLargestInSplitArr {
    // https://leetcode.com/problems/split-array-largest-sum/
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
    static int splitArray(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > max) max = nums[i];
            sum += nums[i];
        }
        // if k is equal to length of arr, then max of array is answer
        if(k == nums.length) {
            return max;
        } else if(k == 1) {
            // if k is equal to 1, then summ of all is answer
            return sum;
        } else {
            // do Binary Search
            int start = max;
            int end = sum;
            int maxInArr = 0;
            while(start <= end) {
                int arrSum = 0;
                int pieces = 1;
                int mid = start + (end - start)/2;
                maxInArr = 0;
                int idx = 0;
                while(idx < nums.length) {
                    // Validate if arrSum + next num in array is less than mid, if yes add else create new piece
                    if((arrSum + nums[idx]) <= mid) {
                        arrSum += nums[idx];
                    } else {
                        // Assign maxSum to variable to retrieve answer later
                        if(arrSum > maxInArr) {
                            maxInArr = arrSum;
                        }
                        pieces++;
                        arrSum = nums[idx];
                    }
                    idx++;
                }
                if(arrSum > maxInArr) {
                    maxInArr = arrSum;
                }
                if (start == end) {
                    return maxInArr;
                } else if(pieces <= k) {
                    end = mid;
                } else {
                    start = mid+1;
                }
            }
            return maxInArr;
        }
    }
}
