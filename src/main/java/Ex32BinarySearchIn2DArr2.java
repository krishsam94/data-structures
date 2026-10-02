import java.util.Arrays;

public class Ex32BinarySearchIn2DArr2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 13, 15},
                {18, 20, 22, 34}
        };
        int[] res = do2dBinarySearch2(arr, 20);
        System.out.println(Arrays.toString(res));
    }
    // Approach 1
    static int[] do2dBinarySearch(int[][] arr, int target) {
        int[] res = {-1, -1};
        int row = 0;
        int col = arr[row].length-1;
        int maxRowToSearch = arr.length - 1;
        while(row <= maxRowToSearch) {
            if(arr[row][col] == target) {
                res[0] = row;
                res[1] = col;
                break;
            } else if(col > 0 && arr[row][col] > target) {
                // if last column contains greater than target, then all elements in that column is greatest
                // so eliminate that column
                col--;
                maxRowToSearch = row;
            } else {
                row++;
            }
        }
        return res;
    }

    // Approach 2: Recommended
    static int[] do2dBinarySearch2(int[][] matrix, int target) {
        // find row first
        int rowS = 0;
        int rowE = matrix.length-1;
        int maxCol = matrix[0].length-1;
        // Do binary search for row first
        while(rowS <= rowE){
            int mid = rowS + (rowE-rowS) / 2;
            if (target < matrix[mid][0]) {
                rowE = mid - 1;
            } else if (target > matrix[mid][maxCol]) {
                rowS = mid + 1;
            } else {
                // do binary search in column wise
                return binarySearch(matrix[mid], target, mid);
            }
        }
        return new int[]{-1, -1};
    }
    static int[] binarySearch(int[] arr, int target, int rowNo) {
        int[] res = {-1, -1};
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end -start) / 2;
            if (arr[mid] == target) {
                res[0] = rowNo;
                res[1] = mid;
                return res;
            }
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return res;
    }
}
