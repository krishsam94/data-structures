public class Ex9CeilingOfNum {
    // Find Ceiling of a number - Ceiling of a number is the smallest integer greater than or equal to the given number
    // Array is a sorted array
    // We will be using Binary Search
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 9, 10, 12, 19, 27, 54};
        int target = 22;
        int ceil = findCeiling(arr, target);
        System.out.println("Ceiling of " + target + " is: " + ceil);
    }
    public static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int smallestCeilingNum = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] > target){
                end = mid - 1;
                // There is a possibility mid may be next greatest number, so I'm assigning mid to smallestCeilingNum
                // If there is no match of target, then smallestCeilingNum will be the next greatest number
                smallestCeilingNum = arr[mid];
            }  else {
                start = mid + 1;
            }
        }
        System.out.println(start); // We can also return index instead of storing in var
        return smallestCeilingNum;
    }
}

// ceil of 5.384 is 6 - Ceil means ceiling, think it as ceiling of home, so its higher than given val
// floor of 5.384 is 5 - Floor - think it as floor of home, so its lower than given val
