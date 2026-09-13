import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://www.geeksforgeeks.org/dsa/find-pythagorean-triplet-in-an-unsorted-array/
public class Ex6TripletsInArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 5};
        int[] arr2 = {10, 4, 6, 12, 5};
        int n = arr.length;
        if (findTriplet3(arr, n))
            System.out.println("Arr 1 Yes");
        else
            System.out.println("Arr 1 No");

        int n2 = arr2.length;
        if (findTriplet3(arr2, n2))
            System.out.println("Arr 2 Yes");
        else
            System.out.println("Arr 2 No");
    }
    // Approach 1: compare sum of square of every 2 element with square of third - O(n^3) Time and O(1) Space
    static boolean findTriplet(int[] arr, int arrSize) {
        // compare sum of square of every 2 element with square of third
        for (int i = 0; i < arrSize; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                for (int k = j + 1; k < arrSize; k++) {
                    int sqOfI = arr[i] * arr[i];
                    int sqOfJ = arr[j] * arr[j];
                    int sqOfK = arr[k] * arr[k];
                    if (sqOfI + sqOfJ == sqOfK || sqOfI + sqOfK == sqOfJ || sqOfK + sqOfJ == sqOfI)
                        return true;
                }
            }
        }
        return false;
    }

    // Approach 2: sort the array first and compare c^2 with start and end - O(n^2) Time and O(1) Space
    static boolean findTriplet2(int[] arr, int arrSize) {
        Arrays.sort(arr);
        for (int i = 0; i < arrSize; i++)
            arr[i] = arr[i] * arr[i];
        for (int i = arrSize - 1; i >= 1; i--) {
            int start = 0;
            int end = i - 1;
            while (start < end) {
                if (arr[start] + arr[end] == arr[i])
                    return true;
                if (arr[start] + arr[end] < arr[i])
                    start++;
                else
                    end--;
            }
        }
        return false;
    }
    // Approach 3 : Store square of results in Hashset and use contains to verify results - O(n^2) Time and O(n) Space
    static boolean findTriplet3(int[] arr, int arrSize) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arrSize; i++) {
            set.add(arr[i] * arr[i]);
        }
        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                int sum = arr[i] * arr[i] + arr[j] * arr[j];
                if (set.contains(sum))
                    return true;
            }
        }
        return false;
    }
}
