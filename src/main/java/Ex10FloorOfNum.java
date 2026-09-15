public class Ex10FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 9, 10, 12, 19, 27, 54};
        int target = 53;
        int floor = findFloor(arr, target);
        System.out.println("Floor of " + target + " is: " + floor);
    }
    public static int findFloor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int largestFloorNum = Integer.MIN_VALUE;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (arr[mid] > target){
                end = mid - 1;
            }  else {
                largestFloorNum = arr[mid];
                start = mid + 1;
            }
        }
        System.out.println(end); // We can also return index instead of storing in var
        return largestFloorNum;
    }
}

// ceil of 5.384 is 6 - Ceil means ceiling, think it as ceiling of home, so its higher than given val
// floor of 5.384 is 5 - Floor - think it as floor of home, so its lower than given val
