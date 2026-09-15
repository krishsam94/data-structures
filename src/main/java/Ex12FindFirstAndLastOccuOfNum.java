public class Ex12FindFirstAndLastOccuOfNum {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] nums2 = {7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9};
        int target = 8;
        int[] result = searchRange2(nums, target);
        System.out.println("First and Last Occurrence of " + target + " is: [" + result[0] + ", " + result[1] + "]");
        int[] result2 = searchRange2(nums2, target);
        System.out.println("First and Last Occurrence of " + target + " is: [" + result2[0] + ", " + result2[1] + "]");
    }
    // It has Time Complexity 2*O(log n) and Space Complexity O(1)
    // Constants can be ignored in Big O notation, so it is O(log n)
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] res = { -1, -1};
        // To find firstOccurenceIdx
        // We can make binary search as common function for both first & last occurence
        while (start <= end) {
            int mid = start + (end -start) / 2;
            if (nums[mid] == target) {
                end = mid - 1;
                res[0] = mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        start = 0;
        end = nums.length - 1;
        // To find lastOccurenceIdx
        while (start <= end) {
            int mid = start + (end -start) / 2;
            if (nums[mid] == target) {
                start = mid + 1;
                res[1] = mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }

    public static int[] searchRange2(int[] nums, int target) {
        int[] res = { -1, -1};
        res[0] = doBinarySearch(nums, target, true);
        if(res[0] != -1) {
            res[1] = doBinarySearch(nums, target, false);
        }

        return res;
    }

    private static int doBinarySearch(int[] nums, int target, boolean isFirstOccurence) {
        int start = 0;
        int end = nums.length - 1;
        int occurenceIdx = -1;
        while (start <= end) {
            int mid = start + (end -start) / 2;
            if (nums[mid] == target) {
                if (isFirstOccurence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                occurenceIdx = mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return occurenceIdx;
    }
}
