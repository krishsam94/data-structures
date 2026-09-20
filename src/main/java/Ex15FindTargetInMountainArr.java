public class Ex15FindTargetInMountainArr {
    // https://leetcode.com/problems/find-in-mountain-array/description/
    public static void main(String[] args) {
        MountainArray mountainArray = new MountainArray();
        System.out.println(findInMountainArray(1, mountainArray));
    }
    static int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() -1;
        // find largest number first
        while(start != end) {
            int mid = start + (end - start)/2;
            // Array is decreasing
            if(mountainArr.get(mid) > mountainArr.get(mid+1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        int largestIdx = start;
        if(mountainArr.get(largestIdx) == target) return largestIdx;
        // try to find element from increasing order.
        start = 0;
        end = largestIdx - 1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) == target) {
                return mid;
            } else if(mountainArr.get(mid) > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        // If not found in increasing order, search in decreasing order
        // Write binary search for descending array
        start = largestIdx + 1;
        end = mountainArr.length() -1;
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(mountainArr.get(mid) == target) {
                return mid;
            } else if(mountainArr.get(mid) > target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
}

class MountainArray {
    private final int[] arr = {0,5,3,1};
    public int get(int idx) {
        return arr[idx];
    }
    public int length() {
        return arr.length;
    }
}


